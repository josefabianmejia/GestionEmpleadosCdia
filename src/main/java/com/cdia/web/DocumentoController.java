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

import com.cdia.data.domain.Documento;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.TpDctoIdentificacion;
import com.cdia.data.domain.TpDctoLaboral;
import com.cdia.service.IDocumentoService;

@RestController
@RequestMapping("/api/gtaEmpleados/documento")
public class DocumentoController {
	
	@Autowired
	@Qualifier("documentoService")
	private IDocumentoService dService;
	
	@RequestMapping(value = "/tpDctosLaboral", method = RequestMethod.GET)
	public ResponseEntity<?> getAllTpDctoLab(){
		Collection<TpDctoLaboral> list = dService.findAllTpDctosLab();
			if(list == null) throw new HttpMessageNotReadableException("No se encontro lista de tipos de documentos");
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value ="/tpDctosIdentificacion", method = RequestMethod.GET)
	public ResponseEntity<?> getAllTpDctoId(){
		Collection<TpDctoIdentificacion> list = dService.findAllTpDctosId();
			if(list == null){
				throw new HttpMessageNotReadableException("No se encontro lista de tipos de documentos");
			}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createDcto(@RequestBody Documento documento){
		boolean resp = dService.createDcto(documento);
			if(!resp) throw new HttpMessageNotReadableException("No se pudo crear el documento");
			
		return new ResponseEntity<>(resp,HttpStatus.CREATED);		
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> modifyDcto(@PathVariable Long id, @RequestBody Documento documento){
		boolean resp = dService.modifyDcto(documento);
			if(!resp) throw new HttpMessageNotReadableException("No se pudo modificar el documento");
			
		return new ResponseEntity<>(resp,HttpStatus.OK);		
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> removeDcto(@PathVariable Long id){
		boolean resp = dService.removeDcto(new Documento(id));
		if(!resp) throw new HttpMessageNotReadableException("No se pudo crear el documento");
		
		return new ResponseEntity<>(resp,HttpStatus.OK);			
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDcto(@PathVariable Long id){
		Documento documento = dService.findDcto(id);
			if(documento == null) throw new HttpMessageNotReadableException("No se pudo encontrar Documento:"+id);
		return new ResponseEntity<>(documento,HttpStatus.OK);
	}
	
	@RequestMapping(value ="/empleado/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getAllDctoByEmpleado(@PathVariable String id){
		Collection<Documento> list = dService.findAllDctos(new Empleado(id));
			if(list == null) throw new HttpMessageNotReadableException("Documentos no encontrados");
		return new ResponseEntity<>(list,HttpStatus.OK);		
	}

}
