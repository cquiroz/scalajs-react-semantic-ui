import "node_modules/semantic-ui-less/semantic.less";
console.log(module.hot);
if (module.hot) {
  console.log("reload?");
  module.hot.accept();
}
react.semanticui.demo.SUIMain.main();
