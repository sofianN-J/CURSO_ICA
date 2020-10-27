package com.grupoica.repasojava.modelo;

/* T�pica clase Plain Old Java Object  POJO */
public class Usuario /* extends Object*/ {

	private String nombre;
	private int edad;
	
	public Usuario() {
		super();
		nombre = "Sin nombre";
	}
	// Sobrecarga de constructores
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	// Con arroba empiezan las anotaciones, que son extras al c�digo

	@Override
	public boolean equals(Object obj) {
		Usuario usuario = (Usuario) obj;
		return this.nombre == usuario.nombre 
				&& this.edad == usuario.edad;
	}
	// @Override Sobrecarga de m�todo (No override, no sobreescritura)
	// Dos m�todos o constructores con el mismo nombre pero con 
	// distina signatura (es decir, que los par�metros son distintos)
	public boolean equals(Usuario usuario) {
		return this.nombre == usuario.nombre 
				&& this.edad == usuario.edad;
	}
	// OVERRIDE: Sobreescribir: Machacar el m�todo del padre
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario " + nombre + " [" + edad + "]";
	}	
	
}
