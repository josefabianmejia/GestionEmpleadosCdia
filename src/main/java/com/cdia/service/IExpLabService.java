package com.cdia.service;

import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;
import com.cdia.data.domain.OcupacionPk;

public interface IExpLabService {
	public boolean createExpLab(ExpLaboral expLaboral);
	public boolean removeExpLab(ExpLaboral expLaboral);	
	public ExpLaboral findAllExpLab(Empleado empleado);
	public ExpLaboral findExpLabById(OcupacionPk ocupacionPk);
	
}
