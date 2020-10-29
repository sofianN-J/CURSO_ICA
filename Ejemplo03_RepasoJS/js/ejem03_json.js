// JSON: JavaScript Object Notation
// Otra forma de crear objetos con la notación JSON
let objetoVacio = {}; //new Object() es lo mismo

/*let formaPago = {
    "modo": "Tarjeta credito",
    "comision": 2,
    "activa": true,
    "preparacion": null,
    clientes: ["Santander", "Sabadell", "BBVA", [1, 23, 55]],
    'configuracion': {
        "conextion": "ssl",
        "latencia": 15
    }
};*/
// Leer de disco el JSON y DES-SERIALIZARLO
let formaPago = JSON.parse(window.localStorage.getItem("datos-forma-pago"));
let arrayVacio = []; // new Array()
let datos = ["Churros", "Merinas", 200, true, null, { "ale": "mas datos" }];
let matriz = [
    [4, 6, 8],
    [3, 7, 7],
    [1, 5, 7]
];
formaPago.servidor = "http://visa.com";
formaPago["oculta"] = "Dame 5 centimos pa mí";

document.write(`<br>
<p>${formaPago.modo} - ${formaPago.clientes[1]} - ${formaPago.clientes[3][2]} </p>
${matriz[2][1]}
<code>${JSON.stringify(formaPago, null, 3)}</code>
Usando forma HashMap: ${ formaPago["servidor"] }
`);
/* Convertir un objeto o estructura en memoria en un formato transmitible (o para enviar por red o para guardar en fichero), es SERIALIZAR, y el formato puede texto (XML, JSON, YAML, o un propio), formato binario, o encriptado */
alert(JSON.stringify(formaPago, null, 20));
// Guardar en el disco el JSON en el espacio local de la página (unos 20 Mb)
// Usando esto se podría guardar los datos para su uso sin conexión
window.localStorage.setItem("datos-forma-pago", JSON.stringify(formaPago, null, 20));
let petUsu = prompt("¿Que dato quieres?");
document.write(`<br> ${formaPago[petUsu]}`);
let frutas = `[
    {   "nombre": "pera",  "precio": 20    } ,
    {   "nombre": "kiwi",  "precio": 27    } ,
    {   "nombre": "fresa", "precio": 37    } ]`;
/* Parsear es la forma coloquial de decir "leer o interpretar un texto"
puede ser convertir un texto en otro texto, o en este caso,
convertir un texto en un objeto en estructura en memoria.
Cuando hablamos del último caso la definición técnica  es "DES-SERIALIZAR" */
let objFrutas = JSON.parse(frutas);
document.write(`<br> ${objFrutas[1].nombre}  -  ${objFrutas[2]["precio"]} `);