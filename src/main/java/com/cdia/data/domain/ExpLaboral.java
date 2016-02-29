package com.cdia.data.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MVEXPER")
public class ExpLaboral {
	
	private Long id;	
	private String cargo;
	private Date fechIngreso;
	private Date fechRetiro;	
	private String motivoRetiro;
	private String jefeInmediato;
	private String cargoJefe;	
	private ContactoEmpresa contactoEmpresa;
	private Empleado empleado;
		
	public ExpLaboral() { }
	
	public ExpLaboral(Long id) { 
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMVEXPER")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="FHINGRESO")
	public Date getFechIngreso() {
		return fechIngreso;
	}

	public void setFechIngreso(Date fechIngreso) {
		this.fechIngreso = fechIngreso;
	}

	@Column(name="FHRETIRO")
	public Date getFechRetiro() {
		return fechRetiro;
	}

	public void setFechRetiro(Date fechRetiro) {
		this.fechRetiro = fechRetiro;
	}
	
	@Column(name="MOTIVO")
	public String getMotivoRetiro() {
		return motivoRetiro;
	}

	public void setMotivoRetiro(String motivoRetiro) {
		this.motivoRetiro = motivoRetiro;
	}

	@Column(name="JEFE")
	public String getJefeInmediato() {
		return jefeInmediato;
	}

	public void setJefeInmediato(String jefeInmediato) {
		this.jefeInmediato = jefeInmediato;
	}

	@Column(name="CARGOJEFE")
	public String getCargoJefe() {
		return cargoJefe;
	}

	public void setCargoJefe(String cargoJefe) {
		this.cargoJefe = cargoJefe;
	}

	@Column(name="CARGO")
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
		
	@Embedded
	public ContactoEmpresa getContactoEmpresa() {
		return contactoEmpresa;
	}

	public void setContactoEmpresa(ContactoEmpresa contactoEmpresa) {
		this.contactoEmpresa = contactoEmpresa;
	}	

	@ManyToOne
	@JoinColumn(name="CEDULA")
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int calcTiempExp() {
		GregorianCalendar calFchI = new GregorianCalendar();
		GregorianCalendar calFchF = new GregorianCalendar();		
		calFchI.setTime(fechIngreso);
		calFchF.setTime(fechRetiro);	
		
		int diasDif = calFchF.get(Calendar.DAY_OF_YEAR)- calFchI.get(Calendar.DAY_OF_YEAR); 
		return (diasDif/30);	
	}
}
