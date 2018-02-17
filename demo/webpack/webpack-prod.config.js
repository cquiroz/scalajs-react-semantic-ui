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
console.log(Common.rootDir);

function Web(extractSass) {
  return Merge(Common.Web, {
    output: {
      filename: "[name].js",
      path: Path.resolve(Common.rootDir, publicFolderName),
      libraryTarget: "window"
    },
    resolve: {
      alias: {
        scalajs: Path.resolve(__dirname)
      }
    },
    module: {
      rules: [
        {
          test: /\.scss$/,
          use: extractSass.extract({
            use: [
              { loader: "css-loader", options: { sourceMap: true } },
              { loader: "resolve-url-loader", options: { sourceMap: true } },
              { loader: "sass-loader", options: { sourceMap: true } }
            ],
            fallback: "style-loader"
          })
        },
        {
          test: /\.js$/,
          use: ["source-map-loader"],
          enforce: "pre"
        }
      ]
    },
    plugins: [
      ProdConfig,
      extractSass,
      new UglifyJSPlugin({
        sourceMap: true
      }),
      new CompressionPlugin({
        asset: "[path].gz[query]",
        algorithm: "gzip",
        test: /\.js$|\.css$|\.html$/,
        threshold: 10240,
        minRatio: 0.8
      })
    ]
  });
}

const WebApp = Merge(Common.Web, {
  output: {
    filename: "[name].js",
    path: Path.resolve(Common.rootDir, publicFolderName),
    // publicPath: "./",
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
    })
    // new CleanWebpackPlugin([publicFolderName], { verbose: false })
  ]
});

console.log(WebApp);

module.exports = WebApp;
