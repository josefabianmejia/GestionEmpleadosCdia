package com.cdia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IExpLabRepository;
import com.cdia.data.domain.ExpLaboral;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.AbstractExpLaboral;
import com.cdia.data.domain.Labor;

@Service("expLabService")
@Transactional
public class ExpLabService implements IExpLabService{
	
	@Autowired
	private IExpLabRepository eRepository;
	
	public ExpLabService() {  }

	@Override
	public boolean createExpLab(AbstractExpLaboral expLaboral) {
		try{
			for(int i=0;i<expLaboral.numeroExp();i++){
				Labor exp = (Labor) expLaboral.get(i);
				eRepository.save(exp);
			}
			return true;
		}catch(Exception ex){ return false; }		
	}

	@Override
	public boolean removeExpLab(AbstractExpLaboral expLaboral) {
		try{
			for(int i=0;i<expLaboral.numeroExp();i++){
				Labor exp = (Labor)expLaboral.get(i);
				eRepository.delete(exp);
			}
			return true;
		}catch(Exception ex){ return false;	}
	}
	
	@Override
	public AbstractExpLaboral findExpLab(Empleado empleado) {		
		List<Labor> list = eRepository.findAllByEmpleado(empleado);		
		AbstractExpLaboral exp = ExpLaboral.getInstance();
		for(AbstractExpLaboral e:list){
			exp.add(e);
		}		
		return exp;
	}

	@Override
	public AbstractExpLaboral findExpLabById(Long id) {		
		return eRepository.findOne(id);
	}	

}
