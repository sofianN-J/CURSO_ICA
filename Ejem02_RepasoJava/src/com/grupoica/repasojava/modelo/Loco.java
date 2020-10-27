package com.grupoica.repasojava.modelo;

public class Loco extends Usuario {
	
	private boolean tipoLocura;
	
	public Loco() {
		super();
	}
	
	//getters and setters
	public boolean isTipoLocura() {
		return tipoLocura;
	}

	public void setTipoLocura(boolean tipoLocura) {
		this.tipoLocura = tipoLocura;
	}
	

//	@Override /*estoo es una sobre escritura*/
	/*
	public boolean equals(Object obj) {
		Loco loco1 = (Loco) obj;
		return this.tipoLocura == loco1.tipoLocura; 
				
	}
	*/
	/*
	//@Override ya no sirve ya que es una sobrecarga
	public boolean equals(Loco loco1) {
		
		return this.tipoLocura == loco1.tipoLocura;
				
	}

	*/
	/*
	//con @ empizan las anotaciones
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EL LOCO ES-->" + tipoLocura;
	}
	*/
		
	
	
	
}
