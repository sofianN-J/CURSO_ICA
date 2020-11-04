<template>
  <div>
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
  }
}
</script>

<style>

</style>