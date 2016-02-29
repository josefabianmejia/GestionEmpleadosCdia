package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="H")
public class EstudioInformal extends EstudioAcademico{
	
	private int duracion;
	
	public EstudioInformal() { }
	
	public EstudioInformal(Long id) {
		super(id);		
	}	
	
	@Column(name = "DURACION")
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
