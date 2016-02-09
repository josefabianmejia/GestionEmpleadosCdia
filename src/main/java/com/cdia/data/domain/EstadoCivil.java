package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstadoCivil<T> {
	private T estado;
	
	public EstadoCivil() { }
	
	public EstadoCivil(T estado) {
		this.estado = estado;
	}

	@Column(name = "EDOCIV")
	public T getEstado() {
		return estado;
	}

	public void setEstado(T estado) {
		this.estado = estado;
	}
	
}
