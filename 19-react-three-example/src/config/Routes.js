/*
 * Define our URL path routing table -- which is not very complicated for this app! One interesting extension of this
 * would be to define routes to render different models…
 */

import React, {Component} from 'react';
import {Router, Route, browserHistory} from 'react-router';

import App from "../components/App";

export default class Routes extends Component {
    render() {
        return (
            <Router history={browserHistory}>
                <Route path="/" component={App} />
            </Router>
        );
    }
}
