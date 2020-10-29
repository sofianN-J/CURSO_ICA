package com.grupoica.repasojava.interfaces;

import java.util.ArrayList;

public class ProbandoVehiculos {

	public static void probar() {
		ArrayList<Vehiculo> garaje = new ArrayList<>();
		ArrayList<Vehiculo> garajeMotorizables = new ArrayList<>();
		Coche miCoche = new Coche("Kia", 1500, 60.34f);	
		Patinete miPatinete = new Patinete("sofianPatines", 2500, "rueda dura");
		miCoche.aceleracion();
		
		Coche miCocheFines = new Coche("Hammer", 3000, 60.34f);	
		
		Caballo miCaballo = new Caballo("arabe", 500, 40);	
		miCaballo.aceleracion();
		//polimorfismo: lo que se pasa es la referencia
		//(puntero, la direccion memoria)
		Vehiculo unVehiculo = miCoche; //casting implicito
		//Vehiculo unVehiculoq = miPatinete;
		Object unObjeto = miCoche;
		Object unObj = miPatinete;
		
		
		
		Patinete patin = (Patinete) unObj;
		Coche unCoche = (Coche) unObjeto;
		System.out.println(unObjeto.toString());
		unVehiculo.aceleracion();
		
		
			
		
		
		garaje.add(miCaballo);
		garaje.add(miCoche);
		garaje.add(miCocheFines);
		garaje.add(miPatinete);
		//no podemos ya que la clase vehiculo es abstracta
		//garaje.add(new Vehiculo("que no he comprado", 30));
		garaje.add(unVehiculo);
		
		//creando garaje para motorizables
		
		garajeMotorizables.add(miCoche);
		//aniadir patinete al garaje
		
		for(Vehiculo vehiculo: garaje) {
			vehiculo.aceleracion();
			vehiculo.desplazarse(1.5f);
		}
		
		
		miCoche.encender();
		Motorizable vehMotor = miCoche;
		vehMotor.encender();
		
		
	}
	/* Ejercicios: 
	 * 1 - Garaje será solo para objetos motorizables.
	 * 2 - Crear clase Patinete que sea motorizable, pero no vehículo
	 * 3 - Guarderemos un patinete en el garaje 
	 * */

	
	

}
