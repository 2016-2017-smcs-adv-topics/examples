import React, {Component} from 'react';
import db from '../../services/DatabaseService';

export default class Flarble extends Component {
    render() {
        var item = db.getFlarble(this.props.params.id);
        return (
            <div>
                <h1>{item.title}</h1>

                <p>{item.description}</p>
            </div>
        );
    }
}
