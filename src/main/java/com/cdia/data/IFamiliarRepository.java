package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;

public interface IFamiliarRepository extends CrudRepository<Familiar, Long> {
	public Collection<Familiar> findAllByEmpleado(Empleado empleado);

}
