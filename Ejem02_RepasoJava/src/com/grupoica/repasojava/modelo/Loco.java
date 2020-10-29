package com.grupoica.repasojava.modelo;

public class Loco extends Usuario {
	
	private boolean tipoLocura;
	
	public Loco() {
		super();
	}
	// Sobrecarga de constructores
	public Loco(String nombre, int edad, boolean tl) {
		super(nombre, edad);
		this.tipoLocura = tl;
	}

	public boolean isTipoLocura() {
		return tipoLocura;
	}

	public void setTipoLocura(boolean tipoLocura) {
		this.tipoLocura = tipoLocura;
	}	
	
}
