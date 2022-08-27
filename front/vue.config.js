const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  devServer: {
    proxy: {
      "^/api": {
        target: "http://backend:8090",
        changeOrigin: true,
      },
    },
  },
});
