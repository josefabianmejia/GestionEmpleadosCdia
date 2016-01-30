package com.cdia.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Contacto;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Empleo;
import com.cdia.data.domain.EstadoEmpleo;
import com.cdia.data.domain.NacimtoEmpleado;
import com.cdia.data.domain.Pais;
import com.cdia.data.ultil.EmpleadoFactory;
import com.cdia.data.ultil.PersonaFactory;
import com.cdia.service.IEmpleadoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class EmpleadoServiceTest {
	@Autowired
	private IEmpleadoService pService;

	@Test	
	@Ignore
	public void createEmpleado( ){
		String id="1079658242";
		String dc = "1079658242";
		long tpdc = 0;
		String nomb = "DAVID";
		String apll = "MEJIA RADA";
		String idPais = "169";
		String idDep = "0";
		String idCiu ="47170";
		String idDepend ="A04";
		String idCarg ="ADMON";
		String idEstadEmpl ="02";
			
		Pais pais = new Pais(idPais);
		Departamento dpto = new Departamento(idDep);
		Ciudad ciudad = new Ciudad(idCiu);			
		Contacto contacto = new Contacto();
		NacimtoEmpleado nacimtoEmpleado = new NacimtoEmpleado();
		
		contacto.setNombrs(nomb);
		contacto.setPaisResid(pais);
		contacto.setDeptoResid(dpto);
		contacto.setCiudadResid(ciudad);
				
		nacimtoEmpleado.setPaisNac(pais);
		nacimtoEmpleado.setDeptoNac(dpto);
		nacimtoEmpleado.setCiudadNac(ciudad);		
		
		PersonaFactory factory = EmpleadoFactory.getInstance();		
		Empleado empleado = (Empleado) factory.createPersona();
		Empleo empleo = new Empleo();
		Cargo cargo = new Cargo();
		Dependencia dependencia = new Dependencia();	
		EstadoEmpleo estadoEmpl = new EstadoEmpleo();
				
		empleado.setId(id);	
		empleado.setDoc(dc);
		empleado.setTpDoc(tpdc);
		empleado.setApells(apll);
		empleado.setContacto(contacto);
		empleado.setNacimtoEmpleado(nacimtoEmpleado);
				
		dependencia.setId(idDepend);
		cargo.setId(idCarg);
		cargo.setDependencia(dependencia);
		estadoEmpl.setId(idEstadEmpl);
		
		empleo.setCargo(cargo);
		empleo.setDependencia(dependencia);
		empleo.setEstado(estadoEmpl);
		empleado.setEmpleo(empleo);		
		
		System.out.println("creando persona");
			pService.createOrModifyEmpleado(empleado);				
		System.out.println("Empleado:"+empleado);	
	}
	
	@Test
	@Ignore
	public void modifyEmpleado( ){
		String id ="1079658241";
		Empleado empleado = pService.findEmpleado(id);
		
		//assertEquals("FELIX FABIAN", empleado.getContacto().getNombrs().trim());	
		System.out.println("Empleado:"+empleado);		
		
		System.out.println("Modificando empleado");
		empleado.getContacto().setNombrs("FELIX ENOC");
		pService.createOrModifyEmpleado(empleado);	
		
		empleado = pService.findEmpleado(id);
		assertEquals("FELIX ENOC", empleado.getContacto().getNombrs().trim());		
	}
	
	@Test
	@Ignore
	public void removeEmpleado( ){
		String id ="1079658242";
		Empleado empleado = pService.findEmpleado(id);
		
		assertNotNull(empleado);					
		System.out.println("Empleado:"+empleado);
		
		System.out.println("eliminando empleado");
		pService.removeEmpleado(empleado);
	
	}

	@Test
	@Ignore
	public void findEmpleado(){
		String id ="1079658242";
		Empleado e = pService.findEmpleado(id);
		
		assertNotNull(e);				
		System.out.println("Empleado:"+e);
	}
	
	@Test
	@Ignore
	public void findAll(){
		System.out.println("lista de Empleados\n");
		List<Empleado> list = pService.findAll();
		
		assertTrue(list.size()>0);
		
		for(Empleado e:list){
			System.out.println("Empleado->"+e);			
		}		
	}

}
