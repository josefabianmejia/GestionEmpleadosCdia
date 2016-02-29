package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="A")
public class EstudioFormal extends EstudioAcademico{
	private String institucion;
	
	public EstudioFormal() {  }
	
	public EstudioFormal(Long id) {
		super(id);			
	}

	@Column(name = "ESTABLECI")
	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
}
