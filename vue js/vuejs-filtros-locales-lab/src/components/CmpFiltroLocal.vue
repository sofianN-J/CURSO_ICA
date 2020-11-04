<template>
  <div>
    <p>Nombre: {{nombre | doble}}</p>
    <p>Precio: {{precio | doble}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: 'Charly',
      precio: 3
    }
  },
  filters: {
    doble(value) {
      if (typeof(value) === 'string') {
        return value.repeat(2);
      }
      return value * 2;
    }
  }
}
</script>

<style>

</style>