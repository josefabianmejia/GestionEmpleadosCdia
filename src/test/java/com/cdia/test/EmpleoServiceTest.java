package com.cdia.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.Dependencia;
import com.cdia.service.IEmpleoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
@Rollback(value = true)
@Transactional
public class EmpleoServiceTest {
	
	@Autowired
	@Qualifier("empleoService")
	private IEmpleoService eService;
	
	@Test
	@Ignore
	public void getAllCargosByDependencia(){
		Dependencia dependencia = new Dependencia("A01");
		Collection<Cargo> list = eService.finAllCargos(dependencia);
		
		System.out.println("Lista de cargos del area: "+dependencia);		
		Iterator<Cargo> it = list.iterator();
		while(it.hasNext()){
			System.out.println("Cargo: "+it.next());
		}
	}

}
