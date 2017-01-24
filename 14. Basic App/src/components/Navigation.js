import React, {Component} from 'react';
import {Navbar, Nav, NavItem, NavDropdown, MenuItem} from 'react-bootstrap'
import {LinkContainer} from 'react-router-bootstrap'
import LoginStore from '../stores/LoginStore'

export default class Navigation extends Component {
    render() {
        return (
            <Navbar>
                <Navbar.Header>
                    <Navbar.Brand>
                        <a href="/">React App</a>
                    </Navbar.Brand>
                </Navbar.Header>
                <Nav>
                    <LinkContainer to="/about">
                        <NavItem eventKey={2}>About</NavItem>
                    </LinkContainer>
                    <NavDropdown eventKey={3} title="Thingies" id="navbar-thingies-dropdown">
                        <LinkContainer to="/thingies/flibberty-gibbet">
                            <MenuItem eventKey={3.1}>Flibberty-Gibbet</MenuItem>
                        </LinkContainer>
                        <LinkContainer to="/thingies/whatchamacallit">
                            <MenuItem eventKey={3.2}>Whatchamacallit</MenuItem>
                        </LinkContainer>
                        <LinkContainer to="/thingies/whatsit">
                            <MenuItem eventKey={3.3}>Whatsit</MenuItem>
                        </LinkContainer>
                    </NavDropdown>
                    {(LoginStore.isLoggedIn() ?
                        <LinkContainer to="/logout">
                            <NavItem>Log Out</NavItem>
                        </LinkContainer>
                            :
                        <LinkContainer to="/login">
                            <NavItem>Log In</NavItem>
                        </LinkContainer>
                    )}
                </Nav>
            </Navbar>
        );
    }
}