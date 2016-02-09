package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Sexo<T> {
	private T sexo;
	
	public Sexo(){ }
	
	public Sexo(T sexo){
		this.sexo = sexo;
	}

	@Column(name = "SEXO")
	public T getSexo() {
		return sexo;
	}

	public void setSexo(T sexo) {
		this.sexo = sexo;
	}	

}
