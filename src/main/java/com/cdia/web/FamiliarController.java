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
import com.cdia.data.domain.Familiar;
import com.cdia.data.domain.Parentesco;
import com.cdia.service.IFamiliarService;

@RestController
@RequestMapping("/api/gtaEmpleados/familiar")
public class FamiliarController {
	@Autowired
	@Qualifier("familiarService")
	private IFamiliarService fService;
	
	@RequestMapping(value = "/parentesco", method = RequestMethod.GET)
	public ResponseEntity<?> getAllParentescos(){
		Collection<Parentesco> list = fService.findAllParentescos();
			if(list == null) throw new HttpMessageNotReadableException("No se pudo cargar lista de parentescos");
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/empleado/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getAll(@PathVariable String id){
		Collection<Familiar> list = fService.findAllFamiliarByEmpleado(new Empleado(id));
			if(list == null) throw new HttpMessageNotReadableException("No se encontro lista de familiares");
			
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}
	
	@RequestMapping(method =  RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Familiar familiar){
		boolean flag = fService.createOrModifyFamiliar(familiar);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear familiar");
		
		return new ResponseEntity<>(flag,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> modify(@PathVariable Long id, @RequestBody Familiar familiar){
		boolean flag = fService.createOrModifyFamiliar(familiar);
			if(flag) throw new HttpMessageNotReadableException("No se pudo actualizar familiar");
		
		return new ResponseEntity<>(flag,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> remove(@PathVariable Long id){
		boolean flag = fService.remove(new Familiar(id));
			if(!flag) throw new HttpMessageNotReadableException("No se pudo eliminar familiar");
		
		return new ResponseEntity<>(flag,HttpStatus.OK);  
	}
	
	
}
