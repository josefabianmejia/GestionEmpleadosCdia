package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTDEPTO")
public class Departamento {
	
	@Id
	@Column(name="CODDEPTO")
	private String id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	public Departamento() { }

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "DEPART:"+nombre;
	}
	
	
	
}
