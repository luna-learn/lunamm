import Axios from 'axios'

const api = Axios.create({
  baseURL: '/api',
  withCredentials: true,
  timeout: 10000
});

api.interceptors.request.use(config => {
  // 将配置完成的config对象返回出去 如果不返回 请求讲不会进行
  return config;
}, err => {
  // 请求发生错误时的相关处理 抛出错误
  return Promise.reject(err);
});

api.interceptors.response.use(res => {
  // 一般在这里处理请求成功后的错误状态码 例如状态码是500，404，403
  // console.log(res)
  return Promise.resolve(res)
}, err => {
  // 服务器响应发生错误时的处理
  return Promise.reject(err)
})

export default api