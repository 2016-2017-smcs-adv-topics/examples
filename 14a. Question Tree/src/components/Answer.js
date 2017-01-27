import React, {Component} from 'react';
import {Link} from 'react-router';

import DataSource from '../services/DatabaseService';

export default class Answer extends Component {
    render() {
        var answer = DataSource.getAnswer(this.props.id);
        return (
            <li>
                <Link to={`/question/${answer.question}`}>
                    {answer.text}
                </Link>
            </li>
        );
    }
}
