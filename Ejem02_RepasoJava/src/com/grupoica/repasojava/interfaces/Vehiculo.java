package com.grupoica.repasojava.interfaces;

// Si no queremos que sea posible instanciar una clase, la declaramos abstracta
public abstract class Vehiculo {

	protected String marca;
	protected float peso;
	
	public Vehiculo(String marca, float peso) {
		super();
		this.marca = marca;
		this.peso = peso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void aceleracion() {
		System.out.println(getClass().getSimpleName() + " " 
				+ marca + " Acelerando...");
	}
	public abstract void desplazarse(float distancia);
}
