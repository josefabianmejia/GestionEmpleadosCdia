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

	@Column(name = "CCPAREN")
	@Override
	public String getDoc() {
		return doc;
	}

	@Column(name = "TIPODCTO")
	@Override
	public Long getTpDoc() {
		return tpDoc;
	}

	@Column(name = "CCEXPED")
	@Override
	public String getCiudadExpDoc() {
		return ciudadExpDoc;
	}

	@Column(name = "FHNACIM")
	@Override
	public Date getFchNac() {
		return fchNac;
	}

	@Column(name = "EDOCIV")
	@Override
	public char getEstadCiv() {
		return estadCiv;
	}

	@Column(name = "NOMBRE")
	@Override
	public String getNombrs() {
		return nombrs;
	}	

	@Column(name = "TELEFONO")
	@Override
	public String getTel() {
		return tel;
	}

	@Column(name = "CELULAR")
	@Override
	public String getCel() {
		return cel;
	}
	
	@Column(name = "DIRECCION")
	@Override
	public String getDirec() {
		return direc;
	}

	@ManyToOne
	@JoinColumn(name="CODPAISRES")
	@Override
	public Pais getPaisResid() {
		return PaisResid;
	}

	@ManyToOne
	@JoinColumn(name="CODDPTORES")
	@Override
	public Departamento getDeptoResid() {
		return deptoResid;
	}

	@ManyToOne
	@JoinColumn(name="CODCIUDRES")
	@Override
	public Ciudad getCiudadResid() {
		return ciudadResid;
	}

	@Override
	public String toString() {
		return "Familiar:"+nombrs+"Parentesco:"+parentesco;
	}
	
}