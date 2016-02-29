package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Ciudad;

public interface ICiudadRepository extends CrudRepository<Ciudad, String>{
	public Collection<Ciudad> findAllByIdStartingWith(String idDpto);
}
