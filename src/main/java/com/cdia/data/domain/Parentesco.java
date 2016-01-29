package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTPARENT")
public class Parentesco {
	private String id;
	private String nombre;
	
	public Parentesco() { }
	
	public Parentesco(String id) {
		this.id = id;
	}

	@Id
	@Column(name="CODPAREN")
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
		return "Parentesco:"+nombre;
	}	

}
