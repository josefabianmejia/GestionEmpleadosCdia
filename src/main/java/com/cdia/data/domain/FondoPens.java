package com.cdia.data.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="AFP")
public class FondoPens extends AbstractPrestSocial{
	
	public FondoPens() { }
	
	public FondoPens(String id) {
		super(id);
	}

	@Override
	public String toString() {
		return "Fondo: codigo:"+codigo+" Nombre:" +nombre;
	}	
		
}
