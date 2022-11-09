import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import ElementPlus from 'element-plus'

axios.defaults.withCredentials = true
axios.defaults.headers.post['Content-Type'] = "application/json;charset=UTF-8"
// axios.defaults.baseURL = '10.176.26.2:8080';

// var Vue = createApp(App).use(router)
// Vue.config.productionTip = false
// Vue.mount('#app')

createApp(App).use(router).use(ElementPlus).mount('#app')