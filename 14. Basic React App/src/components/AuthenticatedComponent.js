import React, {Component, PropTypes} from 'react';
import AuthenticationService from '../services/AuthenticationService';

class AuthenticatedComponent extends Component {
    componentWillMount() {
        if (!AuthenticationService.isLoggedIn()) {
            this.context.router.push('/login');
        }
    }

    render() {
        return (
            <div>
                {this.props.children}
            </div>
        );
    }
}

AuthenticatedComponent.contextTypes = {
    router: PropTypes.object.isRequired
}

export default AuthenticatedComponent;
