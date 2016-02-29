package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass 
public abstract class Persona {	
	
	protected String ciudadExpDoc;
	protected TpDctoIdentificacion tpDoc;
	protected Contacto contacto;
	protected Profesion profesion;
	
	public Persona() { }
		
	@Column(name = "CCEXPED")
	public String getCiudadExpDoc(){
		return ciudadExpDoc;
	}
	
	public void setCiudadExpDoc(String ciudadExpDoc) {
		this.ciudadExpDoc = ciudadExpDoc;
	}

	@ManyToOne
	@JoinColumn(name="TIPODCTO")
	public TpDctoIdentificacion getTpDoc(){ 
		return tpDoc;
	}	
	
	public void setTpDoc(TpDctoIdentificacion tpDoc) {
		this.tpDoc = tpDoc;
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
