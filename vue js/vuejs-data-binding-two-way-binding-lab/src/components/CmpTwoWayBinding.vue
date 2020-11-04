<template>
  <div>
    <p>Serie: {{serie}}</p>
    <input type="text" v-model="serie">
    <button type="button" @click="resetearSerie">Resetear serie</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      serie: 'Game of Thrones'
    }
  },
  methods: {
    resetearSerie() {
      this.serie = 'Game of Thrones';
    }
  }
}
</script>

<style>

</style>