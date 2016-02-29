package com.cdia.data.domain;

import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MTDEPTO")
public class Departamento {
		
	private String id;
	private String nombre;
	
	public Departamento() { }
	
	public Departamento(String id) { 
		this.id = id;
	}

	@Id
	@Column(name="CODDEPTO")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "DEPART:"+nombre;
	}
	
	public static class DepartamentoComparator implements Comparator<Departamento>{
		public DepartamentoComparator() { }

		@Override
		public int compare(Departamento o1, Departamento o2) {
			return o1.getNombre().compareTo(o2.getNombre());
		}	
		
	}
	
}




