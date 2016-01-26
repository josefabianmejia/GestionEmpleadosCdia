package com.cdia.data.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MTCARGOS")
public class Cargo {
	@Id
	@Column(name="CODCARGO")
	private String id;
	
	@Column(name="NOMCARGO")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="DEPEN")
	private Dependencia dependencia;
		
    public Cargo() { }

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

	public Dependencia getDependencia() {
		return dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

	@Override
	public String toString() {
		return "CARGO:"+nombre+dependencia;
	}
	
	        
}