import React, {Component} from 'react';
import {Navbar, NavItem, Nav} from 'react-bootstrap';
import {LinkContainer} from 'react-router-bootstrap';

export default class Navigation extends Component {
    render() {
        return (
            <Navbar>
                <Navbar.Header>
                    <Navbar.Brand>
                        <a href="/">Demo</a>
                    </Navbar.Brand>
                </Navbar.Header>
                <Nav>
                    <LinkContainer to="/flarbles">
                        <NavItem eventKey={1}>Flarbles</NavItem>
                    </LinkContainer>
                    <LinkContainer to="/snerdlets">
                        <NavItem eventKey={2}>Snerdlets</NavItem>
                    </LinkContainer>
                </Nav>
            </Navbar>
        );
    }
}
