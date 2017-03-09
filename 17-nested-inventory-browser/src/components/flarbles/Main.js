import React, {Component} from 'react';
import {Col} from 'react-bootstrap';
import FlarbleList from './FlarbleList';
import Flarble from './Flarble';

export default class Main extends Component {
    render() {
        var detail;
        if (this.props.params.id !== undefined) {
            detail = <Flarble params={{id: this.props.params.id}}/>;
        } else {
            detail = <p>Pick a flarble.</p>;
        }
        return (
            <div>
                <Col xs={9}>
                    {detail}
                </Col>
                <Col xs={3}>
                    <FlarbleList/>
                </Col>
            </div>
        );
    }
}
