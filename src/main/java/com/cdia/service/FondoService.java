package com.cdia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.IFondoRepository;
import com.cdia.data.domain.FondoPens;

@Service("fondoService")
@Transactional
public class FondoService implements IFondoService{
	
	@Autowired
	private IFondoRepository fRepository;

	@Override
	public List<FondoPens> findAllFondos() {
		try{
			return (List<FondoPens>) fRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

	@Override
	public boolean createFondo(FondoPens fondo) {
		try{
			fRepository.save(fondo);
			return true;
		}catch(Exception ex){ return false;}
	}
	

}
