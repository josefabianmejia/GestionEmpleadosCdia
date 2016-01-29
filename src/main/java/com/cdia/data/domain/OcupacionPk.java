package com.cdia.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OcupacionPk implements Serializable{

	private Long id;
	private Empleado empleado;
	private Cargo cargo;
	
	public OcupacionPk() { }
	
	public OcupacionPk(Long id,Empleado empleado,Cargo cargo) { 
		this.id = id;
		this.empleado = empleado;
		this.cargo = cargo;
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		return empleado.hashCode()+cargo.hashCode()+id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OcupacionPk){
			OcupacionPk ocupPk = (OcupacionPk)obj; 
			if(ocupPk.id==id && 
			   ocupPk.cargo.getId().equals(cargo.getId()) &&
			   ocupPk.empleado.getId().equals(empleado.getId())
			  )
				return true;			
		}
		return false;		
	}
	
}
