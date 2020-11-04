<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  <div class="hola" id="hola">
    Algo  
  </div>
  </div>
</template>

<script>
export default {
  name: 'HolaMundo',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
div {
  margin: 40px 0 0;
  background-color: navajowhite;
}
.hola {
  border: solid 5px white;
}
</style>
