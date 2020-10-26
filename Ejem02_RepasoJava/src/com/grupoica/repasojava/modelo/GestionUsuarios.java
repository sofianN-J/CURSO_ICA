package com.grupoica.repasojava.modelo;
/*
 *clase que se encargara de las operacion C.R.U.D
 Create read update delete(Op. Alta, baja, modifiacion y consulta)
 */

import java.util.ArrayList;

public class GestionUsuarios {
	
	ArrayList listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
		this.listaUsuarios.add(10);
		Usuario usu = new  Usuario();
		usu.edad = 30;
		usu.nombre = "Menganito";
		this.listaUsuarios.add(usu);
		System.out.println("Nombre: " + usu.nombre);
		this.listaUsuarios.add(usu);
		
		Usuario u2 = new Usuario("U2", 50);
		System.out.println("EDAD U2: " + usu.edad);
		System.out.println("EDAD U2: " + u2.edad);
		
		
		this.listaUsuarios.add("Texto");
		//object clase padre
		this.listaUsuarios.add(new Object());
		for(int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}
}
