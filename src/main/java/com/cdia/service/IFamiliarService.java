package com.cdia.service;

import java.util.List;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;

public interface IFamiliarService {
	public boolean createOrModifyFamiliar(Familiar familiar);
	public boolean remove(Familiar familiar);
	public Familiar findFamiliarById(Long id);
	public List<Familiar> findAllFamiliarByEmpleado(Empleado empleado);	
}
