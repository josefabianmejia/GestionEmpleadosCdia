package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTPAISES")
public class Pais {	
	
	private String id;	
	private String nombre;
	
	public Pais() { }
	
	public Pais(String id) {
		this.id =id;
	}

	@Id
	@Column(name="CODIGO")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PAIS:"+nombre;
	}	
	
	
}
