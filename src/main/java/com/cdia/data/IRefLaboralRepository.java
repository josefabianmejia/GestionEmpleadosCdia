package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.RefLaboral;

public interface IRefLaboralRepository extends CrudRepository<RefLaboral, Long> {
	public Collection<RefLaboral> findAllByEmpleado(Empleado empleado);
}
