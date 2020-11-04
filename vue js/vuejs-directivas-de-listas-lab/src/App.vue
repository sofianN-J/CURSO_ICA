<template>
  <div>
    <Mascota v-for="mascota in mascotas" :key="mascota.id" :mascota="mascota" />
  </div>
</template>

<script>
import Mascota from './components/Mascota';

export default {
  components: {
    Mascota
  },
  data() {
    return {
      mascotas: [
        { id: 104, tipo: 'Perro', img: 'https://vignette.wikia.nocookie.net/reinoanimalia/images/a/a9/Husky_siberiano_20.png/revision/latest?cb=20150513044750&path-prefix=es' },
        { id: 391, tipo: 'Ninfa', img: 'https://arrobaparktienda.com/lavoladera/wp-content/uploads/2014/10/ninfa-o-carolina.jpg' },
        { id: 83, tipo: 'Tortuga', img: 'https://misanimales.com/wp-content/uploads/2017/10/edad-de-una-tortuga.jpg?width=1200&enable=upscale' },
      ]
    }
  }
}
</script>

<style>

</style>