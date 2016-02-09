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
import com.cdia.data.domain.Ciudad;
import com.cdia.data.domain.Departamento;
import com.cdia.data.domain.Pais;
import com.cdia.service.ILocalizacnService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class LocalzServiceTest {
	@Autowired
	private ILocalizacnService lService;	
	
	@Test
	@Ignore
	public void findAllPaises(){
		System.out.println("Lista de paises\n");
		List<Pais> list = lService.findAllPaises();
		
		for(Pais p: list){
			System.out.println("pais:"+p); 
		}
		
	}
	
	@Test
	@Ignore
	
	public void findAllDepartamts(){
		System.out.println("Lista de departamentos\n");
		List<Departamento> list = lService.findAllDepartamts();
		
		for(Departamento d:list){
			System.out.println("departamento:"+d);
		}
	}
	
	
	@Test
	@Ignore
	public void findAllCiudads(){
		Departamento dpto = new Departamento("47");
		System.out.println("lista de ciudades\n");
		List<Ciudad> list = lService.findAllCiudads(dpto);
		
		for(Ciudad c:list){
			System.out.println("ciudad:"+c);
		}
	}

}
