package com.cdia.service;

import java.util.List;

import com.cdia.data.domain.Empleado;

public interface IEmpleadoService {
	public boolean createOrModifyEmpleado(Empleado empleado);
	public boolean removeEmpleado(Empleado empleado);	
	public Empleado findEmpleado(String id);
	public List<Empleado> findAll();
}
