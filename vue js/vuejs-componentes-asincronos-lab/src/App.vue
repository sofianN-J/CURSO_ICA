<template>
  <div>
    <button type="button" @click="mostrar = !mostrar">{{ mostrar ? 'Ocultar' : 'Mostrar' }}</button>
    <CmpPerezoso v-if="mostrar" />
  </div>
</template>

<script>
export default {
  data() {
    return {
      mostrar: false
    }
  },
  components: {
    CmpPerezoso: () => import('./components/CmpPerezoso')
  }
}
</script>

<style>

</style>