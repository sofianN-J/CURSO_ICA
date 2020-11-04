<template>
  <div>
    <p>Mi hija se llama {{nombreHija}}</p>
    <p>Mi hijo se llama {{nombreHijo}}</p>
    <CmpLeia :nombre="nombreHija" :nombreHermano="nombreHijo" />
    <CmpLuke :nombre="nombreHijo" :nombreHermana="nombreHija" />
  </div>
</template>

<script>
import { EventBus } from '../main';
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
  created() {
    EventBus.$on('nombreCambiado', (nuevoNombre) => {
      this.nombreHija = nuevoNombre;
    })
  },
  beforeDestroy() {
    EventBus.$off('nombreCambiado')
  }
}
</script>

<style>

</style>