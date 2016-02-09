package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmpresaLabora {
	private String ocupacion;	
	private String empresa;
	
	public EmpresaLabora() { }

	@Column(name = "OCUPACION" )
	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	@Column(name = "EMPRESA")
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}	
	
}
