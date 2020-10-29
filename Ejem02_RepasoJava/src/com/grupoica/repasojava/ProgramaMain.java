package com.grupoica.repasojava;

import com.grupoica.repasojava.interfaces.Caballo;
import com.grupoica.repasojava.interfaces.ProbandoVehiculos;
import com.grupoica.repasojava.modelo.GestionUsuarios;
import com.grupoica.repasojava.modelo.Loco;
import com.grupoica.repasojava.modelo.Usuario;

public class ProgramaMain {
	public static final float PI = 3.1415927f;

	/* P.O.O.
	 * La unidad b�sica de almacenamiento son los tipos primitivos y los objetos
	 * que est�n basados en clases. Las clases son el molde, plantilla, estructura que indica
	 * c�mo ser�n todos los objetos instanciados a partir de ella:
	 *  Sus variables miembro (campos, atributos, propiedades...) y sus m�todos (funciones propias)
	 *  - Encapsulaci�n: Capacidad de las clases para limitar el acceso a variables miembro y m�todos. (nivel de acceso private, public, protected (privado a nivel de herencia) o por defecto (a nivel de paquete)
	 *  - Herencia: La capacidad de las clases para heredar los m�todos y variables miembro unas de otras. Usando la palabra  'extends'
	 *  - Polimorfismo: La capacidad de los objetos de obtener la forma de su clase o 
	 *  la de cualquiera de sus ancestros (padre, abuelo...)
	 */

	public static void main(String[] args) {
		
		/*
		GestionUsuarios gesUsu = new GestionUsuarios();
		gesUsu.add(new Usuario("Pepe", 20));
		gesUsu.listarUsuarios();
		
//		EjemploMemoria.pruebaPasoPorValor();		
//		EjemploMemoria.pruebaPasoPorReferencia();

		double doble = 10.43434;
		int entero = (int) Math.floor(doble);
		// Casting (conversi�n de un tipo de dato en otro)
		// casting expl�cito: Aposta, adrede, con (tipo) por delante
		// Perdemos los decimales
		
		// Ejercicios:
		// 1 -  Traer los ejemplos del constructor GestionUsuarios a main
		//		Aqu� s�lo las llamadas a los m�todos de G.U.
		// 2 - Modificar usuario
		// 3 - M�todo eliminar todos los usuarios
		// 4 - Filtrar usuarios por edad (motrar todos los que tengan cierta edad)
		// 5 - Filtrar usuarios por edad (los que est�n en un rango de edad)

		// this.listaUsuarios.add(10);
		Usuario usu = new Usuario();
		usu.setEdad(30);
		usu.setNombre("Fulanito Mengano");
		System.out.println("Nombre: " + usu.getNombre());
		// Si listaUsuarios es un ArrayList sin tipo, es que su tipo es Object, cada uno
		// de los elementos es object. Por lo tanto hacemos
		// casting impl�cito (sin par�ntesis) de usu a object
		// gracias al polimorfismo
		gesUsu.add(usu);

		Usuario u2 = new Usuario("U2", 50);
		System.out.println("Edad u2: " + u2.getEdad());
		gesUsu.add(u2);
		// this.listaUsuarios.add("Texto");
		// this.listaUsuarios.add(new Object());

		if (u2.equals(usu)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		Loco joker = new Loco();
		joker.setNombre("Joker");
		joker.setTipoLocura(true);
		if (joker.isTipoLocura()) {
			System.out.println("Joker esta loco: " + joker.toString());
		} else {
			System.out.println("Joker NO esta loco: " + joker.toString());
		}
		gesUsu.add(joker);
		gesUsu.mostrarUsuario("Joker");
		System.out.println(gesUsu.obtenerUsuario("Fulanito Mengano").toString());

		System.out.println("LISTAR USUARIOS:");
		gesUsu.listarUsuarios();
		
		gesUsu.eliminarUsuario("Joker");
		gesUsu.add("Juan", 25);
		
		gesUsu.modificar("Juan", "Juan Carlos");
		gesUsu.modificar("Juan Carlos", "Juan Carlos I", 50);
		gesUsu.modificar("Juan Carlos I", 80);
		String s ="";
		
		System.out.println("LISTAR USUARIOS:");
		gesUsu.listarUsuarios();
		EjemploHashMap.probandoHashMap();
		System.out.println("ELIMINAR TODOS USUARIOS:");
		gesUsu.eliminarTodos();
		System.out.println("LISTAR USUARIOS:");
		gesUsu.listarUsuarios();
		
		int ajedrez[][] = new int[8][8] ;	// 64 elementos
		ajedrez[1] = new int[3];
		ajedrez[2] = new int[300];
		System.out.println("Tama�o ajedrez:" + ajedrez.length);
		System.out.println("Tama�o ajedrez 0:" + ajedrez[0].length);
		System.out.println("Tama�o ajedrez 1:" + ajedrez[1].length);
		System.out.println("Tama�o ajedrez 2:" + ajedrez[2].length);
		System.out.println("Tama�o ajedrez 3:" + ajedrez[3].length);
		System.out.println("Tama�o ajedrez 3:" + ajedrez[3][4]);
		*/
		
		ProbandoVehiculos.probar();
		
		
	}
}
