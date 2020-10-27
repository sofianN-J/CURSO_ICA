package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.Usuario;

public class EjemploMemoria {
	
	
	public static void pruebaPasoPorValor() {
		int xx = 10;
		boolean y = true;
		String z = "texto al declarar";
		funionCulquiera(xx, y,  z);
		System.out.println("xx = " + xx + "y = " + y + "z= " + z);
	}
	
	private static void funionCulquiera(int x, boolean y, String z) {
		System.out.println("x = " + x+ "y = " + y + "z= " + z);
		x = 200;
		y = false;
		z = "texto nuevo dentro funcion";
		System.out.println("x = " + x+ "y = " + y + "z= " + z);
	}
	
	public static void pruebaPasoPorReferencia() {
		Usuario alguien = new Usuario("pepito", 30);
		int array[] = new int[3];
		array[0] = 10; array[1] = 20; array[2] = 30;
		System.out.println(alguien.getNombre());
	}
	
	
}
