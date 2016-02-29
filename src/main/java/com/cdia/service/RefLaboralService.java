package com.cdia.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IRefLaboralRepository;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.RefLaboral;

@Service("refLaboralService")
@Transactional
public class RefLaboralService implements IRefLaboralService{
	@Autowired
	private IRefLaboralRepository rRepository;

	@Override
	public boolean createRefLaboral(RefLaboral refLaboral) {
		try{
			rRepository.save(refLaboral);
			return true;
		}catch(Exception ex){ return false; }
	}

	@Override
	public boolean removeRefLaboral(RefLaboral refLaboral) {
		try{
			rRepository.delete(refLaboral);
			return true;
		}catch(Exception ex){ return false; }
	}

	@Override
	public boolean modifyRefLaboral(RefLaboral refLaboral) {
		try{
			rRepository.save(refLaboral);
			return true;
		}catch(Exception ex){ return false; }
	}

	@Override
	public Collection<RefLaboral> findAllRefLaboral(Empleado empleado) {
		try{
			return rRepository.findAllByEmpleado(empleado);
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public RefLaboral find(Long id) {
		try{
			return rRepository.findOne(id);
		}catch(Exception ex){ return null;}
	}

}
