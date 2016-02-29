package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.ModalidadEstudio;
import com.cdia.data.domain.NivelEstudio;

public interface IEstudioAcademService {
	public Collection<NivelEstudio> findAllNivelsEstds();
	public Collection<ModalidadEstudio> findAllModaldsEstuds();
	
	public boolean createOrModifyFormAcademica(EstudioAcademico academica);	
	public boolean removeFormAcademica(EstudioAcademico academica);
	public Collection<EstudioAcademico> findAllFormAcademica(Empleado empleado);	
}
