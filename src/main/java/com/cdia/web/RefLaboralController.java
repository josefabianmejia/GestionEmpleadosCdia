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
import com.cdia.data.domain.RefLaboral;
import com.cdia.service.IRefLaboralService;

@RestController
@RequestMapping("/api/gtaEmpleados/empleado/{idEmpleado}/refLaboral")
public class RefLaboralController {
	@Autowired
	@Qualifier("refLaboralService")
	private IRefLaboralService rService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll(@PathVariable String idEmpleado){
		Collection<RefLaboral> list = rService.findAllRefLaboral(new Empleado(idEmpleado));
			if(list == null)
				throw new HttpMessageNotReadableException("No se encontro lista de referencias laborales");
			
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable Long id){
		RefLaboral refLaboral = rService.find(id);
			if(refLaboral == null)
				throw new HttpMessageNotReadableException("No se encontro Referencia Laboral Id:"+id);
		return new ResponseEntity<>(refLaboral,HttpStatus.OK);		
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody RefLaboral refLaboral){
		boolean resp = rService.createRefLaboral(refLaboral);
			if(!resp)
				throw new HttpMessageNotReadableException("No se pudo crear la referencia laboral");
		return new ResponseEntity<>(resp,HttpStatus.CREATED);					
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> modify(@PathVariable Long id,@RequestBody RefLaboral refLaboral){
		boolean resp = rService.modifyRefLaboral(refLaboral);
			if(!resp) throw new HttpMessageNotReadableException("No se pudo modificar la Referencia laboral");
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}

	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> remove(@PathVariable Long id){
		boolean resp = rService.removeRefLaboral(new RefLaboral(id));
			if(!resp) throw new HttpMessageNotReadableException("No se pudo eliminar la referencia laboral");
		return new ResponseEntity<>(resp,HttpStatus.OK);		
	}	

}
