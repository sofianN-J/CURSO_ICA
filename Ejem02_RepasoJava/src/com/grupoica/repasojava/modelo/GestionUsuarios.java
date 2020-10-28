package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

import com.grupoica.repasojava.ProgramaMain;

/* Clase que se encar� de las operaciones C.R.U.D.
 * Create Read Update Delete (Op. Alta, baja, modificaci�n y consulta)
 * */ 
public class GestionUsuarios {
	
	//objeto en su  forma ambigua(todos los elementos son object)
	//private ArrayList listaUsuarios;
	//lista  en su forma generica (todos los elementos son del mismo tipo o heredero)
	private ArrayList<Usuario> listaUsuarios;
	
	
	
	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
		
		
		
		//listarUsuarios();
		modificarNombreUsuario();
		modificarEdadUsuario();
		mostrarEdad();
		filtrarEdad();
		eliminarUsuario("joker");	
		
		
		
		
	}	
	
	public void listarUsuarios() {
		
		for (int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}
	//listar usuario por nombre
	public void mostrarUsuario(String nombre) {
		
		for (Usuario usu : listaUsuarios) {
				//casting conversion de un tipo de dato en otro gracias al polimorfismo
				if (usu.getNombre().equals(nombre)) {
					System.out.println("ENCONTRADO:  " + usu.getNombre());
				}
		}
	}
	
	public void add(Usuario usu) {
		this.listaUsuarios.add(usu);
	}
	
	public void eliminarUsuario(String nombre) {
		for (Usuario usu : listaUsuarios) {

			//casting conversion de un tipo de dato en otro gracias al polimorfismo
			if (usu.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("usuario eliminado :  " + nombre);
				listaUsuarios.remove(usu);
				break;
			}
	}
	}
	
	
	//modificar usuario
	public void modificarNombreUsuario() {
		
		for (Usuario tres : listaUsuarios) {
			if(tres.getNombre().equalsIgnoreCase("Ricardo")) {
				System.out.println("cambiaremos el nombre");
				tres.setNombre("ABDUL");
			}
			System.out.println(tres.getNombre());
		}
		
	}
	
	//modificar edad
	public void modificarEdadUsuario() {
		
		for (Usuario tres : listaUsuarios) {
			if(tres.getEdad() == 27) {
				System.out.println("cambiaremos la edad");
				tres.setEdad(30);
			}
			System.out.println(tres.getEdad());
		}
		
	}
	
	
	//visualizamos los usuarios
		public void mostrarEdad() {
			for (Usuario tres : listaUsuarios) {
				if(tres.getEdad() < 27) {
					System.out.println("No podras acceder " + tres.getEdad());
					
				}else {
					System.out.println("puedes acceder");
				}
				
			}
		}
	//filtramos usuario por edad
	public void filtrarEdad() {
		for (Usuario tres : listaUsuarios) {
			if(tres.getEdad() < 27) {
				System.out.println("No podras acceder");
				
			}else {
				System.out.println("puedes acceder");
			}
			
		}
	}
	
	
	//EJERCICIOS.
	// Ejercicios:
			// 1 -  Traer los eemplos del constructor GestionUsuarios a main
			// 2 - Modificar usuario
			// 3 - Método eliminar todos los usuarios
			// 4 - Filtrar usuarios por edad (motrar todos los que tengan cierta edad)
			// 5 - Filtrar usuarios por edad (los que estén en un rango de edad)
	

	
	

}
