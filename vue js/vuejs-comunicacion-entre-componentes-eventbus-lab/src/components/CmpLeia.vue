<template>
  <div>
    <input type="text" :placeholder="nombre" v-model="nuevoNombre">
    <button type="button" @click="cambiarNombre">Cambiar nombre</button>
    <p>Me llamo {{nombre}}</p>
    <p>Mi hermano se llama {{nombreHermano}}</p>
  </div>
</template>

<script>
import { EventBus } from '../main';

export default {
  props: {
    nombre: {
      type: String,
      required: true
    },
    nombreHermano: {
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
      EventBus.$emit('nombreCambiado', this.nuevoNombre)
    }
  }
}
</script>

<style>

</style>