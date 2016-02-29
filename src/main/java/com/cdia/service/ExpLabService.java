package com.cdia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IExpLabRepository;
import com.cdia.data.domain.ExpLaboralEmpleado;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;

@Service("expLabService")
@Transactional
public class ExpLabService implements IExpLabService{
	
	@Autowired
	private IExpLabRepository eRepository;
	
	public ExpLabService() {  }

	@Override
	public boolean createExpLab(ExpLaboral expLaboral) {
		try{
			eRepository.save(expLaboral);			
			return true;
		}catch(Exception ex){ return false; }		
	}

	@Override
	public boolean removeExpLab(ExpLaboral expLaboral) {
		try{
			eRepository.delete(expLaboral);			
			return true;
		}catch(Exception ex){ return false;	}
	}
	
	@Override
	public ExpLaboralEmpleado findExpLab(Empleado empleado) {		
		List<ExpLaboral> list = eRepository.findAllByEmpleado(empleado);
		ExpLaboralEmpleado exp = ExpLaboralEmpleado.getInstance();
		for(ExpLaboral e:list){
			exp.add(e);
		}		
		return exp;
	}	

}
