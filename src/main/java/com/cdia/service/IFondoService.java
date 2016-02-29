package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.FondoPens;

public interface IFondoService {
	public Collection<FondoPens> findAllFondos();	
	public boolean createFondo(FondoPens fondo);
}
