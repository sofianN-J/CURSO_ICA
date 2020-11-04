<template>
  <div>
    <button @click="cambiarEstado($event)">Toggle</button>
    <p>Calefacción: {{calefaccionEncendida ? 'ON' : 'OFF'}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      calefaccionEncendida: false
    }
  },
  methods: {
    cambiarEstado(event) {
      console.log(event);
      this.calefaccionEncendida = !this.calefaccionEncendida;
    }
  }
}
</script>

<style>

</style>