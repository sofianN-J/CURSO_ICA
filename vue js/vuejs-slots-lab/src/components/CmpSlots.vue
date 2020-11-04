<template>
  <div>
    <Card>
      <h2 slot="header">Título</h2>
      <img slot="body" src="https://www.stickpng.com/assets/images/58482acecef1014c0b5e4a1e.png" alt="Logo de Vue">
    </Card>
  </div>
</template>

<script>
import Card from './Card';

export default {
  components: {
    Card
  }
}
</script>

<style>

</style>