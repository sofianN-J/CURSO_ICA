package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

import com.grupoica.repasojava.EjemploHashMap;

/* Clase que se encar� de las operaciones C.R.U.D.
 * Create Read Update Delete (Op. Alta, baja, modificaci�n y consulta)
 * */
public class GestionUsuarios {

	// lista en su forma ambigua (todos los elementos son object)
	// private ArrayList listaUsuarios; es lo mismo ArrayList<Object>
	// lista es su forma gen�rica
	// (todos lso elemenos son del mismo o de alg�n tipo heredero)
	private ArrayList<Usuario> listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
	}

	public void listarUsuarios() {
		for (int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}

	public void mostrarUsuario(String nombre) {

		for (Usuario usu : listaUsuarios) {
			// if (usuObj instanceof Usuario) {
			// Casting de objetos gracias al poliformismo
			// Usuario usu = (Usuario) usuObj;
			if (usu.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("ENCONTRADO: " + usu.getNombre());
			}
			// }
		}
	}

	public Usuario obtenerUsuario(String nombre) {

		for (Usuario usu : listaUsuarios) {
			if (usu.getNombre().equalsIgnoreCase(nombre)) {
				return usu;
			}
		}
		System.out.println("Usuario no encontrado: " + nombre);	
		return null;
	}

	public void eliminarUsuario(String nombre) {

		Usuario usuBorrar = obtenerUsuario(nombre);
		listaUsuarios.remove(usuBorrar);	
		/*for (Usuario usu : listaUsuarios) {
			if (usu.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Usuario eliminado: " + nombre);
				listaUsuarios.remove(usu);
				return;
			}
		}*/
	}
	public void eliminarTodos() {
		listaUsuarios.clear();
	}

	public void add(Usuario usu) {
		this.listaUsuarios.add(usu);
		EjemploHashMap.diccUsuarios.put(usu.getNombre(), usu);
	}
	public void add(String nombre, int edad) {	
		Usuario nuevoUsu = new Usuario(nombre, edad);
		this.listaUsuarios.add(nuevoUsu);
		EjemploHashMap.diccUsuarios.put(nuevoUsu.getNombre(), nuevoUsu);
	}
	public void modificar(String nombre,
			String nuevoNombre, int nuevaEdad) {		

		Usuario usuModif = obtenerUsuario(nombre);
		if (usuModif != null) {
			usuModif.setEdad(nuevaEdad);
			usuModif.setNombre(nuevoNombre);
		}
	}
	public void modificar(String nombre, String nuevoNombre) {
		Usuario usuModif = obtenerUsuario(nombre);
		if (usuModif != null) 
			usuModif.setNombre(nuevoNombre);
	}
	public void modificar(String nombre, int nuevaEdad) {
		Usuario usuModif = obtenerUsuario(nombre);
		if (usuModif != null) 
			usuModif.setEdad(nuevaEdad);
	}
	public void filtrarUsuario(int edadMin, int edadMax) {

		boolean encontrado = false;			
		
		for (Usuario usu : listaUsuarios) 
			if (usu.getEdad() >= edadMin && usu.getEdad() <= edadMax) {
				encontrado = true;
				System.out.println("Usuario encontrado: " + usu.toString());
			}
		
		if (! encontrado)
			System.out.println("Usuarios por edad no encontrados: ");
	}
	public void filtrarUsuario(int edad) {
		filtrarUsuario(edad, edad);
	}
}

