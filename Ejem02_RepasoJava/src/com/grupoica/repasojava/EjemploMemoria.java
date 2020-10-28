package com.grupoica.repasojava;

import com.grupoica.repasojava.modelo.Usuario;


public class EjemploMemoria {

	//variable estatica, para que sea accesible y global
	static int xx = 10; 
	public static void pruebaPasoPorValor() {
		
		
		boolean y = true; 
		String z = "Texto al declarar";
		funcionCualquiera(xx, y, z);
		System.out.println("XX = " + xx + ", Y = " + y + ", Z = " + z);
	}
	// Las variables primitivas (y String) se pasan por valor
	// se crean copias de las variables
	private static void funcionCualquiera(int x, boolean y, String z) {
		
		System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
		x = 200;
		y = false;
		z = "Texto nuevo dentro de funci�n";
		System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);
	}
	

	public static void pruebaPasoPorReferencia() {
		// Declaraci�n variable: Reservamos un espacio peque�o s�lo para
		// la direcci�n de memoria, es decir, entre 4 y 8 bytes
		// En realidad s�lo declaramos una referencia a un objeto �Que valor tiene?
		Usuario alguien = null;	// Direcci�n 0, a ninguna parte
		// instanciaci�n del objeto y asignaci�n a la variable
		// Instanciaci�n: Reserva de memoria para todos los campos (4 + 8 bytes = 12 bytes)
		// Llamada al constructor: Se reveservan otro 20 bytes (12 + 20 = 32 bytes)
		// Asignaci�n coge la direcci�n de memoria que devuelve new y la pone en alguien
		alguien = new Usuario("Pepito el del Quinto", 30);
		int array[] = new int[3];
		array[0] = 10; array[1] = 20; array[2] = 30;
		otraFuncion(alguien, array);
		System.out.println("nombre = " + alguien.getNombre() 
			+ ", Elemento 0 = " + array[0]);
		
		int otroArray[] = array;
		otroArray[0] = 333;
		System.out.println("nombre = " + alguien.getNombre() 
		+ ", Elemento 0 = " + array[0]);
	}
	// Esta funci�n s�lo recibe, 8 bytes por cada par�metro con la referencia
	private static void otraFuncion(Usuario parUsu, int[] parArr) {

		System.out.println("nombre = " + parUsu.getNombre() 
			+ ", Elemento 0 = " + parArr[0]);
		
		parUsu.setNombre("Modif en funcion");
		parArr[0] = 9999;
		
		System.out.println("nombre = " + parUsu.getNombre() 
		+ ", Elemento 0 = " + parArr[0]);
	}
}
