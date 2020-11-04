<template>
  <div>
    <a href="https://vuejs.org" target="_blank" @click.prevent="mostrarEnlace">Ir a la página oficial de Vue</a>
    <div id="caja1" @click="mostrarCajaPulsada('Caja 1')">
      <div id="caja2" @click.stop="mostrarCajaPulsada('Caja 2')">
      </div>
    </div>
    <Texto @mouseover.native="mostrarTexto" />
  </div>
</template>

<script>
import Texto from './Texto';

export default {
  components: {
    Texto
  },
  methods: {
    mostrarEnlace(e) {
      alert('Interceptada navegación a ' + e.target.href);
    },
    mostrarCajaPulsada(textoCaja) {
      alert('Has pulsado sobre ' + textoCaja)
    },
    mostrarTexto(e) {
      alert(e.target.textContent)
    }
  }
}
</script>

<style scoped>
  #caja1 {
    width: 400px;
    height: 400px;
    border: 1px solid orange;
  }

  #caja2 {
    width: 200px;
    height: 200px;
    border: 1px solid blue;
  }
</style>