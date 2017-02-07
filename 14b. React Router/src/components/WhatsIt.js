import React, {Component} from "react";

export default class WhatsIt extends Component {
    render() {
        return (
            <div className="container">
                <p>I am a WhatsIt and my ID is {this.props.params.identifier}</p>
            </div>
        );
    }
}
