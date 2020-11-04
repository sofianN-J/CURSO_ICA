<template>
  <div id="app">
    <CompChino></CompChino>
    <img alt="Vue logo" src="./assets/logo.png">
    <HolaComp msg="Bienvenido a tu VUE.JS App"/>
  </div>
</template>

<script>
import HolaComp from './components/HolaMundo.vue'
//este es compHeader el import se puede llamar como sea
import CompChino from './components/CompHeader'
export default {
  name: 'App',
  components: {
    HolaComp,
    CompChino
  }
}
</script>

<style lang="scss">
@import "./assets/estilo.css";
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
