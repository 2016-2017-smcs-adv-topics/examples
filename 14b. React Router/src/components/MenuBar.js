import React, {Component} from "react";
import {Nav, NavItem} from "react-bootstrap";
import {LinkContainer} from "react-router-bootstrap";

export default class MenuBar extends Component {
    render() {
        return(
            <Nav>
                <LinkContainer to="/thingie"><NavItem>Thingies</NavItem></LinkContainer>
                <NavItem>WhatsIts</NavItem>
            </Nav>
        );
    }
}
