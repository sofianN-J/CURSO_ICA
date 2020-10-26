package com.grupoica.repasojava.modelo;

public class Usuario {
	
	
	String nombre;
	int edad;
	
	public Usuario() {
		//constructor por defecto.
		nombre = " ";
	}
	
	//sobre carga de metodos
	public Usuario(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	
}
