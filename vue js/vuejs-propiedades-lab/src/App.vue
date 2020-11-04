<template>
  <div>
    <CmpPersona nombre="Arya" />
    <CmpPersona nombre="Robb" estaMuerto />
  </div>
</template>

<script>
import CmpPersona from './components/CmpPersona'

export default {
  components: {
    CmpPersona
  }
}
</script>

<style>

</style>