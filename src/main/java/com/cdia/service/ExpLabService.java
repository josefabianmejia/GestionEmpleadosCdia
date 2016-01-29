package com.cdia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IExpLabRepository;
import com.cdia.data.domain.CompositeExpLab;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;
import com.cdia.data.domain.Ocupacion;
import com.cdia.data.domain.OcupacionPk;

@Service
@Transactional
public class ExpLabService implements IExpLabService{
	
	@Autowired
	private IExpLabRepository eRepository;
	
	public ExpLabService() {  }

	@Override
	public boolean createExpLab(ExpLaboral expLaboral) {
		try{
			for(int i=0;i<expLaboral.numeroExp();i++){
				Ocupacion exp = (Ocupacion) expLaboral.get(i);
				eRepository.save(exp);
			}
			return true;
		}catch(Exception ex){ return false; }		
	}

	@Override
	public boolean removeExpLab(ExpLaboral expLaboral) {
		try{
			for(int i=0;i<expLaboral.numeroExp();i++){
				Ocupacion exp = (Ocupacion)expLaboral.get(i);
				eRepository.delete(exp);
			}
			return true;
		}catch(Exception ex){ return false;	}
	}
	
	@Override
	public ExpLaboral findAllExpLab(Empleado empleado) {		
		List<Ocupacion> list = eRepository.findAllByEmpleado(empleado);		
		ExpLaboral exp = new CompositeExpLab();
		for(ExpLaboral e:list){
			exp.add(e);
		}		
		return exp;
	}

	@Override
	public ExpLaboral findExpLabById(OcupacionPk ocupacionPk) {		
		return eRepository.findOne(ocupacionPk);
	}	

}
