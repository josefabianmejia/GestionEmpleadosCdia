package com.cdia.data;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Empleado;

public interface IEmpleadoRepository extends CrudRepository<Empleado, String>{

}
