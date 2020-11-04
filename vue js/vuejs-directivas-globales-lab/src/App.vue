<template>
  <div>
    <button type="button" @click="mostrar = !mostrar">Ocultar</button>
    <p v-blink v-if="mostrar">Este párrafo parpadea</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      mostrar: true
    }
  }
}
</script>

<style>

</style>