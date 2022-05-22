import { createApp } from 'vue';
import Ant from 'ant-design-vue';
import IO from 'axios'
import 'ant-design-vue/dist/antd.css';
import App from './App.vue';

const app = createApp(App);

const api = IO.create({
  baseURL: '/api',
  withCredentials: true,
  timeout: 10000
});

app.use(Ant);
app.config.globalProperties.api = api;
app.mount('#app');



