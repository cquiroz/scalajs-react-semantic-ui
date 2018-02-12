// import "node_modules/semantic-ui-less/semantic.less";
import "./less/style.less";

console.log("here");
console.log(module.hot);
if (module.hot) {
  console.log("reload?");
  module.hot.accept();
}
react.semanticui.demo.SUIMain.main();
