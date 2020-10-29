const PI = 3.1415926;

let unaVar = 20;
let unTexto = "QUe pasa!";

document.write(`<br>
Texto en varias
lineas, y además podemos mostrar <br>
variables así:  ${unaVar} y otro texto: ${unTexto}`);
// Funciones lambda: funciones anónimas 
// o funciones flecha para los cutres de JS
var suma = (x, y) => x + y;

document.write("<br>" + suma(3, 2));

var alcuadrado = x => x ** 2;
document.write("<br>" + alcuadrado(3));

class Dato {
    constructor(xxx, yyy = 20) {
        this.x = xxx;
        this.y = yyy;
    }
    mostrar() {
        document.write(`<br> Dato: x = ${this.x} y = ${this.y}`);
    }
}
class Info extends Dato {
    constructor(xx, yy = 20, zz = 20) {
        super(xx, yy);
        this.z = zz;
    }
    mostrar() {
        super.mostrar();
        document.write(`z = ${this.z}`);
    }
}
let dato = new Dato("lo que quieras");
dato.mostrar();
let info = new Info("Otra info");
info.mostrar();