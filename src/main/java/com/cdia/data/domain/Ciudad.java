package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CIUDAD")
public class Ciudad {
	
	@Id
	@Column(name="CODCIUDAD")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	public Ciudad() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CIUDAD:"+nombre;
	}
	
}
