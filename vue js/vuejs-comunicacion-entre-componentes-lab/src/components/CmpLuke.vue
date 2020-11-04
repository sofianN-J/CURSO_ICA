<template>
  <div>
    <input type="text" :placeholder="nombre" v-model="nuevoNombre">
    <button type="button" @click="cambiarNombre">Cambiar nombre</button>
    <p>Me llamo {{nombre}}</p>
    <p>Mi hermana se llama {{nombreHermana}}</p>
  </div>
</template>

<script>
export default {
  props: {
    nombre: {
      type: String,
      required: true
    },
    nombreHermana: {
      type: String,
      required: true
    }
  },
  data() {
    return {
      nuevoNombre: ''
    }
  },
  methods: {
    cambiarNombre() {
      this.$emit('nombreCambiado', this.nuevoNombre)
    }
  }
}
</script>

<style>

</style>