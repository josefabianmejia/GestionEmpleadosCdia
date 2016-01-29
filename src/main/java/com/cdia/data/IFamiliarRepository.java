package com.cdia.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;

public interface IFamiliarRepository extends CrudRepository<Familiar, Long> {
	public List<Familiar> findAllByEmpleado(Empleado empleado);

}
