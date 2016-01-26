package com.cdia.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdia.data.domain.Departamento;

@Repository
public interface IDepartmtoRepository extends CrudRepository<Departamento,String>{

}
