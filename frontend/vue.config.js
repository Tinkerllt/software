const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  devServer: {
      proxy: {
          '/api/v1/user': {
            target: "http://127.0.0.1:8080",
            changeOrigin: true
          },
          '/api/v1/tavel': {
            target: "http://127.0.0.1:8081",
            changeOrigin: true
          },
          '/api/v1/admin': {
            target: "http://127.0.0.1:8082",
            changeOrigin: true
          }
      }
  }
}