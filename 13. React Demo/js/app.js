/* define a ReactDemo as an extension of a React component that just renders as a paragraph of filler text -- it could be more involved! */
class ReactDemo extends React.Component {
    render() {
        return React.createElement(
            'p',
            null,
            'The quick brown fox jumps over the lazy dog.'
        );
    }
}

/* trigger the ReactDOM framework to apply our code to the page DOM interactively, attaching our ReactDemo component to the tag on the page dom with the id `react-app` */
ReactDOM.render(React.createElement(ReactDemo, null), document.getElementById('react-app'));