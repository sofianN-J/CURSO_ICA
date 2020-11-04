Vue.component("app-saludo", {
    "template": `<h2>Hola soy un componente</h2>`
});

Vue.component("mi-componente", {
    "template": `<div>
    <h1>BUENOS DIAS</h1>
    <h2>MI NOMBRE ES SOFIANE</h2></div>`

});
new Vue({
    "el": "#mi-componenteq",
    template: `
    <mi-componente></mi-componente>
    `

})

new Vue({
    "el": "#app-section",
    template: `<div><h2> HOLA ICA</h2>
    <app-saludo></app-saludo>
    <mi-componente></mi-componente>
    </div>`
});
new Vue({
    "el": "#app-section-2",

});