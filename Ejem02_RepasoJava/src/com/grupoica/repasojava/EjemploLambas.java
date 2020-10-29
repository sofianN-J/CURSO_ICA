package com.grupoica.repasojava;

public class EjemploLambas {
	
	// Una interfaz es funcional cuando S�LO tiene UN M�TODO
	interface NuestraFun {
		float operacion(float v, float w);
	}

	public static float sumar(float x, float y)  {
		return x + y;
	}
	public static float resta(float x, float y)  {
		return x - y;
	}
	public static float[] sumarArrays(float[] arr_1, float[] arr_2) {
		float[] arrRes = new float[arr_1.length];
		for (int i = 0; i < arr_1.length && i < arr_2.length; i++) {
			arrRes[i] = arr_1[i] + arr_2[i];
		}
		return arrRes;
	}
	public static float[] operarArrays(
		float[] arr_1, float[] arr_2, NuestraFun funCallback ) {
		float[] arrRes = new float[arr_1.length];
		for (int i = 0; i < arr_1.length && i < arr_2.length; i++) {
			arrRes[i] = funCallback.operacion(arr_1[i], arr_2[i]);
		}
		return arrRes;
	}
	
	public static void ejecutarLambdas() {
		float[] a = {2, 3, 4};
		float[] b = {25, 10, 40};
		float[] r = sumarArrays(a, b);
		for (float f : r) {
			System.out.print(" - " + f);
		}
		System.out.println("");
		float[] r2 = operarArrays(a, b, EjemploLambas::resta );
		for (float f : r2) {
			System.out.print(", " + f);
		}
		System.out.println("");
		float[] mult = operarArrays(a, b, (float x, float y) -> {
			System.out.println("Multiplicando " + x + " * " + y + " = " + 
						x * y);
			return x * y;
		});
		System.out.println("");
		float[] div = operarArrays(a, b, (float x, float y) -> {
			return x / y;
		});
		for (float f : div) {
			System.out.print(", " + f);
		}
	}
	// Dos calculos sobre arrays: 
	// resta usando fun est�tica y divisi�n usando lambda
}
