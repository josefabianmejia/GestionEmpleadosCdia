package com.cdia.service;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.ITpViviendaRepository;
import com.cdia.data.domain.TpVivienda;

@Service("tpViviendaService")
@Transactional
public class TpViviendaService implements ITpViviendaService{
	@Autowired
	private ITpViviendaRepository vRepository;

	public TpViviendaService() { }
	
	@Override
	public Collection<TpVivienda> findAllTpVivinds() {
		try{
			return (Collection<TpVivienda>)vRepository.findAll();
		}catch(Exception ex){ return new HashSet<>();}
	}

}
