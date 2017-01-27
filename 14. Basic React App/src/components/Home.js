import React, { Component } from 'react';
import AuthenticationService from '../services/AuthenticationService';

export default class Home extends Component {
    render() {
        return (
            <div>
                <p>{(AuthenticationService.isLoggedIn() ?
                    'You are logged in' : 'You are not logged in'
                )}</p>
            </div>
        );
    }
}
