module.exports = {
  devOptions: {
    open: "none",
    port: 3000
  },
  plugins: [
    [
      '@snowpack/plugin-run-script',
      {
        cmd: 'lessc ./src/main/resources/less/style.less public/style.css --source-map-inline', // production build command
        // watch: 'sass --watch src/css:public/css --no-source-map', // (optional) dev server command
      },
    ],
  ],
  alias: {
    "@resources": "./src/main/resources/",
    "@images": "./src/main/resources/images/",
    "@sjs": "./target/scala-2.13"
  }
}
