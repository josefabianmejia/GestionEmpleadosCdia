package com.cdia.web;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;
import com.cdia.data.domain.EstudioInformal;
import com.cdia.data.domain.ModalidadEstudio;
import com.cdia.data.domain.NivelEstudio;
import com.cdia.service.IFormAcademService;

@RestController
@RequestMapping("/api/gtaEmpleados/formacionAcademica")
public class FormacnAcademController {
	
	@Autowired
	@Qualifier("formAcademService")
	private IFormAcademService fService;	
	
	@RequestMapping(value="/modalidad", method = RequestMethod.GET)
	public ResponseEntity<?> getAllModalids(){
		Collection<ModalidadEstudio> list = fService.findAllModaldsEstuds();
			if(list == null) throw new HttpMessageNotReadableException("No se pudo cargar lista de modalidades");
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

	@RequestMapping(value="/nivel", method = RequestMethod.GET)
	public ResponseEntity<?> getAllNivels(){
		Collection<NivelEstudio> list = fService.findAllNivelsEstds();
			if(list == null) throw new HttpMessageNotReadableException("No se pudo cargar lista de niveles de estudio");
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value="/formal/empleado/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> getEstudiosFormales(@PathVariable String id){
		Collection<EstudioAcademico> list = fService.findAllEstudForm(new Empleado(id));		
		if(list == null) 
			throw new HttpMessageNotReadableException("No se pudo cargar formacion academica empleado");
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}
	
	@RequestMapping(value="/informal/empleado/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> getEstudiosInformales(@PathVariable String id){
		Collection<EstudioAcademico> list = fService.findAllEstudInform(new Empleado(id));		
		if(list == null) 
			throw new HttpMessageNotReadableException("No se pudo cargar formacion academica empleado");
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createEstudio(@RequestBody EstudioAcademico estudio){
		boolean flag = fService.createOrUpdateEstudio(estudio);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio academico");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}	
	
	@RequestMapping(value = "/formal",method = RequestMethod.POST)
	public ResponseEntity<?> createEstudio(@RequestBody EstudioFormal estudio){
		boolean flag = fService.createOrUpdateEstudio(estudio);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}
	
	@RequestMapping(value = "/informal",method = RequestMethod.POST)
	public ResponseEntity<?> createEstudio(@RequestBody EstudioInformal estudio){
		boolean flag = fService.createOrUpdateEstudio(estudio);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}
	
	@RequestMapping(value = "/formal",method = RequestMethod.PUT)
	public ResponseEntity<?> updateEstudio(@RequestBody EstudioFormal estudio){
		boolean flag = fService.createOrUpdateEstudio(estudio);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}
	
	@RequestMapping(value = "/informal",method = RequestMethod.PUT)
	public ResponseEntity<?> updateEstudio(@RequestBody EstudioInformal estudio){
		boolean flag = fService.createOrUpdateEstudio(estudio);
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}
	
	@RequestMapping(value = "/formal/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> removeEstudioForm(@PathVariable Long id){
		boolean flag = fService.removeEstudio(new EstudioFormal(id));
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}	
		
	@RequestMapping(value = "/informal/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> removeEstudioInform(@PathVariable Long id){
		boolean flag = fService.removeEstudio(new EstudioInformal(id));
			if(!flag) throw new HttpMessageNotReadableException("No se pudo crear Estudio");
			
		return new ResponseEntity<>(flag,HttpStatus.OK);		
	}	
	
	@RequestMapping(value="/empleado/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> getFormAcadem(@PathVariable String id){
		Empleado empleado = new Empleado(id);
		Map<String, Collection<EstudioAcademico>> formacion = new HashMap<>();
		
		formacion.put("formal", fService.findAllEstudForm(empleado));
		formacion.put("informal",fService.findAllEstudInform(empleado));	
		
		if(formacion.isEmpty()) 
			throw new HttpMessageNotReadableException("No se pudo cargar formacion academica empleado");
		return new ResponseEntity<>(formacion,HttpStatus.OK);		
	}	
	
}
