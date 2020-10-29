package com.grupoica.repasojava.interfaces;

public class Patinete implements Motorizable {

	float bateria;
	
	public Patinete(float b) {
		this.bateria = b;
	}

	@Override
	public void encender() {
		this.bateria -= 2f;
		System.out.println("Patinete encendido, ahora " + bateria + " Kwh");
		
	}

}
