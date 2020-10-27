package com.grupoica.repasojava.modelo;
/*
 *clase que se encargara de las operacion C.R.U.D
 Create read update delete(Op. Alta, baja, modifiacion y consulta)
 */

import java.util.ArrayList;

import com.grupoica.repasojava.EjemploMemoria;

public class GestionUsuarios {
	
	private ArrayList listaUsuarios;

	public GestionUsuarios() {
		super();
		this.listaUsuarios = new ArrayList();
		this.listaUsuarios.add(10);
		Usuario usu = new  Usuario();
		usu.setEdad(30);
		usu.setNombre("Menganito");
		this.listaUsuarios.add(usu);
		System.out.println("Nombre: " + usu.getNombre());
		this.listaUsuarios.add(usu);
		
		Usuario u2 = new Usuario("U2", 50);
		System.out.println("EDAD U2: " + usu.getEdad());
		System.out.println("EDAD U2: " + u2.getEdad());
		
		
		this.listaUsuarios.add("Texto");
		//object clase padre
		this.listaUsuarios.add(new Object());
		
		//se puede poner o no, se pone para que no tenga conflicto.
		this.listarUsuarios();
		
		
		if(u2.equals(usu)) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		//creamos a un loco
		Loco joker = new Loco();
		joker.setNombre("joker");
		joker.setEdad(22);
		System.out.println("Nombre: " + joker.toString());
		Loco sofian = new Loco();
		sofian.setNombre("sofian");
		sofian.setEdad(24);
		
		int edadJoker= joker.getEdad();
		int edadSofian = sofian.getEdad();
		if(joker.equals(sofian.getNombre())) {
			System.out.println("los nombre son iguales");
		}else if(edadJoker == edadSofian) {
			System.out.println("la edad es igual");
		}else {
			System.out.println("No es igual");
		}
		
		
		
	}
	
	public void listarUsuarios() {
		for(int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(this.listaUsuarios.get(i));
		}
	}
	
	//metodo para añadir lo que admita listausuario, es decir, cualquir OBJECT
	public void addUser(Object obj) {
		this.listaUsuarios.add(obj);
	}
}
