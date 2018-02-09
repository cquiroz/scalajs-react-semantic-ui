const Path = require("path");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const Webpack = require("webpack");
const Merge = require("webpack-merge");

const Common = require("./webpack.common.js");

const ScalaJs = Merge(Common.ScalaJs, {
  output: {
    publicPath: "/"
  }
});

const Web = Merge(Common.Web, {
  output: {
    publicPath: "/"
  },
  module: {
    rules: [
      {
        test: /\.scss$/,
        use: [
          "style-loader",
          "css-loader",

          "resolve-url-loader",
          "sass-loader?sourceMap"
        ]
      }
    ]
  },
  devServer: {
    hot: true,
    contentBase: [__dirname, Common.rootDir]
  },
  plugins: [
    new Webpack.HotModuleReplacementPlugin(),
    new HtmlWebpackPlugin({
      filename: "index.html",
      chunks: ["app"],
      template: Path.resolve(Common.resourcesDir, "./index.html"),
      favicon: Path.resolve(Common.resourcesDir, "./images/favicon.ico")
    })
  ]
});

module.exports = Merge(ScalaJs, Web);
