<template>
  <div>
    <p>Precio: {{precio}}</p>
    <p>Precio con símbolo: {{precioConSimbolo}}</p>
    <button type="button" @click="incrementar">+</button>
    <button type="button" @click="cambiarSimbolo('€')">€</button>
    <button type="button" @click="cambiarSimbolo('$')">$</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      precio: 0,
      simbolo: '€'
    }
  },
  methods: {
    incrementar() {
      this.precio += 1;
    },
    cambiarSimbolo(s) {
      this.simbolo = s;
    }
  },
  computed: {
    precioConSimbolo() {
      return this.precio + this.simbolo;
    }
  }
}
</script>

<style>

</style>