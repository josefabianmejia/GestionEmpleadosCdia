package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Dependencia;

@Repository
public interface IDependciaRepository extends CrudRepository<Dependencia, String> {

}
