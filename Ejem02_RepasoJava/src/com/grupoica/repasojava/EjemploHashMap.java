package com.grupoica.repasojava;

import java.util.HashMap;
import java.util.Scanner;

import com.grupoica.repasojava.modelo.Usuario;

public class EjemploHashMap {
	
	public class ClaveDicc {
		String nombre;
		String fecha;
	}
	//public static HashMap<ClaveDicc, Usuario> diccUsuarios;
	public static HashMap<String, Usuario> diccUsuarios = new HashMap<>();
	
	public static void probandoHashMap() {
		 diccUsuarios.put("Luis", new Usuario("Luis", 18));
		 diccUsuarios.put("Ana", new Usuario("Ana", 20));
		 diccUsuarios.put("Luisa", new Usuario("Luisa", 30));
		 diccUsuarios.put("U2", new Usuario("U2", 999));
		 Scanner escaner = new Scanner(System.in);
		 System.out.println("Introduzca el usuario:");
		 String nombre = escaner.nextLine();
		 System.out.println("El usuario es " 
				 + diccUsuarios.get(nombre).toString());
	}
}
