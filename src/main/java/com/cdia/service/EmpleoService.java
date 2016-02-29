package com.cdia.service;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.ICargoRepository;
import com.cdia.data.IDependciaRepository;
import com.cdia.data.IEstadoEmpleoRepository;
import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstadoEmpleo;

@Service("empleoService")
@Transactional

public class EmpleoService implements IEmpleoService{
	@Autowired
	private IEstadoEmpleoRepository eRepository;
	@Autowired
	private ICargoRepository cRepository;
	@Autowired
	private IDependciaRepository dRepository;
	
	@Override
	public Collection<EstadoEmpleo> findAllEstEmpleo() {
		try{
			return (Collection<EstadoEmpleo>)eRepository.findAll();			
		}catch(Exception ex){ return new HashSet<>(); }
	}
	@Override
	public Collection<Cargo> finAllCargos(Dependencia dependencia) {
		try{
			return (Collection<Cargo>)cRepository.findAllByDependencia(dependencia);
		}catch(Exception ex){ return new HashSet<>();}
	}
	@Override
	public Collection<Dependencia> findAllDependencias() {
		try{
			return (Collection<Dependencia>)dRepository.findAll();
		}catch(Exception ex){ return new HashSet<>();}
	}
		
	

}
