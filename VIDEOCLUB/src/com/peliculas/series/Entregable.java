package com.peliculas.series;

public interface Entregable {
	
	
	public void entregar(); //el atributo prestado a true
	
	public void devolver(); //cambia el estado prestado a false;
	
	public void isEntregado(); //devuelve el estado del atributo prestado 
	
	//para comparar las horas y la serie de objetos
	public void compareTo(Object a);
		
		
	
}
