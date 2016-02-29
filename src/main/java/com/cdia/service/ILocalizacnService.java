package com.cdia.service;

import java.util.Collection;


import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Pais;

public interface ILocalizacnService {
	
	public Collection<Pais> findAllPaises();	
	public Collection<Departamento> findAllDepartamts();
	public Collection<Ciudad> findAllCiudads(Departamento dpto);
}
