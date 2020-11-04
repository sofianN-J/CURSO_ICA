<template>
  <div :style="{width: '300px', border: '1px solid black'}">
    <img :src="mascota.img" :alt="altImgMascota" :style="{width: '100%'}">
    <h4 :style="{textAlign: 'center'}">{{mascota.tipo}}</h4>
  </div>
</template>

<script>
export default {
  props: {
    mascota: {
      type: Object,
      required: true
    }
  },
  computed: {
    altImgMascota() {
      return 'Imagen de ' + this.mascota.tipo;
    }
  }
}
</script>

<style>

</style>