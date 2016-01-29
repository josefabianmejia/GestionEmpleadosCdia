package com.cdia.data.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public abstract class Persona {
	
	protected String doc;	
	protected Long tpDoc;
	protected String ciudadExpDoc;
	protected Date fchNac;
	protected char estadCiv;	
	protected String nombrs;	
	protected String tel;
	protected String cel;	
	protected String direc;
	protected Pais PaisResid;
	protected Departamento deptoResid;
	protected Ciudad ciudadResid;	
	
	public Persona() { }
	
	public Persona(String doc) { 
		this.doc = doc;
	}

	public abstract String getDoc();
	public abstract Long getTpDoc();
	public abstract String getCiudadExpDoc();
	public abstract Date getFchNac();	
	public abstract char getEstadCiv();	
	public abstract String getNombrs();
	public abstract String getTel();
	public abstract String getCel();
	public abstract String getDirec();
	public abstract Pais getPaisResid();
	public abstract Departamento getDeptoResid();
	public abstract Ciudad getCiudadResid();	

	public void setDoc(String doc) {
		this.doc = doc;
	}
	
	public void setTpDoc(Long tpDoc) {
		this.tpDoc = tpDoc;
	}	

	public void setCiudadExpDoc(String ciudadExpDoc) {
		this.ciudadExpDoc = ciudadExpDoc;
	}
	
	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}

	public void setEstadCiv(char estadCiv) {
		this.estadCiv = estadCiv;
	}

	public void setNombrs(String nombrs) {
		this.nombrs = nombrs;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}	

	public void setPaisResid(Pais paisResid) {
		PaisResid = paisResid;
	}
	
	public void setDeptoResid(Departamento deptoResid) {
		this.deptoResid = deptoResid;
	}

	public void setCiudadResid(Ciudad ciudadResid) {
		this.ciudadResid = ciudadResid;
	}	
	
}
