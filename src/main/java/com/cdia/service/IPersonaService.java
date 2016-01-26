package com.cdia.service;

import java.util.List;
import com.cdia.data.domain.Persona;

public interface IPersonaService {
	public boolean createPersona(Persona persona);
	public boolean removePersona(Persona persona);
	public boolean modifyPersona(Persona persona);
	public Persona findPersona(String id);
	public List<Persona> findAll();
}
