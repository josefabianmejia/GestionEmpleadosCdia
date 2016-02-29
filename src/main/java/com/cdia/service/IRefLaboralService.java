package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.RefLaboral;

public interface IRefLaboralService {
	public boolean createRefLaboral(RefLaboral refLaboral);
	public boolean removeRefLaboral(RefLaboral refLaboral); 
	public boolean modifyRefLaboral(RefLaboral refLaboral);
	public RefLaboral find(Long id);
	public Collection<RefLaboral> findAllRefLaboral(Empleado empleado);		
}
