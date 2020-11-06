package com.grupoica.appspring.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupoica.appspring.modelo.daos.HeroesDAO;
import com.grupoica.appspring.modelo.entidades.Heroe;

@RestController
@RequestMapping("/api/heroes")
public class ControladorHeroes {
	
	@Autowired
	HeroesDAO heroesDAO;
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/prueba")
	public Heroe leerHeroe() {
		System.out.println(">>>>>>>>> peticion recibida");
		Heroe heroe = new Heroe();
		heroe.setNombre("Hulk");
		return heroe;
	}
	
	@PostMapping
	public Heroe guardarHeroe(@RequestBody Heroe nuevoHeroe) {
		System.out.println(">>>>>>>>>> Heroe recibido " + nuevoHeroe.getNombre());
		return heroesDAO.save(nuevoHeroe);
	}
	
	@PostMapping
	public Heroe actualizar(@RequestBody Heroe nuevoHeroe) {
		if(nuevoHeroe.getId() > 0) {
			System.out.println(">>>>>>>>>> Heroe recibido " + nuevoHeroe.getNombre());
			return heroesDAO.save(nuevoHeroe);
		}else {
			System.out.println(">>>>>>>>>> Heroe sin ID " + nuevoHeroe.getNombre());
			return null;
		}
		
		
	}
	
	public void borrar(@RequestBody Heroe nuevoHeroe) {
		if(nuevoHeroe.getId() > 0) {
			return heroesDAO.delete(nuevoHeroe);
		}else {
			System.out.println(">>>>>>>>>>no borrado Heroe sin ID " + nuevoHeroe.getNombre());
			return null;
		}
	}
	

}
