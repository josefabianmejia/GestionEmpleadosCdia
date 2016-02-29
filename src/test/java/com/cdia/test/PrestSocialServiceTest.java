package com.cdia.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Cesantia;
import com.cdia.data.domain.FondoPens;
import com.cdia.service.ICesantiaService;
import com.cdia.service.IFondoService;

@RunWith(SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class PrestSocialServiceTest {
	@Autowired
	private IFondoService fService;
	
	@Autowired
	private ICesantiaService cService;

	@Test
	@Ignore
	public void findAllFondos(){
		Collection<FondoPens> list = fService.findAllFondos();
		
		System.out.println("Lista de fondos:");
		for(FondoPens f:list){
			System.out.println("fondo:"+f);
		}
		
		assertEquals(list.size(),14);
		System.out.println("numero :"+list.size());
	}
	
	@Test
	@Ignore
	public void createFondo(){
		FondoPens fondo = new FondoPens();
		fondo.setId("FPR6");
		fondo.setCodigo("FPR6");
		fondo.setNit("12332121");
		fondo.setNombre("prueba nuevo Fondo");
		
		System.out.println("creando fondo");
		fService.createFondo(fondo);
	}
	
	@Test
	@Ignore
	public void findAllCesantias(){
		Collection<Cesantia> list = cService.findAllCesantias();
		
		System.out.println("Lista de cesantias:");
		for(Cesantia c:list){
			System.out.println("Cesantia:"+c);
		}
		
		assertEquals(list.size(),5);
		System.out.println("numero :"+list.size());
	}
	
	
}
