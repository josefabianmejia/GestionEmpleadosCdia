package com.cdia.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;
import com.cdia.data.domain.Ocupacion;
import com.cdia.data.domain.OcupacionPk;

public interface IExpLabRepository extends CrudRepository<Ocupacion ,OcupacionPk>{
	public List<Ocupacion> findAllByEmpleado(Empleado empleado);

}
