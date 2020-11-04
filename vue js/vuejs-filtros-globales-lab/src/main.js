import Vue from 'vue'
import App from './App.vue'
import './filtro-global';

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
