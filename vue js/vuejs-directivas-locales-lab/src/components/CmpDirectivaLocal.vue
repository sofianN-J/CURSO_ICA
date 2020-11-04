<template>
  <div>
    <p v-marcar>Este texto aparecerá marcado</p>
    <p v-marcar="'blue'">Este texto aparecerá marcado en azul</p>
    <p v-marcar.delayed="'red'">Este texto aparecerá marcado en rojo</p>
    <p v-marcar:background.delayed="'green'">Este texto aparecerá marcado en verde</p>
    <p v-marcar:color.delayed="'orange'">Este texto aparecerá con la letra en naranja</p>
  </div>
</template>

<script>
export default {
  directives: {
    marcar: {
      bind(el, binding) {
        const colorPorDefecto = 'white';
        console.log(binding)
        const color = binding.value || 'yellow';
        el.style.backgroundColor = colorPorDefecto;
        el.addEventListener('mouseover', () => {
          if (binding.modifiers.delayed) {
            setTimeout(() => {
              if (binding.arg === 'color') {
                el.style.color = color;
              } else {
                el.style.backgroundColor = color;
              }
            }, 500);
          } else {
            if (binding.arg === 'color') {
              el.style.color = color;
            } else {
              el.style.backgroundColor = color;
            }
          }
        })
        el.addEventListener('mouseout', () => {
          el.style.backgroundColor = colorPorDefecto;
        })
      }
    }
  }
}
</script>

<style>

</style>