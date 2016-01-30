package com.cdia.data.ultil;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Persona;

public class EmpleadoFactory implements PersonaFactory{
	private static PersonaFactory instance = new EmpleadoFactory(); 

	private EmpleadoFactory(){ }
	
	public static PersonaFactory getInstance(){
		return instance;
	}
	
	@Override
	public Persona createPersona() {
		return new Empleado();
	}
	
}
