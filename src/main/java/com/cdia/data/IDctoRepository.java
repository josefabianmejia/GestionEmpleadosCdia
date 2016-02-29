package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Documento;
import com.cdia.data.domain.Empleado;

public interface IDctoRepository extends CrudRepository<Documento, Long>{ 
	public Collection<Documento> findAllByEmpleado(Empleado empleado);
}
