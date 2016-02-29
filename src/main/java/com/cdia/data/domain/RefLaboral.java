package com.cdia.data.domain;

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
@Table(name = "MVREFER") 
public class RefLaboral {
	private Long id;
	private String nombres;
	private String tel;
	private boolean isFamiliar;
	private String observacion;
	private Empleado empleado;
	private EmpresaLabora empresaLabora;
	
	public RefLaboral() {  }
	
	public RefLaboral(Long id) { 
		this.id = id;		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMVREFER")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NOMBRE")
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "TELEFONO")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "FAMILIAR")
	@Type(type = "yes_no")
	public boolean isFamiliar() {
		return isFamiliar;
	}

	public void setFamiliar(boolean isFamiliar) {
		this.isFamiliar = isFamiliar;
	}

	@Column(name = "RESULTADO")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@ManyToOne
	@JoinColumn(name = "CEDULA")
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Embedded
	public EmpresaLabora getEmpresaLabora() {
		return empresaLabora;
	}

	public void setEmpresaLabora(EmpresaLabora empresaLabora) {
		this.empresaLabora = empresaLabora;
	}
			
}
