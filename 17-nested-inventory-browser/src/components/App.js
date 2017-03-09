import React, {Component} from 'react';
import Navigation from './Navigation';

import '../css/App.css';

export default class App extends Component {
    render() {
        return (
            <div>
                <Navigation/>
                <div className="container">
                    {this.props.children}
                </div>
            </div>
        );
    }
}
