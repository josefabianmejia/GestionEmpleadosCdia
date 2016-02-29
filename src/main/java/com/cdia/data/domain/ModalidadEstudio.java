package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTMODAL")
public class ModalidadEstudio {
	
	private String id;
	private String nombre;
	
	public ModalidadEstudio() {  }
	
	public ModalidadEstudio(String id) {  
		this.id = id;
	}

	@Id
	@Column(name = "CODMODAL")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "DESCRIPCIO")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
