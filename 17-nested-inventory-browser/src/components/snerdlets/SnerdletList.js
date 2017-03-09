import React, {Component} from 'react';
import {Button} from 'react-bootstrap'
import {LinkContainer} from 'react-router-bootstrap'
import db from '../../services/DatabaseService'

export default class SnerdletList extends Component {
    render() {
        var items = db.getSnerdlets();
        return (
            <div>
                {items.map(((item) => <LinkContainer key={item.id} to={"/snerdlets/" + item.id}>
                    <Button className="col-xs-12">{item.title}</Button>
                </LinkContainer>))}
            </div>
        );
    }
}
