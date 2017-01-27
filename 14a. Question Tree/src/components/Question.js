import React, {Component} from 'react';
import {Link} from 'react-router';
import Answers from './Answers';

import DataSource from '../services/DatabaseService';

export default class Question extends Component {
    render() {
        var question = DataSource.getQuestion(this.props.params.id);
        return (
            <div>
                <h3>{question}</h3>
                <Answers question={this.props.params.id}/>
                <Link to="/">Start over</Link>
            </div>
        );
    }
}
