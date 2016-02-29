package com.cdia.test;

import java.util.Collection;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.IEstudioFormalRepository;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.EstudioAcademico;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class EstudioFormRepositoryTest {
	
	@Autowired
	private IEstudioFormalRepository fRepository;
	
	@Test
	@Ignore
	public void getAll(){
		Empleado empleado = new Empleado("1065610705");
		Collection<EstudioAcademico> list = (Collection<EstudioAcademico>)fRepository.findAllByEmpleado(empleado);
		assertEquals(list.size(), 1);
		System.out.println("numero de elementos:"+list.size());
	}

}
