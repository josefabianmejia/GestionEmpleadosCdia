package com.cdia.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.EstadoEmpleo;
import com.cdia.service.IEmpleoService;

@RestController
@RequestMapping("/api/gtaEmpleados/empleo")
public class EmpleoController {
	@Autowired
	@Qualifier("empleoService")
	private IEmpleoService eService;
	
	public EmpleoController(){ }
	
	@RequestMapping(value = "/estado", method = RequestMethod.GET)
	public ResponseEntity<?> getAllEstadoEmpleo(){
		Collection<EstadoEmpleo> list = eService.findAllEstEmpleo();
			if(list == null){ 
				throw new HttpMessageNotReadableException("No se encontro lista de estados de empleo");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dependencia", method = RequestMethod.GET)
	public ResponseEntity<?> getAllDependencias(){
		Collection<Dependencia> list = eService.findAllDependencias();
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro la lista de dependencias");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dependencia/{id}/cargo", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCargos(@PathVariable String id){
		Collection<Cargo> list = eService.finAllCargos(new Dependencia(id));
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro la lista de cargos en la dependencia:"+id);				
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
}
