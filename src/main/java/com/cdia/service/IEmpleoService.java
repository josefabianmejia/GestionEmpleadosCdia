package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.EstadoEmpleo;

public interface IEmpleoService {
	public Collection<EstadoEmpleo> findAllEstEmpleo();
	public Collection<Cargo> finAllCargos(Dependencia dependencia);
	public Collection<Dependencia> findAllDependencias();
}
