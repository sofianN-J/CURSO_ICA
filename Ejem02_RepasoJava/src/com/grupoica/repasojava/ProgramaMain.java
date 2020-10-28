package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.GestionUsuarios;
//import com.grupoica.repasojava.modelo.sus;
import com.grupoica.repasojava.modelo.Loco;
import com.grupoica.repasojava.modelo.Usuario;

public class ProgramaMain {

	/* P.O.O.
	 * La unidad b�sica de almacenamiento son los tipos primitivos y los objetos
	 * que est�n basados en clases. Las clases son el molde, plantilla, estructura que indica
	 * c�mo ser�n todos los objetos instanciados a partir de ella:
	 *  Sus variables miembro (campos, atributos, propiedades...) y sus m�todos (funciones propias)
	 *  - Encapsulaci�n: Capacidad de las clases para limitar el acceso a variables miembro y m�todos. (nivel de acceso private, public, protected (privado a nivel de herencia) o por defecto (a nivel de paquete)
	 *  - Herencia: La capacidad de las clases para heredar los m�todos y variables miembro unas de otras. Usando la palabra  'extends'
	 *  - Polimorfismo: //la capacidad de los objetos de obtener la forma de su clase o  la de cualquiera de
			sus ancestros
	 */

	public static void main(String[] args) {
		GestionUsuarios gesUsu = new GestionUsuarios();
	
		
		Usuario usu = new Usuario();
		
		Usuario tres = new Usuario();
		
		tres.setNombre("Ricardo");
		tres.setEdad(27);
		//xxxxxxxxxxxxxxxxx
		
		gesUsu.add(tres);
		gesUsu.modificarNombreUsuario("Ricardo");
		gesUsu.modificarEdadUsuario( 27, "ABDUL");
		gesUsu.mostrarEdad(tres.getEdad());
		gesUsu.filtrarEdad();
		gesUsu.filtrarUsuario(0, 0);
		//gesUsu.eliminarUsuario("joker");	
		
		//aniadir usuario
		
		
		
		//System.out.println(tres.getNombre());
		
		
		
		
		Usuario u2 = new Usuario("U2", 50);
		//this.listaUsuarios.add(10);
		
				//LLAMADA AL METODO
		
		usu.setEdad(30);
		usu.setNombre("Fulanito Mengano");
		//System.out.println("Nombre: " + usu.getNombre());
		//si listausuarios es arraylist sin tipo, es que su tipo es Object. por lo tanto hacemos 
//		casting implicito  de casting a object gracias al polimorfismo
		//this.listaUsuarios.add(usu); 
		
		
		//System.out.println("Edad u2: " + u2.getEdad());
		
		//this.listaUsuarios.add("Texto");
		//this.listaUsuarios.add(new Object());
		//this.listarUsuarios();
		
		if (u2.equals(usu)) {
			//System.out.println("Son iguales");
		} else {
			//System.out.println("Son distintos");
		}
		
		Loco joker = new Loco();
		joker.setNombre("Joker");
		joker.setTipoLocura(true);
		if (joker.isTipoLocura()) {
			//System.out.println("joker esta loco " + joker.toString());
		}else {
			//System.out.println("joker no esta loco " + joker.toString());
		}
		
		//System.out.println("Joker: " + joker.toString());
		//this.listaUsuarios.add(joker);
		//this.mostrarUsuario("joker");
		
		
		
	
	
		
		
		//gesUsu.add("dfdfdfdcfd");
		gesUsu.listarUsuarios();
		
		EjemploMemoria.pruebaPasoPorValor();		
		EjemploMemoria.pruebaPasoPorReferencia();		
	}
}
