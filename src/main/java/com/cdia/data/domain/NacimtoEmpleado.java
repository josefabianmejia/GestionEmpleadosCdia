package com.cdia.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class NacimtoEmpleado {
	private Date fchNac;
	private Pais paisNac;	
	private Departamento deptoNac;	
	private Ciudad ciudadNac;
	
	public NacimtoEmpleado() { }
	
	@Column(name="FECNAC")		
	public Date getFchNac() {
		return fchNac;
	}
	
	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}
	
	@ManyToOne
	@JoinColumn(name="CODPAISNAC")
	public Pais getPaisNac() {
		return paisNac;
	}

	public void setPaisNac(Pais paisNac) {
		this.paisNac = paisNac;
	}

	@ManyToOne
	@JoinColumn(name="CODDPTONAC")
	public Departamento getDeptoNac() {
		return deptoNac;
	}
	
	public void setDeptoNac(Departamento deptoNac) {
		this.deptoNac = deptoNac;
	}

	@ManyToOne
	@JoinColumn(name="CODCIUDNAC")
	public Ciudad getCiudadNac() {
		return ciudadNac;
	}
	
	public void setCiudadNac(Ciudad ciudadNac) {
		this.ciudadNac = ciudadNac;
	}	
	
}
