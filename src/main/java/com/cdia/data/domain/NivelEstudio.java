package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTESTUD")
public class NivelEstudio {
	
	private String id;
	private String nombre;
	
	public NivelEstudio() { }
	
	public NivelEstudio(String id) {
		this.id = id;
	}

	@Id
	@Column(name = "CODESTUD")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
