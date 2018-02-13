import "node_modules/semantic-ui-less/semantic.less";
import "./less/style.less";

var App = require("root/demo-fastopt.js");

console.log("here");
console.log(module.hot);
if (module.hot) {
  console.log("reload?");
  module.hot.accept();
  App.react.semanticui.demo.SUIMain.main();
}
