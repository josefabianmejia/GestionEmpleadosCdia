package com.cdia.service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.ICiudadRepository;
import com.cdia.data.IDepartmtoRepository;
import com.cdia.data.IPaisRepository;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Departamento.DepartamentoComparator;
import com.cdia.data.domain.Pais;

@Service("lugarService")
@Transactional
public class LocalizacnService implements ILocalizacnService{
	@Autowired
	private IPaisRepository pRepository;
	@Autowired
	private IDepartmtoRepository dRepository;
	@Autowired
	private ICiudadRepository cRepositoty;

	@Override
	public Collection<Pais> findAllPaises() {
		try{
			return (Collection<Pais>) pRepository.findAll();
		}catch(Exception ex){ return new HashSet<Pais>(); }		
	}

	@Override
	public Collection<Departamento> findAllDepartamts() {
		try{
			List<Departamento> list = (List<Departamento>)dRepository.findAll();
			Collections.sort(list,new Departamento.DepartamentoComparator());
			return (Collection<Departamento>)list;
		}catch(Exception ex){ return new HashSet<Departamento>();}
	}

	@Override
	public Collection<Ciudad> findAllCiudads(Departamento dpto) {
		try{
			return (Collection<Ciudad>)cRepositoty.findAllByIdStartingWith(dpto.getId());
		}catch(Exception ex){ return new HashSet<Ciudad>();}
	}
}
