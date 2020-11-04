<template>
  <div>
    <input type="text" @keyup.space="mostrarTecla('Espacio')" @keypress.enter="mostrarTecla('Intro')">
    <input type="text" @keyup.right.down.left.up="mostrarTecla($event.code)">
  </div>
</template>

<script>
export default {
  methods: {
    mostrarTecla(tecla) {
      alert('Has pulsado la tecla ' + tecla);
    }
  }
}
</script>

<style>

</style>