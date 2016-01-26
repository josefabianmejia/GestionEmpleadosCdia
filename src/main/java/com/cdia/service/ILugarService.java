package com.cdia.service;

import java.util.List;

import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Pais;

public interface ILugarService {
	public List<Pais> findAllPaises();
	public List<Departamento> findAllDepartamts();
	public List<Ciudad> findAllCiudads();
}
