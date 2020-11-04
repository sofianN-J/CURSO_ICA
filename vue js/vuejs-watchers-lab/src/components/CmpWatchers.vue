<template>
  <div>
    <div>
      <label for="nombre">Nombre:</label>
      <input type="text" v-model="nombre">
    </div>
    <p>Estado: {{estado}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: '',
      estado: ''
    }
  },
  watch: {
    nombre(newVal, oldValue) {
      const nombresValidos = ['brooklyn', 'hudson', 'bronx', 'goliath', 'lexington', 'broadway', 'demona', 'angela'];
      this.estado = 'Comprobando en la BBDD...';
      setTimeout(() => {
        this.estado = nombresValidos.includes(newVal.toLowerCase()) ? 'Valido' : 'Invalido';
      }, 1500);
    }
  }
}
</script>

<style>

</style>