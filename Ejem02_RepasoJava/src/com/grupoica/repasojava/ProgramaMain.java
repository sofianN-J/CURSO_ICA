package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;

public class ProgramaMain {

	/* P.O.O.
	 * La unidad b�sica de almacenamiento son los tipos primitivos y los objetos
	 * que est�n basados en clases. Las clases son el molde, plantilla, estructura que indica
	 * c�mo ser�n todos los objetos instanciados a partir de ella:
	 *  Sus variables miembro (campos, atributos, propiedades...) y sus m�todos (funciones propias)
	 *  - Encapsulaci�n: Capacidad de las clases para limitar el acceso a variables miembro y m�todos. (nivel de acceso private, public, protected (privado a nivel de herencia) o por defecto (a nivel de paquete)
	 *  - Herencia: La capacidad de las clases para heredar los m�todos y variables miembro unas de otras. Usando la palabra  'extends'
	 *  - Polimorfismo
	 */

	public static void main(String[] args) {
		GestionUsuarios gesUsu = new GestionUsuarios();
		//gesUsu.add("dfdfdfdcfd");
		gesUsu.listarUsuarios();
		
		EjemploMemoria.pruebaPasoPorValor();		
		EjemploMemoria.pruebaPasoPorReferencia();		
	}
}
