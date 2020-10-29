package com.grupoica.repasojava.interfaces;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Coche extends Vehiculo implements Motorizable {

	float gasolina;
	
	public Coche(String marca, float peso, float gasolina) {
		super(marca, peso);
		this.gasolina = gasolina;
	}

	public float getGasolina() {
		return gasolina;
	}

	public void setGasolina(float gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public void aceleracion() {
		
		//super.aceleracion();
		System.out.println(marca + " - Acelerando coche, cuidado ");
	}

	@Override
	public void desplazarse(float distancia) {
		System.out.println(marca + " rueda " + distancia + " metros");
	}

	@Override
	public void encender() {
		System.out.println(marca + " enciende ");
	}
	
}
