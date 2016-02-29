package com.cdia.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.Set;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.CaractFisca;
import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Contacto;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Dependencia;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Empleo;
import com.cdia.data.domain.EstadoCivil;
import com.cdia.data.domain.EstadoEmpleo;
import com.cdia.data.domain.HabitPersonal;
import com.cdia.data.domain.NacimtoEmpleado;
import com.cdia.data.domain.Pais;
import com.cdia.data.domain.Profesion;
import com.cdia.data.domain.Sexo;
import com.cdia.data.domain.TpDctoIdentificacion;
import com.cdia.data.domain.TpVivienda;
import com.cdia.ultil.EmpleadoFactory;
import com.cdia.ultil.PersonaFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
@WebAppConfiguration
@Rollback(value = true)
@Transactional
public class EmpleadoControllerTest {
	
	@Autowired
	private WebApplicationContext wac; 
	private MockMvc mockMvc;
	private RestTemplate rest;
	private final String URL = "http://localhost:9999/api/gtaEmpleados/empleado";
	
	@Before
	public void init(){
		mockMvc = webAppContextSetup(wac).build();
		rest = new RestTemplate();
	}
		
	@Test
	@Ignore
	public void getEmpleado(){
		try {
			mockMvc.perform(get("/api/gtaEmpleado/empleado/{id}","1079658249"))
				   .andExpect(status().isOk())
				   .andExpect(content().contentType(MediaType.APPLICATION_JSON));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		       
		
	}
	
	@Test
	@Ignore
	public void createEmpleado(){
		String id="1079658262";
		String dc = "1079658262";		
		String nomb = "JESUS DAVID";
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
		empleado.setTpDoc(new TpDctoIdentificacion('1'));
		empleado.setApells(apll);
		empleado.setContacto(contacto);
		empleado.setNacimtoEmpleado(nacimtoEmpleado);
		empleado.setEstadCiv(new EstadoCivil<>('C'));
		empleado.setSexo(new Sexo<>('M'));
				
		dependencia.setId(idDepend);
		cargo.setId(idCarg);
		cargo.setDependencia(dependencia);
		estadoEmpl.setId(idEstadEmpl);
		
		empleo.setCargo(cargo);
		empleo.setDependencia(dependencia);
		empleo.setEstado(estadoEmpl);
		empleado.setEmpleo(empleo);		
		
		System.out.println("creando persona");
		rest.postForObject(URL, empleado,Empleado.class);
		System.out.println("Empleado:"+empleado);	
	}
	
	@Test
	@Ignore
	public void modifyEmpleado(){
		String id ="1079658249";
		ResponseEntity<Empleado> entity = rest.getForEntity(URL+"/{id}",Empleado.class,id);
		Empleado empleado =   entity.getBody();
		
		//assertEquals("FELIX FABIAN", empleado.getContacto().getNombrs().trim());	
		System.out.println("Empleado:"+empleado);		
		
		System.out.println("Modificando empleado");
		
		Profesion profesion = new Profesion("Administador de Empresas");
		TpVivienda tpVivienda = new TpVivienda("0");
		CaractFisca caractFisca = new CaractFisca();
		HabitPersonal habitPersonal = new HabitPersonal();
		
		habitPersonal.setIsAntOjs(false);
		habitPersonal.setIsConsLic(false);
		habitPersonal.setIsfuma(false);
		habitPersonal.setPasaTiemp("Leer");		
		
		caractFisca.setTpSangr("O+");
		caractFisca.setPeso(new Float(58.70));
		caractFisca.setEstatur(new Float(1.70));
		caractFisca.setLimFisic("ninguna");		
		
		empleado.getContacto().setNombrs("FELIX ENOC");
		empleado.setProfesion(profesion);
		empleado.setTpVivienda(tpVivienda);
		empleado.setCaractFisc(caractFisca);
		empleado.setHabits(habitPersonal);	
			
		rest.put(URL+"/{id}", empleado,id);
		assertEquals("FELIX ENOC", empleado.getContacto().getNombrs().trim());	
	}
	
	
	
	
	
}
