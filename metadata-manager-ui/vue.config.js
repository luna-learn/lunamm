import { defineConfig } from '@vue/cli-service'
const path = require('path');

function resolve(dir) {
  return path.join(__dirname, dir);
}

module.exports = defineConfig({
  transpileDependencies: true,
  chainWebpack: (config) => {
    config.resolve.alias
      .set('@', resolve('src'))
  }
})

/*exports = {
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080/', //接口域名
        changeOrigin: true,               //是否跨域
        ws: true,                         //是否代理 websockets
        secure: true,                     //是否https接口
        pathRewrite: {                    //路径重置
          '^/api': ''
        }
      }
    }
  }
};*/
