package com.grupoica.repasojava.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProbandoVehiculos {

	public static void probar() {
		Coche miCoche = new Coche("Kia", 1500, 60.34f);
		miCoche.aceleracion();
		Coche miCocheFines = new Coche("Hammer", 2500, 60.34f);
		miCocheFines.aceleracion();
		Caballo miCaballo = new Caballo("Unicornio", 450, 50);
		miCaballo.aceleracion();
		// Polimorfismo: pero lo que se pasa es la referencia 
		// (el puntero, la direcci�n de memoria)
		Vehiculo unVehiculo = miCoche;	// Casting impl�cito
		Object unObjeto = miCoche;
		Coche unCoche = (Coche) unObjeto;	// Casting expl�cito
		System.out.println(unObjeto.toString());
		unVehiculo.aceleracion();
		ArrayList<Motorizable> garaje = new ArrayList<>();
		// garaje.add(miCaballo); // Caballo no es motorizable
		garaje.add(miCoche);
		garaje.add(miCocheFines);
		// No se puede
		// garaje.add(new Vehiculo("Que no he comprado", 30));
		garaje.add((Coche) unVehiculo);
		garaje.add(new Patinete(15));
		
		for (Motorizable objMotor : garaje) {			
			objMotor.encender();
			if (objMotor instanceof Vehiculo ) {
				Vehiculo vehiculo = (Vehiculo) objMotor;
				vehiculo.aceleracion();
				vehiculo.desplazarse(1.5f);
			}
		}
		System.out.println("");
		Motorizable vehMotor = miCoche;
		vehMotor.encender();
		
		HashMap<String, Animal> granja = new HashMap<>();
		granja.put("perro", new Perro("Guau guay"));
		granja.put("caballo", new Caballo("Pura sangre", 200, 50));
		granja.put("caballo2", miCaballo);
		for (Map.Entry<String, Animal> animal : granja.entrySet()) {
			animal.getValue().alimentarse("Pollo");
			animal.getValue().alimentarse("calabacin");
		}
	}
	/* Ejercicios: 
	 * 1 - Garaje ser� solo para objetos motorizables.
	 * 2 - Crear clase Patinete que sea motorizable, pero no veh�culo.
	 * 3 - Guarderemos un patinete en el garaje.
	 * 4 - Hacer una clase Perro (que tampoco es un veh�culo).
	 * 5 - Crear una interfaz Animal con metodo.
	 * 			alimentarse(String comida)
	 * 6 - Perro y Caballo que sean animales, y hacer una granja
	 * 		y alimentarlos.
	 * */

	public static void granja() {
		// TODO Auto-generated method stub
		
	}
}

