package com.grupoica.repasojava.interfaces;

public class Caballo extends Vehiculo implements Animal {

	int dientes;
	public Caballo(String marca, float peso, int dientes) {
		super(marca, peso);
		this.dientes = dientes;
	}
	public int getDientes() {
		return dientes;
	}
	public void setDientes(int dientes) {
		this.dientes = dientes;
	}

	@Override
	public void aceleracion() {
		
		//super.aceleracion();
		System.out.println(marca + " - corre caballito! ");
	}
	@Override
	public void desplazarse(float distancia) {
		System.out.println(marca + " galopa " + distancia + " metros");
	}
	@Override
	public void alimentarse(String comida) {
		if (comida.contains("calabacin")) {
			System.out.println("Come sano " + comida );
		} else {
			System.out.println("Hi hi hi quiero calabacines! no quiero " + comida );
		}
	}	
}
