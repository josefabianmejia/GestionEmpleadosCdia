package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Cargo;

public interface ICargoRepository extends CrudRepository<Cargo,String>{

}
