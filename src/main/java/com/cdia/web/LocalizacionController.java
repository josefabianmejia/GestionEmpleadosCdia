package com.cdia.web;

import java.util.List;

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
@RequestMapping("/restDakaEmpleado")
public class LocalizacionController {
	
	@Autowired
	private ILocalizacnService lService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{idPais}/departamentos")
	public ResponseEntity<?> getAllDptos(@PathVariable("idPais") String idPais){
		List<Departamento> list = lService.findAllDepartamts();
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro lista de departamentos");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
		
	@RequestMapping(method = RequestMethod.GET, value = "/{idDpto}/ciudades")
	public ResponseEntity<?> getAllCiudades(@PathVariable("idDpto") String idDpto){
		List<Ciudad> list = lService.findAllCiudads(new Departamento(idDpto));
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro lista de ciudades");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}
	
}
