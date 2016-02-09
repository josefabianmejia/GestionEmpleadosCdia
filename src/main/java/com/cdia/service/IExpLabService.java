package com.cdia.service;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.AbstractExpLaboral;

public interface IExpLabService {
	public boolean createExpLab(AbstractExpLaboral expLaboral);
	public boolean removeExpLab(AbstractExpLaboral expLaboral);	
	public AbstractExpLaboral findExpLab(Empleado empleado);
	public AbstractExpLaboral findExpLabById(Long id);
	
}
