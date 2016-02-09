package com.cdia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.data.ICesantiaRepository;
import com.cdia.data.domain.Cesantia;

@Service("cesantiaService")
@Transactional
public class CesantiaService implements ICesantiaService{
	
	@Autowired
	private ICesantiaRepository cRepository;

	@Override
	public List<Cesantia> findAllCesantias() {
		try{
			return (List<Cesantia>)cRepository.findAll();
		}catch(Exception ex){ return new ArrayList<>();}
	}

}
