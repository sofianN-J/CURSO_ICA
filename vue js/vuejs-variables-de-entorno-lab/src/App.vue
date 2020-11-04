<template>
  <div>
    <p>URL: {{url}}</p>
    <p>API_KEY: {{apiKey}}</p>
  </div>
</template>

<script>
import config from '@/config';

export default {
  computed: {
    url() {
      return config.URL;
    },
    apiKey() {
      return config.API_KEY;
    }
  }
}
</script>

<style>

</style>