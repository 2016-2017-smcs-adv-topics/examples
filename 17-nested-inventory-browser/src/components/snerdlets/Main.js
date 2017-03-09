import React, {Component} from 'react';
import {Col} from 'react-bootstrap';
import SnerdletList from './SnerdletList';
import Snerdlet from './Snerdlet';

export default class Main extends Component {
    render() {
        var detail;
        if (this.props.params.id !== undefined) {
            detail = <Snerdlet params={{id: this.props.params.id}}/>;
        } else {
            detail = <p>Choose a snerdlet.</p>;
        }
        return (
            <div>
                <Col xs={3}>
                    <SnerdletList/>
                </Col>
                <Col xs={9}>
                    {detail}
                </Col>
            </div>
        );
    }
}
