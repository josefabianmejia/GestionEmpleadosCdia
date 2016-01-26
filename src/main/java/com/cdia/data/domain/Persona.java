package com.cdia.data.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="[MTHOJAV]")
public class Persona {
	
	@Id
	@Column(name="CODIGO")
	private String id;
	
	@Column(name="CEDULA")
	private String doc;
	
	@Column(name="TIPODCTO")
	private Long tpDoc;
	
	@Column(name="CCEXPED")
	private String ciudadExpDoc;
	
	@Column(name="FECNAC")	
	private Date fchNac;
	
	@Column(name="EDOCIV")
	private char estadCiv;		
	
	@ManyToOne
	@JoinColumn(name="CODPAISNAC")
	private Pais paisNac;

	@ManyToOne
	@JoinColumn(name="CODDPTONAC")
	private Departamento deptoNac;
	
	@ManyToOne
	@JoinColumn(name="CODCIUDNAC")
	private Ciudad ciudadNac;	
	
	@Embedded
	private Contacto contacto;
	
	@Embedded
	private CaractFisca caractFisc;

	@Embedded
	private HabitPersonal habits;	
	
    public Persona() {  }
       
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public Long getTpDoc() {
		return tpDoc;
	}
	public void setTpDoc(Long tpDoc) {
		this.tpDoc = tpDoc;
	}
	public String getCiudadExpDoc() {
		return ciudadExpDoc;
	}
	public void setCiudadExpDoc(String ciudadExpDoc) {
		this.ciudadExpDoc = ciudadExpDoc;
	}
	public Date getFchNac() {
		return fchNac;
	}
	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}
	public char getEstadCiv() {
		return estadCiv;
	}
	public void setEstadCiv(char estadCiv) {
		this.estadCiv = estadCiv;
	}	
	public Pais getPaisNac() {
		return paisNac;
	}
	public void setPaisNac(Pais paisNac) {
		this.paisNac = paisNac;
	}	
	public Departamento getDeptoNac() {
		return deptoNac;
	}
	public void setDeptoNac(Departamento deptoNac) {
		this.deptoNac = deptoNac;
	}
	public Ciudad getCiudadNac() {
		return ciudadNac;
	}
	public void setCiudadNac(Ciudad ciudadNac) {
		this.ciudadNac = ciudadNac;
	}	
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}	
	public CaractFisca getCaractFisc() {
		return caractFisc;
	}
	public void setCaractFisc(CaractFisca caractFisc) {
		this.caractFisc = caractFisc;
	}	
	public HabitPersonal getHabits() {
		return habits;
	}
	public void setHabits(HabitPersonal habits) {
		this.habits = habits;
	}

	@Override
	public String toString() {		
		return "CODIGO:"+id+" NAC:"+paisNac+deptoNac+ciudadNac+"CONTAC:"+contacto+" CARCT:"+caractFisc+habits;
	}
}