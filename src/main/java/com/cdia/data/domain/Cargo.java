package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MTCARGOS")
public class Cargo {
	
	private String id;	
	private String nombre;	
	private Dependencia dependencia;
		
    public Cargo() { }
    
    public Cargo(String id) {
    	this.id = id;
    }


    @Id
	@Column(name="CODCARGO")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="NOMCARGO")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne
	@JoinColumn(name="DEPEN")
	public Dependencia getDependencia() {
		return dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

	@Override
	public String toString() {
		return "CARGO:"+id+nombre+dependencia;
	}
	        
}