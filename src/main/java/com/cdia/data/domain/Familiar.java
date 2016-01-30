package com.cdia.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MVFAMIL")
public class Familiar extends Persona {
	
	private Long id;
	private String doc;	
	private Date fchNac;
	private Empleado empleado;
	private Parentesco parentesco;	
	
    public Familiar() {  }     
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDMVFAMIL")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "CCPAREN")	
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}	
	
	@Column(name = "FHNACIM")	
	public Date getFchNac() {
		return fchNac;
	}
	
	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}
	
	@ManyToOne
	@JoinColumn(name="CEDULA")
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@ManyToOne
    @JoinColumn(name = "CODPAREN")
	public Parentesco getParentesco() {
		return parentesco;
	}
	
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "Familiar:"+contacto+"Parentesco:"+parentesco;
	}
	
}