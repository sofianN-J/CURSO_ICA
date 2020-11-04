<template>
  <div>
    <p id="p1" v-text="texto"></p>
    <div v-html="contenido"></div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      texto: 'El botón tiene trampa',
      contenido: '<button onclick="document.getElementById(\'p1\').innerHTML=\'\'">Cuidado con esto</button>'
    }
  }
}
</script>

<style>

</style>