import { defineConfig } from "vite";
import reactRefresh from "@vitejs/plugin-react-refresh";
import path from 'path';
import fs from 'fs';

const sjs = path.resolve(__dirname, "target/scala-2.13/demo-fastopt/");
const themeConfig = path.resolve(__dirname, "src/main/webapp/theme/theme.config");
const themeSite = path.resolve(__dirname, "src/main/webapp/theme/site");

// https://vitejs.dev/config/
export default defineConfig({
  root: "src/main/webapp",
  resolve: {
    alias: [
      {
        find:"@sjs",
        replacement: sjs
      },
      {
        find: "../../theme.config",
        replacement: themeConfig
      },
      {
        find: "theme/site",
        replacement: themeSite
      }
    ]
  },
  server: {
    https: {
      key: fs.readFileSync('server.key'),
      cert: fs.readFileSync('server.cert')
    },
    watch: {
      ignored: [function ignoreThisPath(_path) {
        const sjsIgnored = _path.includes("/target/stream") || _path.includes("/zinc/") || _path.includes('/classes')
        // console.log(_path);
        // console.log(sjsIgnored)
        return sjsIgnored;
      }],
    },
  },
  plugins: [reactRefresh()],
});
