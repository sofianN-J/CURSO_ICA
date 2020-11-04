<template>
  <div>
    <p :style="{textDecoration: tachado}">Nombre: {{nombre}}</p>
  </div>
</template>

<script>
export default {
  props: {
    nombre: {
      type: String,
      required: true,
      validator(value) {
        return ['robb', 'arya', 'rickon', 'sansa', 'bran', 'tony'].includes(value.toLowerCase());
      }
    },
    estaMuerto: {
      type: Boolean,
      default: false
    }
  },
  computed: {
    tachado() {
      return this.estaMuerto ? 'line-through' : 'none';
    }
  }
}
</script>

<style>

</style>