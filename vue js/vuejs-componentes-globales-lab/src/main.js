import Vue from 'vue'
import App from './App.vue'
import CmpGlobal from './components/CmpGlobal.vue';

Vue.config.productionTip = false

Vue.component('CmpGlobal', CmpGlobal);

new Vue({
  render: h => h(App),
}).$mount('#app')
