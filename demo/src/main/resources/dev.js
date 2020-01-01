import "./theme/semantic.less";
import "./less/style.less";
import "react-semantic-toasts/styles/react-semantic-alert.css";

import App from "sjs/demo-fastopt.js";
import React from "react";

// Enable why did you update plugin
if (process.env.NODE_ENV !== "production") {
  const { whyDidYouUpdate } = require("why-did-you-update");
  whyDidYouUpdate(React, {
    exclude: ["Draggable", "DraggableCore", "AutoSizer"]
  });
}

if (module.hot) {
  module.hot.accept();
  App.SUIMain.main();
}
