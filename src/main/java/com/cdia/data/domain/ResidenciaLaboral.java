package com.cdia.data.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ResidenciaLaboral {
	private Pais Pais;
	private Departamento departamento;
	private Ciudad ciudad;
	
	public ResidenciaLaboral() { }

	@ManyToOne
	@JoinColumn(name="CODPAISLAB")
	public Pais getPais() {
		return Pais;
	}

	public void setPais(Pais pais) {
		Pais = pais;
	}

	@ManyToOne
	@JoinColumn(name = "CODDPTOLAB")
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@ManyToOne
	@JoinColumn(name = "CODCIUDLAB")
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
}
