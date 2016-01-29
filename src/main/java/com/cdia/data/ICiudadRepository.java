package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Ciudad;

public interface ICiudadRepository extends CrudRepository<Ciudad, String>{

}
