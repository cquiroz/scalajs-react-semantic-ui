const Path = require("path");
const Merge = require("webpack-merge");
const ExtractTextPlugin = require("extract-text-webpack-plugin");

const generatedConfig = require("./scalajs.webpack.config");

const rootDir = Path.resolve(__dirname, "../../../..");
const resourcesDir = Path.resolve(rootDir, "src/main/resources");

const ScalaJs = Merge(generatedConfig, {
  resolve: {
    alias: {
      resources: resourcesDir
    }
  },
  module: {
    rules: [
      {
        test: /\.png$/,
        loader: "file-loader",
        options: {
          name: "[name].[hash].[ext]"
        }
      },
      // this handles .less translation
      {
        use: ExtractTextPlugin.extract({
          use: ["css-loader", "less-loader"]
        }),
        test: /\.less$/
      }
    ]
  }
});

const Web = {
  devtool: "source-map",
  resolve: {
    alias: {
      resources: resourcesDir,
      node_modules: Path.resolve(__dirname, "node_modules"),
      "../../theme.config$": Path.join(resourcesDir, "theme/theme.config")
    }
  },
  module: {
    rules: [
      {
        test: /\.jpe?g$|\.gif$|\.png$|\.ttf$|\.eot$|\.svg$/,
        use: "file-loader?name=[name].[ext]?[hash]"
      },
      {
        test: /\.woff(2)?(\?v=[0-9]\.[0-9]\.[0-9])?$/,
        loader: "url-loader?limit=10000&mimetype=application/fontwoff"
      }
    ]
  },
  plugins: [
    new ExtractTextPlugin({
      filename: "[name].[contenthash].css"
    })
  ]
};

module.exports = {
  rootDir: rootDir,
  resourcesDir: resourcesDir,
  Web: Web,
  ScalaJs: ScalaJs
};
