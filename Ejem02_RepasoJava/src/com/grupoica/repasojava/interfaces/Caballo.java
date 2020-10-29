package com.grupoica.repasojava.interfaces;

public class Caballo extends Vehiculo {
	
	private int dientes;
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
		System.out.println("dale caballito " 
							+ marca);
	}

	@Override
	public void desplazarse(float distancia) {
		System.out.println(marca + " galopa a tope " + distancia + " metros ");
		
	}
	
	
	

}
