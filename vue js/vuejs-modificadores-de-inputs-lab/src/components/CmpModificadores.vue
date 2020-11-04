<template>
  <div>
    <p>Longitud del nombre: {{longitudDelNombre}}</p>
    <input type="text" v-model.trim="nombre">
    <p>Tipo del precio: {{tipoDelPrecio}}</p>
    <input type="number" v-model.number="precio">
    <p>Texto lazy: {{texto}}</p>
    <input type="text" v-model.lazy="texto">
  </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: '',
      precio: 12,
      texto: ''
    }
  },
  computed: {
    longitudDelNombre() {
      return this.nombre.length;
    },
    tipoDelPrecio() {
      return typeof(this.precio);
    },
  }
}
</script>

<style>

</style>