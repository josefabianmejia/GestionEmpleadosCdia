package com.cdia.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.service.ILocalizacnService;

@RestController
@RequestMapping("/api/gtaEmpleados/localizacion")
public class LocalizacionController {
	
	@Autowired
	private ILocalizacnService lService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/pais/{id}/departamento")
	public ResponseEntity<?> getAllDptos(@PathVariable("id") String id){
		Collection<Departamento> list = lService.findAllDepartamts();
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro lista de departamentos");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
		
	@RequestMapping(method = RequestMethod.GET, value = "/departamento/{id}/ciudad")
	public ResponseEntity<?> getAllCiudades(@PathVariable("id") String idDpto){
		Collection<Ciudad> list = lService.findAllCiudads(new Departamento(idDpto));
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro lista de ciudades");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}
	
}
