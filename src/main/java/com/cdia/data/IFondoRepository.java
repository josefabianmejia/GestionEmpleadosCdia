package com.cdia.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Cesantia;
import com.cdia.data.domain.FondoPens;

public interface IFondoRepository extends CrudRepository<FondoPens, String>{ 
	
}
