package com.cdia.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;
import com.cdia.data.domain.EstudioFormal;
import com.cdia.data.domain.ModalidadEstudio;
import com.cdia.data.domain.NivelEstudio;
import com.cdia.service.IFormAcademService;
import com.cdia.ultil.EstudioAcademicoFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
@Rollback(true)
public class FormAcademServiceTest {

	@Autowired
	@Qualifier("formAcademService")
	private IFormAcademService fService;
	
	@Test
	@Ignore
	public void createEstudio(){
		Empleado empleado = new Empleado("1079658241");
		EstudioFormal estudio = (EstudioFormal)EstudioAcademicoFactory.createEstudioFormal();
		estudio.setTitulo("Bachiller");
		estudio.setFechaFin(new Date());
		estudio.setInstitucion("Insttitucion Liceo Santander");
		estudio.setNivel(new NivelEstudio("032"));
		estudio.setModalidad(new ModalidadEstudio("0"));
		estudio.setEmpleado(empleado);
		estudio.setCiudad(new Ciudad("0"));		
		
		//assertNull(estudio.getId());		
		fService.createOrUpdateEstudio(estudio);
		//assertNotNull(estudio.getId());		
	}
	
	@Test
	@Ignore
	public void removeEstudio(){
		long id = 277;
		EstudioAcademico estudio = new EstudioFormal(id);		
		fService.removeEstudio(estudio);
	}
	
}
