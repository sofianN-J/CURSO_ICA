<template>
  <div>
    <p><strong>Color:</strong> {{color}}</p>
    <p><strong>Sabor:</strong> {{sabor}}</p>
    <hr>
    <p>{{sugus}}</p>
    <div>
      <label for="sugus">Introduce el color/sabor del sugus:</label>
      <input type="text" id="sugus" @input="sugus = $event.target.value">
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      sabor: 'piña',
      color: 'azul'
    }
  },
  computed: {
    sugus: {
      get() {
        return `Sugus: ${this.sabor} (${this.color})`;
      },
      set(val) {
        const colores = ['azul', 'rojo', 'naranja', 'amarillo'];
        const sabores = ['piña', 'fresa', 'naranja', 'limon'];
        if (colores.includes(val)) {
          this.color = val;
          const pos = colores.indexOf(val);
          this.sabor = sabores[pos];
        } else if (sabores.includes(val)) {
          this.sabor = val;
          const pos = sabores.indexOf(val);
          this.color = colores[pos];
        } else {
          this.color = '???';
          this.sabor = '???';
        }
      }
    }
  }
}
</script>

<style>

</style>