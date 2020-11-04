<template>
  <div>
    <button type="button" @click="toggleNoticia">{{mostrarNoticia ? 'Ocultar' : 'Mostrar'}} noticia</button>
    <template v-if="mostrarNoticia">
      <h1>{{noticia.titulo}}</h1>
      <p>{{noticia.contenido}}</p>
    </template>
  </div>
</template>

<script>
export default {
  data() {
    return {
      mostrarNoticia: true,
      noticia: {
        titulo: 'Sube la venta de pitos y flautas',
        contenido: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas cursus lacinia sagittis. Nullam mattis sem eget mauris congue, sit amet venenatis nibh porta. Nullam a leo at lorem ullamcorper tempor vel et nisl. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam pharetra ex iaculis tellus sollicitudin, eu sollicitudin libero sollicitudin.'
      }
    }
  },
  methods: {
    toggleNoticia() {
      this.mostrarNoticia = !this.mostrarNoticia
    }
  }
}
</script>

<style>

</style>