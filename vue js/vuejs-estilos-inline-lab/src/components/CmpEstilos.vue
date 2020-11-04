<template>
  <div>
    <p :style="{backgroundColor: 'black', color: color}">Le aplicamos estilos con el atributo style</p>
    <p :class="{fondoNegro: activado, letraNaranja: true}">Le aplicamos estilos con el atributo class</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      color: 'yellow',
      activado: false
    }
  }
}
</script>

<style scoped>
  .letraNaranja {
    color: orange;
  }

  .fondoNegro {
    background-color: black;
  }
</style>