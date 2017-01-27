import React, {Component} from 'react';
import Answer from './Answer';

import DataSource from '../services/DatabaseService';

export default class Answers extends Component {
    render() {
        var answers = DataSource.getAnswers(this.props.question);
        return (
            (answers !== undefined ?
                <ul>
                    {answers.map((answer) => <Answer key={answer} id={answer}/>)}
                </ul>
                : <ul/>
            )
        );
    }
}
