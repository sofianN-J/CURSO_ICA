<template>
  <div class="card-container">
    <slot name="header"></slot>
    <slot name="body"></slot>
    <hr>
    <slot name="footer">
      <p>Footer de Card</p>
    </slot>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
  .card-container {
    width: 300px;
    border: 1px solid lightgray;
    box-shadow: 20px 20px 20px darkgray;
    text-align: center;
    border-radius: 5px;
  }

  .card-container img {
    width: 70%;
  }
</style>