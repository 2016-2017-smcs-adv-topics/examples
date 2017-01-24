import React, {Component} from 'react';
import {FormGroup, ControlLabel, FormControl, Button, Row, Col} from 'react-bootstrap';

import AuthenticationService from '../services/AuthenticationService'

/**
 * A Login component to allow users to authenticate to the app
 */
export default class Login extends Component {
    constructor() {
        super();
        this.state = {
            user: 'joe@example',
            password: 'password1'
        }
    }

    handleLogin(event) {
        event.preventDefault();
        AuthenticationService.login(this.state.user, this.state.password)
            .catch(function (err) {
                alert("There's an error logging in");
                console.log("Error logging in", err);
            });
    }

    /**
     * Render the component
     * @returns {XML}
     */
    render() {
        return (
            <div className="container">
                <div className="page-header">
                    <h1>Log In</h1>
                </div>
                <form>
                    <FormGroup>
                        <Row>
                            <Col xs={2}>
                                <ControlLabel>Email</ControlLabel>
                            </Col>
                            <Col xs={5}>
                                <FormControl value={this.state.user}
                                             onChange={function(event) {
                                                 this.setState({
                                                     user: event.target.value
                                                 });
                                             }}
                                             type="email"
                                             placeholder="user@domain.com"/>
                            </Col>
                        </Row>
                    </FormGroup>
                    <FormGroup>
                        <Row>
                            <Col xs={2}>
                                <ControlLabel>Password</ControlLabel>
                            </Col>
                            <Col xs={5}>
                                <FormControl value={this.state.password}
                                             onChange={(e) => this.setState({password: e.target.value}) }
                                             type="password"/>
                            </Col>
                        </Row>
                    </FormGroup>
                    <Col xsOffset={2}>
                        <Button type="submit" bsStyle="primary" onSubmit={this.handleLogin.bind(this)}>Log In</Button>
                    </Col>
                </form>
            </div>
        );
    }
}