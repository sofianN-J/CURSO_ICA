package com.grupoica.repasojava.interfaces;

public abstract class Animales {
	
	String nombres;
	public Animales(String nombres) {
		this.nombres = nombres;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public abstract void alimentarse(String distancia);
	

}
