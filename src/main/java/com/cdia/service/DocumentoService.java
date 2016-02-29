package com.cdia.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IDctoRepository;
import com.cdia.data.ITpDctoIdRepository;
import com.cdia.data.ITpDctoLabRepository;
import com.cdia.data.domain.Documento;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.TpDctoIdentificacion;
import com.cdia.data.domain.TpDctoLaboral;

@Service("documentoService")
@Transactional
public class DocumentoService implements IDocumentoService{
	@Autowired
	private ITpDctoIdRepository iRepository;
	
	@Autowired
	private ITpDctoLabRepository lRepository;
	
	@Autowired
	private IDctoRepository dRepository;
	
	public DocumentoService() {  }
	

	@Override
	public Collection<TpDctoIdentificacion> findAllTpDctosId() {
		try{
			return (Collection<TpDctoIdentificacion>)iRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public Collection<TpDctoLaboral> findAllTpDctosLab() {
		try{
			return (Collection<TpDctoLaboral>)lRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public boolean createDcto(Documento documento) {
		try{
			dRepository.save(documento);
			return true;
		}catch(Exception ex){ return false;}
	}

	@Override
	public boolean modifyDcto(Documento documento) {
		try{
			dRepository.save(documento);
			return true;
		}catch(Exception ex){ return false;}
	}

	@Override
	public boolean removeDcto(Documento documento) {
		try{
			dRepository.delete(documento);
			return true;
		}catch(Exception ex){ return false;}
	}

	@Override
	public Documento findDcto(Long id) {
		try{
			return dRepository.findOne(id);
		}catch(Exception ex){ return null;}
	}

	@Override
	public Collection<Documento> findAllDctos(Empleado empleado) {
		try{
			return (Collection<Documento>)dRepository.findAllByEmpleado(empleado);
		}catch(Exception ex){ return new ArrayList<>();}
	}


	
}
