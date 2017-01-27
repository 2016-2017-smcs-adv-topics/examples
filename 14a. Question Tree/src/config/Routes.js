import React, {Component} from 'react';
import {Router, Route, browserHistory, IndexRedirect} from 'react-router';

import App from '../components/App';
import Question from '../components/Question';

export default class Routes extends Component {
    render() {
        return (
            <Router history={browserHistory}>
                <Route path="/" component={App}>
                    <IndexRedirect to="/question/1"/>
                    <Route path="question/:id" component={Question}/>
                </Route>
            </Router>
        );
    }
}

