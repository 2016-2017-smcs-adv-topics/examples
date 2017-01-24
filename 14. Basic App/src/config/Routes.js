import React, { Component } from 'react'
import { Router, Route, browserHistory, IndexRoute } from 'react-router'

import App from '../components/App'
import Home from '../components/Home'
import About from '../components/About'
import Thingies from '../components/Thingies'
import Login from '../components/Login'
import Logout from '../components/Logout'

export default class Routes extends Component {
    render() {
        return (
            <Router history={browserHistory}>
                <Route path="/" component={App}>
                    <IndexRoute component={Home}/>
                    <Route path="login" component={Login}/>
                    <Route path="logout" component={Logout}/>
                    <Route path="thingies/:thingieName" component={Thingies}/>
                    <Route path="about" component={About}/>
                </Route>
            </Router>
        )
    }
}

