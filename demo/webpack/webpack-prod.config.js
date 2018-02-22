const Path = require("path");
const Merge = require("webpack-merge");

const CleanWebpackPlugin = require("clean-webpack-plugin");
const ExtractTextPlugin = require("extract-text-webpack-plugin");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const CompressionPlugin = require("compression-webpack-plugin");
const UglifyJSPlugin = require("uglifyjs-webpack-plugin");
const Webpack = require("webpack");
const OptimizeCSSAssetsPlugin = require("optimize-css-assets-webpack-plugin");
const cssnano = require("cssnano");

const ProdConfig = new Webpack.DefinePlugin({
  "process.env": {
    NODE_ENV: JSON.stringify("production")
  }
});

const Common = require("./webpack.common.js");
const publicFolderName = "../docs";

const WebApp = Merge(Common.Web, {
  output: {
    filename: "[name].js",
    path: Path.resolve(Common.rootDir, publicFolderName),
    publicPath: "/scalajs-react-semantic-ui/",
    libraryTarget: "umd"
  },
  entry: {
    demo: Path.resolve(Common.resourcesDir, "./prod.js")
  },
  module: {
    rules: [
      {
        use: ExtractTextPlugin.extract({
          use: ["css-loader", "less-loader"]
        }),
        test: /\.less$/
      }
    ]
  },
  plugins: [
    new Webpack.DefinePlugin({
      "process.env": {
        NODE_ENV: JSON.stringify("production")
      }
    }),
    new OptimizeCSSAssetsPlugin({
      cssProcessor: cssnano,
      cssProcessorOptions: {
        discardComments: {
          removeAll: true
        },
        // Run cssnano in safe mode to avoid
        // potentially unsafe transformations.
        safe: true
      },
      canPrint: false
    }),
    new Webpack.optimize.UglifyJsPlugin(),
    new HtmlWebpackPlugin({
      filename: "index.html",
      chunks: ["demo"],
      template: Path.resolve(Common.resourcesDir, "./prod.html"),
      favicon: Path.resolve(Common.resourcesDir, "./images/favicon.ico")
    }),
    new CleanWebpackPlugin([publicFolderName], { verbose: false })
  ]
});

console.log(WebApp);

module.exports = WebApp;
