package com.cdia.data;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Dependencia;

public interface ICargoRepository extends CrudRepository<Cargo,String>{
	public Collection<Cargo> findAllByDependencia(Dependencia dependencia);

}
