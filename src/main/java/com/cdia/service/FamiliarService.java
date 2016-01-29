package com.cdia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IFamiliarRepository;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;

@Service
@Transactional
public class FamiliarService implements IFamiliarService{
	@Autowired
	private IFamiliarRepository fRepository;

	@Override
	public boolean createOrModifyFamiliar(Familiar familiar) {
		try{
			fRepository.save(familiar);
			return true;
		}catch(Exception exp){ return false;}
	}

	@Override
	public boolean remove(Familiar familiar) {
		try{
			fRepository.delete(familiar);
			return true;
		}catch(Exception exp){ return false; }
	}

	@Override
	public Familiar findFamiliarById(Long id) {		
		try{
			return fRepository.findOne(id);
		}catch(Exception exp){ return null; }
	} 

	@Override
	public List<Familiar> findAllFamiliarByEmpleado(Empleado empleado) {
		try{
			return fRepository.findAllByEmpleado(empleado);
		}catch(Exception exp){ return new ArrayList<>();}
	}

}
