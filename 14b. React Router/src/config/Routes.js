import React, {Component} from 'react';
import {Router, Route, browserHistory,IndexRoute} from 'react-router';

import App from "../components/App";
import Thingie from "../components/Thingie";
import WhatsIt from "../components/WhatsIt";
import Thingamabob from "../components/Thingamabob";

export default class Routes extends Component {
    render() {
        return (
            <Router history={browserHistory}>
                <Route path="/" component={App}>
                    <IndexRoute to="/"/>
                    <Route path="thingie/:id" component={Thingie}/>
                    <Route path="whatsit/:identifier" component={WhatsIt}/>
                </Route>
                <Route path="/thingamabob/:id" component={Thingamabob}/>
            </Router>
        );
    }
}
