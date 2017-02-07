import React, {Component} from "react";

export default class Thingie extends Component {
    render() {
        return (
            <div className="container">
                <p>I am a Thingie and my ID is {this.props.params.id}</p>
            </div>
        );
    }
}
