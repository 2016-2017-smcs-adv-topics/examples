import React, {Component} from 'react';
import THREE, {Vector3, JSONLoader} from 'three';
import {ProgressBar} from 'react-bootstrap';
import Render from '../components/Render';
import modelMovementReducer from '../render-reducers/modelMovementReducer';

export default class RenderContainer extends Component {
    constructor() {
        super();

        this.state = {
            cameraPosition: new Vector3(0, 0, 3),
            lookAt: new Vector3(0, 0, 0)
        }
    }

    componentDidMount() {
        this.mounted = true;

        window.THREE = THREE;

        const loader = new JSONLoader();
        loader.load(
            'assets/' + this.props.model + '.json',
            geometry => this.setState({geometry: geometry}),
            error => console.log(error)
        )

        this.requestRenderLoop();
    }

    componentWillUnMount() {
        this.mounted = false;
        this.cancelRenderLoop();
    }

    requestRenderLoop() {
        this.reqAnimId = window.requestAnimationFrame(this.renderLoop.bind(this));
    }

    renderLoop(time) {
        if (!this.mounted) {
            return;
        }

        this.requestRenderLoop();

        const oldState = this.state;
        const newState = modelMovementReducer(oldState, time);
        this.setState(newState);
    }

    cancelRenderLoop() {
        window.cancelAnimationFrame(this.reqAnimId);
    }

    render() {
        const width = 600;
        const height = 400;

        const {
            cameraPosition,
            geometry,
            lookAt,
            modelPosition,
            modelRotation
        } = this.state;

        return (
            <div>
                {geometry ?
                    <Render
                        width={width}
                        height={height}
                        cameraPosition={cameraPosition}
                        lookAt={lookAt}
                        geometry={geometry}
                        model={this.props.model}
                        modelPosition={modelPosition}
                        modelRotation={modelRotation}
                    /> :
                    <ProgressBar active={true} now={100} striped={true} label="Loading&hellip;"/>
                }
            </div>
        );
    }
}
