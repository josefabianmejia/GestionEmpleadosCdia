package com.cdia.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "MVFAMIL")
public class Familiar extends Persona {
	
	private Long id;
	private String doc;	
	private Date fchNac;
	private EstadoCivil<Long> estadCiv;
	private Sexo<Long> sexo;
	private Empleado empleado;
	private Parentesco parentesco;	
	private EmpresaLabora empresaLabora;
	private ResidenciaLabora residenciaLabora;
	private PrestacionSoc prestacionSoc;
	
    public Familiar() {  }     
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDMVFAMIL")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "CCPAREN")	
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}	
	
	@Column(name = "FHNACIM")	
	public Date getFchNac() {
		return fchNac;
	}
	
	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}
		
	@Embedded
	public  EstadoCivil<Long> getEstadCiv(){
		return estadCiv;
	}
	
	public void setEstadCiv(EstadoCivil<Long> estadCiv) {
		this.estadCiv = estadCiv;
	}
	
	@Embedded
	public Sexo<Long> getSexo() {
		return sexo;
	}

	public void setSexo(Sexo<Long> sexo) {
		this.sexo = sexo;
	}
	
	@ManyToOne
	@JoinColumn(name="CEDULA")
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@ManyToOne
    @JoinColumn(name = "CODPAREN")
	public Parentesco getParentesco() {
		return parentesco;
	}
	
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}
	
	@Embedded
	public EmpresaLabora getEmpresaLabora() {
		return empresaLabora;
	}

	public void setEmpresaLabora(EmpresaLabora empresaLabora) {
		this.empresaLabora = empresaLabora;
	}

	@Embedded
	public ResidenciaLabora getResidenciaLabora() {
		return residenciaLabora;
	}

	public void setResidenciaLabora(ResidenciaLabora residenciaLabora) {
		this.residenciaLabora = residenciaLabora;
	}
	
	@Embedded
	public PrestacionSoc getPrestacionSoc() {
		return prestacionSoc;
	}

	public void setPrestacionSoc(PrestacionSoc prestacionSoc) {
		this.prestacionSoc = prestacionSoc;
	}

	@Override
	public String toString() {
		return "Familiar:"+contacto+"Parentesco:"+parentesco;
	}
	
}