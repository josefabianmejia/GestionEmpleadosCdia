package com.cdia.ultil;

import com.cdia.data.domain.Familiar;
import com.cdia.data.domain.Persona;

public class FamiliarFactory implements PersonaFactory {
	private static PersonaFactory instance = new FamiliarFactory();
	
	private FamiliarFactory(){ }
	
	public static PersonaFactory getInstance(){
		return instance;
	}
	
	@Override
	public Persona createPersona() {
		return new Familiar();
	}
	
}
