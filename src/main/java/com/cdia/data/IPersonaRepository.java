package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Persona;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona,String>{	

}
