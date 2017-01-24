import React, { Component } from 'react'
import AuthenticatedComponent from './AuthenticatedComponent'

export default AuthenticatedComponent(class Thingies extends Component {
    render() {
        return (
            <div>
                <h1>{this.props.params.thingieName} <small>a thingie</small></h1>
                <p>Hello {this.props.user}.</p>
            </div>
        )
    }
})
