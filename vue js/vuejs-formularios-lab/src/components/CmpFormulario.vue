<template>
  <div>
    <form @submit.prevent="guardarDatos">
      <div>
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre" id="nombre" v-model="nombre">
      </div>
      <div>
        <label for="email">Email</label>
        <input type="email" name="email" id="email" v-model="email">
      </div>
      <div>
        <label for="password">Contraseña</label>
        <input type="password" name="password" id="password" v-model="password">
      </div>
      <div>
        <label for="pais">País</label>
        <select name="pais" id="pais" v-model="pais">
          <option value="es">España</option>
          <option value="fr">Francia</option>
          <option value="it">Italia</option>
          <option value="ge">Alemania</option>
        </select>
      </div>
      <div>
        <label for="estudiante">Eres estudiante?</label>
        <input type="radio" name="estudiante" id="estudiante" value="si" v-model="estudiante">Si
        <input type="radio" name="estudiante" id="estudiante" value="no" v-model="estudiante">No
      </div>
      <div>
        <label for="hobbies">Hobbies</label>
        <input type="checkbox" name="hobbies" id="hobbies" value="tenis" v-model="hobbies">Tenis
        <input type="checkbox" name="hobbies" id="hobbies" value="futbol" v-model="hobbies">Futbol
        <input type="checkbox" name="hobbies" id="hobbies" value="natacion" v-model="hobbies">Natación
        <input type="checkbox" name="hobbies" id="hobbies" value="teatro" v-model="hobbies">Teatro
        <input type="checkbox" name="hobbies" id="hobbies" value="series" v-model="hobbies">Series
        <input type="checkbox" name="hobbies" id="hobbies" value="cine" v-model="hobbies">Cine
      </div>
      <button type="submit">Registrarme</button>
    </form>
    <hr>
    <pre>{{datosForm}}</pre>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: 'Charly Falco',
      email: 'cfalco@gmail.com',
      password: 'cfalco123',
      pais: '',
      estudiante: 'si',
      hobbies: ['futbol', 'series']
    }
  },
  computed: {
    datosForm() {
      return JSON.stringify(this.$data, null, 4)
    }
  },
  methods: {
    guardarDatos() {
      // Aquí habría que añadir la petición que manda los datos al servidor para guardarlos
      console.log(this.$data);
    }
  }
}
</script>

<style>

</style>