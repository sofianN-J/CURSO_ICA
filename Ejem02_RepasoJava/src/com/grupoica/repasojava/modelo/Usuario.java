package com.grupoica.repasojava.modelo;

//tipica clase de plain old java oject.(POJO)
public class Usuario extends Object {
	
	
	private String nombre;
	private int edad;
	
	public Usuario() {
		//constructor por defecto.
		nombre = "Sin Nombre";
	}
	
	//sobre carga de metodos
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//get and set --> click derecho/source/getter and setter.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override /*estoo es una sobre escritura*/
	public boolean equals(Object obj) {
		Usuario usuario = (Usuario) obj;
		return this.nombre == usuario.nombre 
				&& this.edad == usuario.edad;
	}
	
	//@Override ya no sirve ya que es una sobrecarga
	public boolean equals(Usuario usuario) {
		
		return this.nombre == usuario.nombre 
				&& this.edad == usuario.edad;
	}
	
	//con @ empizan las anotaciones
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario" + nombre + "{" + edad + "}";
	}
	
	
	/*@OVERRIDE --> SOBREESCRIBIR: MACHACAR METODO DEL PADRE
	 * 				SOBRECARGA: CUANDO TENEMOS 2 METODOS O CONSTRUCTORESCON EL MISMOS NOMBRE
	 * PERO CON DISTINTOS PARAMETROS. 
	 * 				
	 * */
	
	
	
	
	
	
}
