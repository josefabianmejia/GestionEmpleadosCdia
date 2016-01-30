package com.cdia.data.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MVEXPLAB")
@IdClass(OcupacionPk.class)
public class Ocupacion extends ExpLaboral{	
	
	private Long id;	
	private Date fchIni;
	protected Date fchFin;
	private double salario;	
	protected Empleado empleado;
	protected Cargo cargo;
	
	public Ocupacion() { }
	
	public Ocupacion(Empleado empleado,Cargo cargo) { 		
		this.empleado = empleado;
		this.cargo = cargo;
	}
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name="IDMVEXPLAB")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="FHINICIAL")	
	public Date getFchIni() {
		return fchIni;
	}
	
	public void setFchIni(Date fchIni) {
		this.fchIni = fchIni;
	}

	@Column(name="FHFINAL")	
	public Date getFchFin() {
		return fchFin;
	}	
	
	public void setFchFin(Date fchFin) {
		this.fchFin = fchFin;
	}

	@Column(name ="SALARIOF")	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Id
	@ManyToOne
	@JoinColumn(name="CEDULA")	
	public Empleado getEmpleado() {
		return empleado;
	}	
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}	

	@Id
	@ManyToOne
	@JoinColumn(name="CODCARGO")		
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}	

	@Override
	public boolean add(ExpLaboral e) { return false; }

	@Override
	public boolean remove(ExpLaboral e) {  return false; }

	@Override
	public ExpLaboral get(int i) { return this; }
	
	@Override
	public int numeroExp() {		
		return 1;
	}
	
	@Override
	public void calcTiempExp() {
		GregorianCalendar calFchI = new GregorianCalendar();
		GregorianCalendar calFchF = new GregorianCalendar();		
		calFchI.setTime(fchIni);
		calFchF.setTime(fchFin);	
		
		int diasDif = calFchF.get(Calendar.DAY_OF_YEAR)- calFchI.get(Calendar.DAY_OF_YEAR); 
		super.mesesExp = super.mesesExp+(diasDif/30);	
	}

	@Override
	public String toString() {
		return "Ocupacion:"+"empleado: "+empleado+" cargo:"+cargo +" fecha inicio:"+fchIni+" fecha fin:"+fchFin;
	}
	
}

