package com.grupoica.repasojava.interfaces;

public class Perro implements Animal {
	String comida;
	public Perro(String comida) {
		this.comida = comida;
	}

	@Override
	public void alimentarse(String comida) {
		System.out.println("comiendo " + comida);
		
	}

}
