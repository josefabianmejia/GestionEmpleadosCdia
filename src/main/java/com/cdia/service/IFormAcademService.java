package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;
import com.cdia.data.domain.EstudioInformal;
import com.cdia.data.domain.IFormAcademica;
import com.cdia.data.domain.ModalidadEstudio;
import com.cdia.data.domain.NivelEstudio;

public interface IFormAcademService {
	
	public Collection<NivelEstudio> findAllNivelsEstds();
	public Collection<ModalidadEstudio> findAllModaldsEstuds();
	
	public IFormAcademica findFormAcadem(Empleado empleado);
	public boolean modifyFormAcadem(IFormAcademica formacion,Empleado empleado);
	public Collection<EstudioAcademico> findAllEstudForm(Empleado empleado);
	public Collection<EstudioAcademico> findAllEstudInform(Empleado empleado);
	public boolean createOrUpdateEstudio(EstudioAcademico estudio);
	public boolean removeEstudio(EstudioAcademico estudio);		
	
}
