import React from 'react';
import AuthenticatedComponent from './AuthenticatedComponent';

export default class Thingies extends AuthenticatedComponent {
    render() {
        return (
            <div>
                <h1>{this.props.params.thingieName}
                    <small>a thingie</small>
                </h1>
            </div>
        )
    }
}
