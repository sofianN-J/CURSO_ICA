package com.grupoica.repasojava.interfaces;

public class Patinete extends Vehiculo implements Motorizable {
	
	String rueda;
	
	
	
	public Patinete(String marca, float peso, String rueda) {
		super(marca, peso);
		this.rueda = rueda;
	}


	public String getRueda() {
		return rueda;
	}


	public void setRueda(String rueda) {
		this.rueda = rueda;
	}
	
	
	@Override
	public void encender() {
		
		
	}


	@Override
	public void desplazarse(float distancia) {
		// TODO Auto-generated method stub
		
	}

}
