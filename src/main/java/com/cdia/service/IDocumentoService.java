package com.cdia.service;

import java.util.Collection;

import com.cdia.data.domain.Documento;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.TpDctoIdentificacion;
import com.cdia.data.domain.TpDctoLaboral;

public interface IDocumentoService {
	
	public Collection<TpDctoIdentificacion> findAllTpDctosId();
	
	public Collection<TpDctoLaboral> findAllTpDctosLab();
	
	public boolean createDcto(Documento documento);
	public boolean modifyDcto(Documento documento);
	public boolean removeDcto(Documento documento);
	public Documento findDcto(Long id);
	public Collection<Documento> findAllDctos(Empleado empleado);

}
