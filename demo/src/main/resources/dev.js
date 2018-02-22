import "node_modules/semantic-ui-less/semantic.less";
import "./less/style.less";

import App from "root/demo-fastopt.js";

if (module.hot) {
  module.hot.accept();
  App.react.semanticui.demo.SUIMain.main();
}
