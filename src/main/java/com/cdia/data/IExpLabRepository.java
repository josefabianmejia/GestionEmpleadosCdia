package com.cdia.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;

public interface IExpLabRepository extends CrudRepository<ExpLaboral ,Long>{
	public List<ExpLaboral> findAllByEmpleado(Empleado empleado);

}
