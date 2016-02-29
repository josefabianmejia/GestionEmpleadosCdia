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
import com.cdia.data.domain.TpVivienda;
import com.cdia.service.ITpViviendaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class TpViviendaServiceTest {
	@Autowired
	private ITpViviendaService vService;
	
	@Test 
	@Ignore
	public void findAll(){
		Collection<TpVivienda> list = vService.findAllTpVivinds();
		assertEquals(list.size(),1);
	}

}
