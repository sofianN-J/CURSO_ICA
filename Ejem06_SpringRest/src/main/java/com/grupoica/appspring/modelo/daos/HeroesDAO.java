package com.grupoica.appspring.modelo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoica.appspring.modelo.entidades.Heroe;

public interface HeroesDAO extends JpaRepository<Heroe, Integer> {

	

}
