package com.cdia.data.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CES")
public class Cesantia extends AbstractPrestSocial{
	
	public Cesantia() { }
	
	public Cesantia(String id){
		super(id);
	}
	
	@Override
	public String toString() {
		return "Cesantia: codigo:"+codigo+" Nombre:" +nombre;
	}

}
