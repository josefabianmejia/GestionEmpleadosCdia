package com.cdia.data;

import org.springframework.data.repository.CrudRepository;

import com.cdia.data.domain.EstadoEmpleo;

public interface IEstadoEmpleoRepository extends CrudRepository<EstadoEmpleo, String> {  }
