<template>
  <div>
    <p>Me llamo {{nombre}}</p>
    <p>{{new Array(17).join(1 - 'what') + ` ${nombreSuperheroe}!`}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: 'Bruce',
      nombreSuperheroe: 'Batman'
    }
  }
}
</script>

<style>

</style>