package com.cdia.data.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="EPS")
public class Eps extends AbstractPrestSocial{
	
	public Eps() { }
	
	public Eps(String id) { 
		super(id);
	}
	
	@Override
	public String toString() {
		return "eps: codigo:"+codigo+" Nombre:" +nombre;
	}
}
