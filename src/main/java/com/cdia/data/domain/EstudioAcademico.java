package com.cdia.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "MVESTUD")
@Inheritance
@DiscriminatorColumn(name="PERIODO",discriminatorType = DiscriminatorType.STRING)
public abstract class EstudioAcademico {
	
	private Long id;
	private String titulo;
	private Date fechaFin;	
	private NivelEstudio nivel;
	private ModalidadEstudio modalidad;
	private Ciudad ciudad;
	private Empleado empleado;
	
	public EstudioAcademico() {  }
	
	public EstudioAcademico(Long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMVESTUD")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TITULO")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "FHTERMIN")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}	

	@ManyToOne
	@JoinColumn(name="CODESTUD")
	public NivelEstudio getNivel() {
		return nivel;
	}

	public void setNivel(NivelEstudio nivel) {
		this.nivel = nivel;
	}

	@ManyToOne
	@JoinColumn(name="CODMODAL")
	public ModalidadEstudio getModalidad() {
		return modalidad;
	}

	public void setModalidad(ModalidadEstudio modalidad) {
		this.modalidad = modalidad;
	}

	@ManyToOne
	@JoinColumn(name = "CODCIUDAD")
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@ManyToOne
	@JoinColumn(name = "CEDULA")
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}	
	
//	public abstract boolean addFormacion(EstudioAcademico estudio);
//	public abstract boolean removeFormacion(EstudioAcademico estudio);
//	public abstract EstudioAcademico getFormacion(int index);	
//	public abstract boolean containsEstudio(EstudioAcademico estudio);	
//	public abstract int numEstudios(); 
	
}
