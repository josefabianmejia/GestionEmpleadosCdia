package com.cdia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IPersonaRepository;
import com.cdia.data.domain.Persona;

@Service("personaService")
@Transactional
public class PersonaService implements IPersonaService {
	@Autowired	
	private IPersonaRepository pRepository;
	
	public PersonaService() { }

	@Override
	public boolean createPersona(Persona persona) {
		return true;	
	}

	@Override
	public boolean removePersona(Persona persona) {
		return true;
	}

	@Override
	public boolean modifyPersona(Persona persona) {
		return true;
	}

	@Override
	public Persona findPersona(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAll() {		
		return (List<Persona>) pRepository.findAll();
	}

}
