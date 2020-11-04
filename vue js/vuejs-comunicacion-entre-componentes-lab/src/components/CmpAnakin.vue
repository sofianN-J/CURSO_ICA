<template>
  <div>
    <p>Mi hija se llama {{nombreHija}}</p>
    <p>Mi hijo se llama {{nombreHijo}}</p>
    <CmpLeia :nombre="nombreHija" :nombreHermano="nombreHijo" />
    <CmpLuke :nombre="nombreHijo" :nombreHermana="nombreHija" @nombreCambiado="cambiarNombreHijo" />
  </div>
</template>

<script>
import CmpLeia from './CmpLeia';
import CmpLuke from './CmpLuke';

export default {
  components: {
    CmpLeia,
    CmpLuke
  },
  data() {
    return {
      nombreHija: 'Leia',
      nombreHijo: 'Luke'
    }
  },
  methods: {
    cambiarNombreHijo(nuevoNombre) {
      this.nombreHijo = nuevoNombre;
    }
  }
}
</script>

<style>

</style>