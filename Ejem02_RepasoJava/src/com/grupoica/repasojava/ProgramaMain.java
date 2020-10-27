package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;

public class ProgramaMain {
	
	/*P.O.O
	 La unidad básica de almacenamiento son los tipo primitivos y los
	 objetos que estan basados en clases. Las clases son el molde, plantilla o estrucura que indica 
	 cómo seran todos los objetosinstanciados a partir de ello: sus variables miembro(campos, atrb, propiedades...)
	 y sus métodos(funciones).
	 -encapsulacion: limitar la capacidad de las clases para limitar acceso a variables miembro y metodos.
	 (nivel de acceso private, public , protected) --> privado a nivel de herencia,
	 o por defecto que es a nivel proyecto
	 -herencia: la capacidad para heredar los metodos y variables miembro unas de otras 
	 usando la palabra extends.
	 -polimorfismo
	  */
	
	public static void main(String[] args) {
		
		GestionUsuarios gesUsu = new GestionUsuarios();
		
		gesUsu.listarUsuarios();
		
		EjemploMemoria e = new EjemploMemoria();
		e.pruebaPasoPorValor();
	}

}
