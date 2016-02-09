package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTTPVIVIEN")
public class TpVivienda {
	
	private String id;	
	private String nombre;
	
	public TpVivienda() { }
	
	public TpVivienda(String id) { 
		this.id = id;
	}
	
	public TpVivienda(String id,String nombre) { 
		this.id = id;
		this.nombre = nombre;
	}
	
	
	@Id
	@Column(name="CODVIVIEND")
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
		
}
