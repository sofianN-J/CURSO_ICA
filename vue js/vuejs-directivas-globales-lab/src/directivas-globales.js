import Vue from 'vue'

Vue.directive('blink', {
  bind(el) {
    const color = 'black';
    const intervalId = setInterval(() => {
      el.style.backgroundColor = el.style.backgroundColor === 'white' ? color : 'white';
      console.log('Se pinta!')
    }, 300)
    el.dataset.intervalId = intervalId;
  },
  unbind(el) {
    clearInterval(el.dataset.intervalId);
  }
})