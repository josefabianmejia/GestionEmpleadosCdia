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
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Empleo;
import com.cdia.data.domain.EstadoEmpleo;
import com.cdia.data.domain.Pais;
import com.cdia.service.IEmpleadoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class EmpleadooServiceTest {
	@Autowired
	private IEmpleadoService pService;

	@Test	
	@Ignore
	public void createEmpleado( ){
		String id="1079658241";
		String dc = "1079658240";
		long tpdc = 0;
		String nomb = "JOSE FABIAN";
		String apll = "MEJIA RADA";
		String idPais = "169";
		String idDep = "0";
		String idCiu ="47170";
		String idDepend ="A04";
		String idCarg ="INGD";
		String idEstadEmpl ="01";
			
		Pais pais = new Pais(idPais);
		Departamento dpto = new Departamento(idDep);
		Ciudad ciudad = new Ciudad(idCiu);	
		
		Empleado empleado = new Empleado();
		Empleo empleo = new Empleo();
		Cargo cargo = new Cargo();
		Dependencia dependencia = new Dependencia();	
		EstadoEmpleo estadoEmpl = new EstadoEmpleo();
				
		empleado.setId(id);	
		empleado.setDoc(dc);
		empleado.setTpDoc(tpdc);
		empleado.setApells(apll);
		empleado.setNombrs(nomb);
		empleado.setPaisResid(pais);
		empleado.setDeptoResid(dpto);
		empleado.setCiudadResid(ciudad);
		empleado.setPaisNac(pais);
		empleado.setDeptoNac(dpto);
		empleado.setCiudadNac(ciudad);
		
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
//	public void removeEmpleado( ){}
//	public void modifyEmpleado( ){}

	@Test
	@Ignore
	public void findEmpleado(){
		String id ="1079658240";
		Empleado e = pService.findEmpleado(id);
		
		assertNotNull(e);		
		//assertEquals("1084738163",p.getDoc());		
		System.out.println("Empleado:"+e);
	}
	
	@Test
	//@Ignore
	public void findAll(){
		System.out.println("lista de Empleados\n");
		List<Empleado> list = pService.findAll();
		
		assertTrue(list.size()>0);
		
		for(Empleado e:list){
			System.out.println("Empleado->"+e);			
		}		
	}

}
