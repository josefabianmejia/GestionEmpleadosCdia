package com.cdia.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="MVDCTOS")
public class Documento {
	private Long id;
	private String num;
	private Date fchaExp;
	private Date fchVenc;
	private String detalle;
	private Empleado empleado;
	private TpDctoLaboral tpDcto;
	
	public Documento() { }
	
	public Documento(Long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDMVDCTOS")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="NRODCTO")
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Column(name ="FHEXPED")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	public Date getFchaExp() {
		return fchaExp;
	}

	public void setFchaExp(Date fchaExp) {
		this.fchaExp = fchaExp;
	}

	@Column(name ="FHVENCE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	public Date getFchVenc() {
		return fchVenc;
	}

	public void setFchVenc(Date fchVenc) {
		this.fchVenc = fchVenc;
	}
	
	@Column(name ="NOTA")
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
	@JoinColumn(name="CODDCTO")
	public TpDctoLaboral getTpDcto() {
		return tpDcto;
	}

	public void setTpDcto(TpDctoLaboral tpDcto) {
		this.tpDcto = tpDcto;
	}
		
}
