package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;
import com.cdia.data.domain.Parentesco;

public interface IFamiliarService {
	
	public Collection<Parentesco> findAllParentescos();
	
	public boolean createOrModifyFamiliar(Familiar familiar);
	public boolean remove(Familiar familiar);
	public Familiar findFamiliarById(Long id);
	public Collection<Familiar> findAllFamiliarByEmpleado(Empleado empleado);	
}
