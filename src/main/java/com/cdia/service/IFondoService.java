package com.cdia.service;

import java.util.List;

import com.cdia.data.domain.FondoPens;

public interface IFondoService {
	public List<FondoPens> findAllFondos();	
	public boolean createFondo(FondoPens fondo);
}
