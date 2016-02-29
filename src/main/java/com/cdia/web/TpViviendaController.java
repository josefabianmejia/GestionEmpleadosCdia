package com.cdia.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdia.data.domain.TpVivienda;
import com.cdia.service.ITpViviendaService;

@RestController
@RequestMapping("/api/gtaEmpleados/tpVivienda")
public class TpViviendaController {
	@Autowired
	@Qualifier("tpViviendaService")
	private ITpViviendaService vService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll(){
		Collection<TpVivienda> list = vService.findAllTpVivinds();
			if(list == null){
				throw new HttpMessageNotReadableException("Lista de tipos de viviendas no encontrada");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}	

}
