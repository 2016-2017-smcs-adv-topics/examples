class AuthenticationService {
    constructor() {
        this._user = null;
        this._token = null;
    }

    get user() {
        return this._user;
    }

    get token() {
        return this._token;
    }

    isLoggedIn() {
        return !!this._user;
    }

    login(user, password) {
        if (user === 'joe@example.com' && password === 'password1') {
            this._user = user;
            this._token = 'we-have-a-token!';
            this.context.router.pop();
        }
    }
}

export default new AuthenticationService()
