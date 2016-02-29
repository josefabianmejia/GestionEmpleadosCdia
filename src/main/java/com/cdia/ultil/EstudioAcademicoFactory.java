package com.cdia.ultil;

import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;
import com.cdia.data.domain.EstudioInformal;

public class EstudioAcademicoFactory {
	
	public static EstudioAcademico createEstudioFormal(){
		return new EstudioFormal();		
	}
	
	public static EstudioAcademico createEstudioInformal(){
		return new EstudioInformal();		
	}
}
