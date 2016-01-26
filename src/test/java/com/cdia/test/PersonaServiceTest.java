package com.cdia.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Persona;
import com.cdia.service.IPersonaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class PersonaServiceTest {
	@Autowired
	private IPersonaService pService;

//	public void createPersona(Persona persona){}
//	public void removePersona(Persona persona){}
//	public void modifyPersona(Persona persona){}
//	public void findPersona(String id){}
	
	@Test
	public void findAll(){
		System.out.println("lista de personas\n");
		List<Persona> list = pService.findAll();
		
		for(Persona p:list){
			System.out.println("Persona->"+p);			
		}		
	}

}
