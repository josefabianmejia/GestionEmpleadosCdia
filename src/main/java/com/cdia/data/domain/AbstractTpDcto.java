package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractTpDcto<T> {
	
	private T id;
	private String nombre;
	
	public AbstractTpDcto() { }
	
	public AbstractTpDcto(T id) {
		this.id =id;		
	}	
	
	@Id
	@Column(name="CODDCTO")
	public T getId() {
		return id;
	}
	public void setId(T id) {
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
