package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Pais;

public interface IPaisRepository extends CrudRepository<Pais,String>{

}
