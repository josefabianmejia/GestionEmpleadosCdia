package com.cdia.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdia.data.domain.Empleado;
import com.cdia.service.IEmpleadoService;

@RestController
@RequestMapping("/api/gtaEmpleados/empleado")
public class EmpleadoController {
	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService eService;	
	
	public EmpleadoController() { }	
	
	@RequestMapping(method =  RequestMethod.GET, value ="/{id}" )
	public ResponseEntity<?> get(@PathVariable("id") String id ){		
		Empleado empleado = eService.findEmpleado(id);
			if(empleado == null){ 
				throw new HttpMessageNotReadableException("No se encontro el empleado:"+id);
			}
		return new ResponseEntity<>(empleado,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll(){
		Collection<Empleado> list = eService.findAll();
			if(list == null){ 
				throw new HttpMessageNotReadableException("Error obteniendo lista de Empleados");
			}			
		return new ResponseEntity<>(list,HttpStatus.OK);	
	}		
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Empleado empleado){
		boolean status = eService.createOrModifyEmpleado(empleado);
			if(!status){
				throw new HttpMessageNotReadableException("No se pudo crear el empleado");
			}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<?> modify(@PathVariable("id") String id, @RequestBody Empleado empleado){
		boolean status = eService.createOrModifyEmpleado(empleado);
			if(!status){ 
				throw new HttpMessageNotReadableException("Error al modificar el empleado "+id);
			}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
