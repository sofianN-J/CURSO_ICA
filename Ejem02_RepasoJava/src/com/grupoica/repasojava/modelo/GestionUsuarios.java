package com.grupoica.repasojava.modelo;

import java.util.ArrayList;

/* Clase que se encar� de las operaciones C.R.U.D.
 * Create Read Update Delete (Op. Alta, baja, modificaci�n y consulta)
 * */ 
public class GestionUsuarios {
	
	private ArrayList listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
		this.listaUsuarios.add(10);
		Usuario usu = new Usuario();
		usu.setEdad(30);
		usu.setNombre("Fulanito Mengano");
		System.out.println("Nombre: " + usu.getNombre());
		this.listaUsuarios.add(usu);
		
		Usuario u2 = new Usuario("U2", 50);
		System.out.println("Edad u2: " + u2.getEdad());
		
		this.listaUsuarios.add("Texto");
		this.listaUsuarios.add(new Object());
		this.listarUsuarios();
		
		if (u2.equals(usu)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		Loco joker = new Loco();
		joker.setNombre("Joker");
		System.out.println("Joker: " + joker.toString());
	}	
	public void listarUsuarios() {
		
		for (int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}
	public void add(Object obj) {
		this.listaUsuarios.add(obj);
	}

}
