# React Demo

`index.html` defines the structure of the starting DOM page. This loads the JavaScript framework dependencies in order (JQuery, Bootstrap, React) and then finally our own app.

`src/app.jsx` is our JSX source code that defines our app and triggers the ReactDOM to start its operation.

`js/app.js` is transpiled JavaScript created by the Babel transpiler (automagically, in my case, by the `language-babel` package in Atom, but your IDE needs to be configured to do this for you). `.babelrc` defines the Babel transpiling settings used here (in this case, a default React environment). `.languagebabel` marks the root of the project directory as the root of the Babel app for `language-babel`.
