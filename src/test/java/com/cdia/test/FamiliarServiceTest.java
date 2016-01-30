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
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.Familiar;
import com.cdia.service.IFamiliarService;

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
		
		assertTrue(list.size()==1);
		
		System.out.println("familiares de "+empleado.getId());
		for(Familiar f:list){
			System.out.println("Familiar"+f);
		}
	}
	
	public void createFamiliar(){
		Empleado empleado = new Empleado("19586847");
		 
	}
	
}
