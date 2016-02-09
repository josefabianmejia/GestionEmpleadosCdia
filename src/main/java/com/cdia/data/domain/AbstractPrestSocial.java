package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name = "MTFONDO")
@Inheritance
@DiscriminatorColumn(name = "TIPO", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractPrestSocial {
	
	protected String id;
	protected String codigo;
	protected String nit;
	protected String nombre;	
	
	public AbstractPrestSocial() { }
	
	public AbstractPrestSocial(String id) {
		this.id = id;
	}

	@Id
	@Column(name= "CODFONDO")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="CODIGO")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "NIT")
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
