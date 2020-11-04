<template>
  <header>
      <div>
          <h1 class="hola">TITULO WEB</h1>
      </div>
      variableOculta = {{ variableOculta }} <br>
      nombre => {{ nombre.toUpperCase() + " " + (5 * 5) + " es lo que tengo en el banco" }}
  </header>
</template>

<script>
export default {
  data() {
    return {
      variableOculta: "var oculta",
      nombre : "chicho terremoto"
    };
    
  }
}
</script>

<style>

</style>