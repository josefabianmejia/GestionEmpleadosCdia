package com.cdia.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Cesantia;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Contacto;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EmpresaLabora;
import com.cdia.data.domain.Eps;
import com.cdia.data.domain.Familiar;
import com.cdia.data.domain.FondoPens;
import com.cdia.data.domain.ResidenciaLabora;
import com.cdia.data.domain.Sexo;
import com.cdia.data.domain.Pais;
import com.cdia.data.domain.Parentesco;
import com.cdia.data.domain.PrestacionSoc;
import com.cdia.data.domain.Profesion;
import com.cdia.service.IFamiliarService;
import com.cdia.ultil.EmpleadoFactory;
import com.cdia.ultil.FamiliarFactory;
import com.cdia.ultil.PersonaFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class FamiliarServiceTest {
	@Autowired
	private IFamiliarService fService;

	@Test
	@Ignore
	public void findAllFamiliarByEmpleado() {
		Empleado empleado = new Empleado("19586847");
		List<Familiar> list = fService.findAllFamiliarByEmpleado(empleado);
		
		//assertTrue(list.size()==7);
		
		System.out.println("familiares de "+empleado.getId());
		for(Familiar f:list){
			System.out.println("Familiar"+f);
		}
	}
	
	@Test
	@Ignore
	public void createFamiliar(){
		PersonaFactory factoryF = FamiliarFactory.getInstance();
		PersonaFactory factoryE = EmpleadoFactory.getInstance();
		
		Empleado empleado = (Empleado) factoryE.createPersona(); 	
		Familiar familiar = (Familiar)factoryF.createPersona();
		
		Pais pais = new Pais("0");
		Departamento departamento = new Departamento("0");
		Ciudad ciudad = new Ciudad("0");		
						
		Contacto contacto = new Contacto();
		contacto.setNombrs("Sara Mercedez");
		contacto.setPaisResid(pais);
		contacto.setDeptoResid(departamento);
		contacto.setCiudadResid(ciudad);
		
		Profesion profesion = new Profesion("finazas");
		
		EmpresaLabora empresaLabora = new EmpresaLabora();
		empresaLabora.setEmpresa("EMpresa 2");
		empresaLabora.setOcupacion("Aux financiera");
		
		ResidenciaLabora residenciaLabora = new ResidenciaLabora();
		residenciaLabora.setPais(pais);
		
		residenciaLabora.setDepartamento(departamento);
		residenciaLabora.setCiudad(ciudad);
		
		PrestacionSoc prestacionSoc = new PrestacionSoc();
		prestacionSoc.setFondoPens(new FondoPens("0"));
		prestacionSoc.setCesantia(new Cesantia("0"));
		prestacionSoc.setEps(new Eps("0"));		
		
		empleado.setId("19586847");	
		
		familiar.setDoc("12345678");
		familiar.setEmpleado(empleado);
		familiar.setSexo(new Sexo<Long>(new Long(2)));
		familiar.setProfesion(profesion);
		familiar.setParentesco(new Parentesco("01"));		
		familiar.setContacto(contacto);
		familiar.setEmpresaLabora(empresaLabora);
		familiar.setResidenciaLabora(residenciaLabora);
		familiar.setPrestacionSoc(prestacionSoc);
		
		System.out.println("Creando familiar");
		fService.createOrModifyFamiliar(familiar);		 
	}
	
	@Test
	@Ignore
	public void removeFamiliar(){
		Long id = new Long(208);
		Familiar familiar = fService.findFamiliarById(id);
		System.out.println("Eliminando familiar");
		fService.remove(familiar);
	}
	
}
