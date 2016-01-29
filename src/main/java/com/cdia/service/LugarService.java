package com.cdia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.ICiudadRepository;
import com.cdia.data.IDepartmtoRepository;
import com.cdia.data.IPaisRepository;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Pais;

@Service
@Transactional
public class LugarService implements ILugarService{
	@Autowired
	private IPaisRepository pRepository;
	@Autowired
	private IDepartmtoRepository dRepository;
	@Autowired
	private ICiudadRepository cRepositoty;

	@Override
	public List<Pais> findAllPaises() {
		try{
			return (List<Pais>) pRepository.findAll();
		}catch(Exception ex){ return new ArrayList<Pais>(); }		
	}

	@Override
	public List<Departamento> findAllDepartamts() {
		try{
			return (List<Departamento>)dRepository.findAll();
		}catch(Exception ex){ return new ArrayList<Departamento>();}
	}

	@Override
	public List<Ciudad> findAllCiudads() {
		try{
			return (List<Ciudad>)cRepositoty.findAll();
		}catch(Exception ex){ return new ArrayList<Ciudad>();}
	}

}
