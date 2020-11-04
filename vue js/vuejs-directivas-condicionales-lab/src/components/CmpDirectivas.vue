<template>
  <div>
    <div>
      <button type="button" v-show="nota > 0" @click="cambiarNota(-1)">-1</button>
      <span>{{nota}}</span>
      <button type="button" v-show="nota < 10" @click="cambiarNota(1)">+1</button>
    </div>
    <p v-if="nota > 5 && nota < 11">Aprobado</p>
    <p v-else-if="nota > -1 && nota < 5">Suspenso</p>
    <p v-else-if="nota === 5">Suficiente</p>
    <p v-else>No válida</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nota: 5
    }
  },
  methods: {
    cambiarNota(cantidad) {
      this.nota += cantidad;
    }
  }
}
</script>

<style>

</style>