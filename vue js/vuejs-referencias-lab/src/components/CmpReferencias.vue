<template>
  <div>
    <h2>Referencias</h2>
    <audio ref="audioRef" src="../assets/sonido-piolin.mp3"></audio>
    <button type="button" @click="reproducir">Reproducir</button>
    <button type="button" @click="pausar">Pausar</button>
  </div>
</template>

<script>
export default {
  methods: {
    reproducir() {
      this.$refs.audioRef.play();
    },
    pausar() {
      this.$refs.audioRef.pause();
    }
  }
}
</script>

<style>
img {
  width: 200px;
  height: 200px;
}
</style>