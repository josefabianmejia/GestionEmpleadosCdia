package com.cdia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IEmpleadoRepository;
import com.cdia.data.domain.Empleado;

@Service("empleadoService")
@Transactional
public class EmpleadoService implements IEmpleadoService {
	@Autowired	
	private IEmpleadoRepository pRepository;
	
	public EmpleadoService() { }

	@Override
	public boolean createOrModifyEmpleado(Empleado empleado) {
		try{
			pRepository.save(empleado);	
			return true;
		}catch(Exception ex){ return false; }	
	}

	@Override
	public boolean removeEmpleado(Empleado empleado) {
		try{
			pRepository.delete(empleado);
			return true;
		}catch(Exception ex){ return false;}		
	}

	@Override
	public Empleado findEmpleado(String id) {		
		try{
			return pRepository.findOne(id);
		}catch(Exception ex){ return null;}		
	}

	@Override
	public List<Empleado> findAll() {			
		try{
			return (List<Empleado>) pRepository.findAll();
		}catch(Exception ex){ return new ArrayList<Empleado>(); }	
	}

}
