package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Cargo;

@Repository
public interface ICargoRepository extends CrudRepository<Cargo,String>{

}
