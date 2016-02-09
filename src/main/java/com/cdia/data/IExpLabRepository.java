package com.cdia.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Labor;

public interface IExpLabRepository extends CrudRepository<Labor ,Long>{
	public List<Labor> findAllByEmpleado(Empleado empleado);

}
