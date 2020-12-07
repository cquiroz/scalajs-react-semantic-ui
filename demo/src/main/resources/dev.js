// import "@resources/theme/semantic.less";
// import "@resources/less/style.less";
// import "react-semantic-toasts/styles/react-semantic-alert.css";
//
//
import { SUIMain } from "@sjs/demo-fastopt/main.js";
import React from "react";
console.log(SUIMain);
//
// // Enable why did you update plugin
// if (process.env.NODE_ENV !== "production") {
//   const { whyDidYouUpdate } = require("why-did-you-update");
//   whyDidYouUpdate(React, {
//     exclude: ["Draggable", "DraggableCore", "AutoSizer"]
//   });
// }
//
if (import.meta.hot) {
  import.meta.hot.accept();
  SUIMain.main();
}
