package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

@MappedSuperclass 
public abstract class Persona {
	
	protected Long tpDoc;
	protected String ciudadExpDoc;	
	protected Contacto contacto;
	protected Profesion profesion;
	
	public Persona() { }
	
	@Column(name="TIPODCTO",nullable=false)
	public Long getTpDoc(){ 
		return tpDoc;
	}
	
	public void setTpDoc(Long tpDoc) {
		this.tpDoc = tpDoc;
	}
	
	@Column(name = "CCEXPED")
	public String getCiudadExpDoc(){
		return ciudadExpDoc;
	}
	
	public void setCiudadExpDoc(String ciudadExpDoc) {
		this.ciudadExpDoc = ciudadExpDoc;
	}

	@Embedded
	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	@Embedded
	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
}
