package com.peliculas.series;

public class VideoJuego implements Entregable {
	
	//atributos
	String titulo;
	int horasEstimadas = 10;
	boolean entregado = false;
	char genero;
	String compania;
	
	//CONSTRUCTORES
	public VideoJuego() {
		//constructor por defecto
	}
	
	public VideoJuego(String tituloP, int horasEstimadasP) {
		this.titulo = tituloP;
		this.horasEstimadas = horasEstimadasP;
	}
	//constructor con todos los atributos menos el de entregado.
	public VideoJuego(String tituloP, int horasEstimadasP, char generoP, String companiaP) {
		this.titulo = tituloP;
		this.horasEstimadas = horasEstimadasP;
		this.genero = generoP;
		this.compania = companiaP;
	}
	
	//generando get and set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	
	//metodo toString
	@Override
	public String toString() {
		return "VideoJuego [titulo= " + titulo + ", horasEstimadas= " + horasEstimadas + ", entregado= " +
				entregado + ", genero=" + genero + ", compania=" + compania + "]";
	}
	
	//metodos de la interfaz
		public void entregar() {
			System.out.println("ff");
		}
		public void devolver() {
			
		}
		
		public void isEntregado() {
			
		}
		
		public void compareTo(Object a) {
			
		}

	
	
	
	
	
	
	
	
	
	
}
