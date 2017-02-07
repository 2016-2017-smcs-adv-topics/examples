import React, {Component} from "react";

export default class Thingamabob extends Component {
    render() {
        return (
            <div className="container">
                <p>I am a Thingamabob and my ID is {this.props.params.id}</p>
            </div>
        );
    }
}
