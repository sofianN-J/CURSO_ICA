<template>
  <div>
    <p>Me llamo {{nombre}}</p>
    <p>Mi hermano se llama {{nombreHermano}}</p>
  </div>
</template>

<script>
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
  }
}
</script>

<style>

</style>