import React, {Component} from 'react';
import {Router, Route, browserHistory, IndexRedirect} from 'react-router';

import App from '../components/App';
import FlarbleMain from '../components/flarbles/Main';
import SnerdletMain from '../components/snerdlets/Main';

export default class Routes extends Component {
    render() {
        return (
            <Router history={browserHistory}>
                <Route path="/" component={App}>
                    <IndexRedirect to="/flarbles/0"/>
                    <Route path="flarbles" component={FlarbleMain}/>
                    <Route path="flarbles/:id" component={FlarbleMain}/>
                    <Route path="snerdlets" component={SnerdletMain}/>
                    <Route path="snerdlets/:id" component={SnerdletMain}/>
                </Route>
            </Router>
        );
    }
}

