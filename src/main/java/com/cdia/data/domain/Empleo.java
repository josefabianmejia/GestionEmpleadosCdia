package com.cdia.data.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Empleo {
	
	private Cargo cargo;	
	private Dependencia dependencia;	
	private EstadoEmpleo estado;	
	
    public Empleo() { }

    @ManyToOne
	@JoinColumn(name="CODCARGO")
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	@ManyToOne
	@JoinColumn(name="DEPEN")
	public Dependencia getDependencia() {
		return dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}
	
	@ManyToOne
	@JoinColumn(name="CODESTADO")
	public EstadoEmpleo getEstado() {
		return estado;
	}

	public void setEstado(EstadoEmpleo estado) {
		this.estado = estado;
	}   	
	
}