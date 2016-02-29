package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;

public interface IEstudioFormalRepository extends CrudRepository<EstudioFormal, Long>{ 
	public Collection<EstudioAcademico> findAllByEmpleado(Empleado empleado);
	
}

