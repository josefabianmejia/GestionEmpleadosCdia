package com.cdia.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IEstudioFormalRepository;
import com.cdia.data.IEstudioInformRepository;
import com.cdia.data.IModalidadRepository;
import com.cdia.data.INivelEstudRepository;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;
import com.cdia.data.domain.EstudioInformal;
import com.cdia.data.domain.FormacnAcademica;
import com.cdia.data.domain.IFormAcademica;
import com.cdia.data.domain.ModalidadEstudio;
import com.cdia.data.domain.NivelEstudio;

@Service("formAcademService")
@Transactional
public class FormAcademService implements IFormAcademService{
	
	@Autowired
	private IEstudioFormalRepository fRepository;
	
	@Autowired
	private IEstudioInformRepository iRepository;
	
	@Autowired
	private IModalidadRepository mRepository;
	
	@Autowired
	private INivelEstudRepository nRepository;
	
	
	public FormAcademService() { }

	@Override
	public IFormAcademica findFormAcadem(Empleado empleado) {
		IFormAcademica formacionAcadem = new FormacnAcademica();
		
		Collection<EstudioAcademico> listEstForm = fRepository.findAllByEmpleado(empleado);
		Collection<EstudioAcademico> listEstInf = iRepository.findAllByEmpleado(empleado);
		
		//agregar estudios formales
			for(EstudioAcademico estudio: listEstForm){
				formacionAcadem.addFormacion((EstudioFormal)estudio);
			}
		//agregar estudio informales
			for(EstudioAcademico estudio: listEstInf){
				formacionAcadem.addFormacion(estudio);
			}
		return formacionAcadem;
	}

	@Override
	public boolean modifyFormAcadem(IFormAcademica formacion,Empleado empleado) {
		boolean flag = false;
		IFormAcademica formAct = findFormAcadem(empleado);
		
			//verificar si se eliminaron o se agregaron elementos
			if(formAct.numEstudios()>formacion.numEstudios()){
				for(int i=0;i<formAct.numEstudios();i++){
					EstudioAcademico e = formAct.getFormacion(i);
					if(!formacion.containsEstudio(e)){						
						flag = deleteEstudio(e);
					}					
				}	
			}else if(formAct.numEstudios()<formacion.numEstudios()){
				for(int i=0;i<formacion.numEstudios();i++){
					EstudioAcademico e = formacion.getFormacion(i);
					if(!formAct.containsEstudio(e)){						
						flag = addOrUpdateEstudio(e);
					}					
				}				
			}else{
				for(int i=0;i<formacion.numEstudios();i++){
					EstudioAcademico e = formacion.getFormacion(i);										
					flag = addOrUpdateEstudio(e);								
				}	
			}	
		return flag;		
	}
		
	@Override
	public Collection<NivelEstudio> findAllNivelsEstds() {
		try{
			return (Collection<NivelEstudio>)nRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public Collection<ModalidadEstudio> findAllModaldsEstuds() {
		try{
			return (Collection<ModalidadEstudio>)mRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public Collection<EstudioAcademico> findAllEstudForm(Empleado empleado) {
		try{
			return (Collection<EstudioAcademico>)fRepository.findAllByEmpleado(empleado);
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public Collection<EstudioAcademico> findAllEstudInform(Empleado empleado) {
		try{
			return (Collection<EstudioAcademico>)iRepository.findAllByEmpleado(empleado);
		}catch(Exception ex){ return new ArrayList<>();}
	}	
	
	@Override
	public boolean createOrUpdateEstudio(EstudioAcademico estudio) {
		return addOrUpdateEstudio(estudio);
	}

	@Override
	public boolean removeEstudio(EstudioAcademico estudio) {
		return deleteEstudio(estudio);
	}
	
	private boolean addOrUpdateEstudio(EstudioAcademico e){
		
		try{
			if(e instanceof EstudioFormal)
				 fRepository.save((EstudioFormal)e);
			else if(e instanceof EstudioInformal) 
				iRepository.save((EstudioInformal)e);			
		}catch(Exception ex){ return false;}
		
		return true;
	}
	
	private boolean deleteEstudio(EstudioAcademico e){
		
		try{
			if(e instanceof EstudioFormal)
				 fRepository.delete((EstudioFormal)e);
			else if(e instanceof EstudioInformal)
				iRepository.delete((EstudioInformal)e);			
		}catch(Exception ex){ return false;}
		
		return true;
	}
	

}
