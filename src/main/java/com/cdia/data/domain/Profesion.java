package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Profesion {
	private String nombre;	
	
	public Profesion() { }
	
	public Profesion(String nombre) { 
		this.nombre = nombre;
	}
			
	@Column(name = "PROFESION")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
