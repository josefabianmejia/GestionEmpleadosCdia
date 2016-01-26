package com.cdia.data.domain;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTDEPEN")
public class Dependencia {
	
	@Id
	@Column(name="DEPEN")
	private String id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
    public Dependencia() {
    }

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
		return "DEPEN:"+nombre;
	}
}