package com.peliculas.series;

public class Serie implements Entregable {
	
	
	
	
	String titulo;
	//numero de temporadas por defecto es 3.
	int numeroTemporadas = 3;
	//la variable por defecto sera false.
	boolean entregado = false;
	char genero;
	String creador;
	
	//CONSTRUCTORES
	public Serie() {
		//constructor por defecto.
	}
	
	//constructor con solo el titulo y el creador el resto por defecto.
	public Serie(String tituloP, String creadorP) {
		this.titulo = tituloP;
		this.creador = creadorP;
	}
	
	//un constructor con todos los atributos menos el de entregado.
	public Serie(String tituloP, int numeroTemporadasP, char generoP, String creadorP) {
		 this.titulo = tituloP;
		 this.numeroTemporadas = numeroTemporadasP;
		 this.genero = generoP;
		 this.creador = creadorP;
	}

	
	//METODOS GET AND SET DE TODOS LOS ATRIBUTOS MENOS EL DE ENTREGADO.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	//SOBREESCRIBIMOS EL METODO toString();
	@Override
	public String toString() {
		return "El tiutlo es " + titulo + "numero de temporadas es " + numeroTemporadas + 
				"el estado de la entrega es " + entregado + "el genero es " + genero + 
				"el creador es: " + creador;
	}
	@Override
	//metodos de la interfaz
	public void entregar() {
		
			entregado = true;
		
	}
	@Override
	public void devolver() {
		
			entregado = false;
		
	}
	
	@Override
	public boolean isEntregado() {
		if(entregado) {
			return true;
		}else 
			return false;
		
	}
	@Override
	public void compareTo(Object a) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
