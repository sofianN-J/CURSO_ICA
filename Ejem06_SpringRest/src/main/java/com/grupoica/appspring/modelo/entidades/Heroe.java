package com.grupoica.appspring.modelo.entidades;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Heroe {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		@Basic(optional = false) //NOT NULL SQL
		private String nombre;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	

}
