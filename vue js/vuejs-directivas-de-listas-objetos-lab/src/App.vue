<template>
  <div>
    <ul>
      <li v-for="(val, key) in serie" :key="key+val">{{key}}: {{val}}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      serie: {
        titulo: 'Bitten',
        temporadas: 3,
        finalizada: true
      }
    }
  }
}
</script>

<style>

</style>