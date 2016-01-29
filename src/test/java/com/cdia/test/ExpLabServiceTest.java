package com.cdia.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdia.DakaEmpleadoApplication;
import com.cdia.data.domain.Cargo;
import com.cdia.data.domain.CompositeExpLab;
import com.cdia.data.domain.Empleado;
import com.cdia.data.domain.ExpLaboral;
import com.cdia.data.domain.Ocupacion;
import com.cdia.data.domain.OcupacionPk;
import com.cdia.service.IExpLabService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DakaEmpleadoApplication.class)
public class ExpLabServiceTest {

	@Autowired
	private IExpLabService eService;

	@Test
	@Ignore
	public void findAllExpLabByEmpleado() {		
		Empleado empleado = new Empleado("36666383");
		
		ExpLaboral exp = eService.findAllExpLab(empleado);
		System.out.println("Lista ocupaciones");
		for(int i=0;i<exp.numeroExp();i++){
			System.out.println(exp.get(i));
		}		
	}
	
	@Test
	public void findExpLab(){
		OcupacionPk ocupPk = new OcupacionPk(new Long(1), new Empleado("36666383"), new Cargo("ADMON"));
		ExpLaboral exp = eService.findExpLabById(ocupPk);		
		System.out.println("Consultando Experiencia laboral:"+exp);
	}
		
	@Test
	@Ignore
	public void createExpLab(){		
		
		Empleado empleado = new Empleado("36666383");		
		Cargo cargo = new Cargo("ADMON");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fchIni = null;
		Date fchFin = null ;
		try {
			fchIni = sdf.parse("2014-06-12");
			fchFin = sdf.parse("2016-02-15");
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		ExpLaboral exp = new CompositeExpLab();
		Ocupacion ocup = new Ocupacion();		
		ocup.setCargo(cargo);
		ocup.setEmpleado(empleado);
		ocup.setFchIni(fchIni);
		ocup.setFchFin(fchFin);
		//ocup.setSalario(1000000);
		
		exp.add(ocup);
		System.out.println("creando experiencia laboral..."+ocup);
		eService.createExpLab(exp);				
	}
	
	

}
