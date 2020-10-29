package com.grupoica.repasojava.interfaces;

public class Perro implements Animal{

	String ladrido;
	
	public Perro(String lad) {
		ladrido = lad;
	}
	@Override
	public void alimentarse(String comida) {
		if (comida.contains("chuleton")) {
			System.out.println(ladrido +" Come sano " + comida );
		} else {
			System.out.println(ladrido + " quiero chuleton! no quiero " + comida );
		}
	}	
}
