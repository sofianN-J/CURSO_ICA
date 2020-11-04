<template>
  <div>
    <p>{{msg | slice}}</p>
    <p>{{msg | slice(5, 10)}}</p>
    <p>{{msg | slice(5)}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: 'Hola mundo!'
    }
  },
  filters: {
    slice(value, start, end) {
      if (end) {
        return value.slice(start, end);
      }
      if (start) {
        return value.slice(start);
      }
      return value;
    }
  }
}
</script>

<style>

</style>