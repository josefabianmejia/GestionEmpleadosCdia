package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Contacto {
	
	@Column(name="NOMBRE")
	private String nombrs;
	
	@Column(name="APELLIDO")
	private String apells;
	
	@Column(name="TELEFONO")
	private String tel;
	
	@Column(name="CELULAR")
	private String cel;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="BARRIO")
	private String barrio;
	
	@Column(name="DIRECCION")
	private String direc;
	
	@ManyToOne
	@JoinColumn(name="CODPAISRES")
	private Pais PaisResid;
	
	@ManyToOne
	@JoinColumn(name="CODDPTORES")
	private Departamento deptoResid;

	@ManyToOne
	@JoinColumn(name="CODCIUDRES")
	private Ciudad ciudadResid;	
	
	public Contacto() { }

	public String getNombrs() {
		return nombrs;
	}

	public void setNombrs(String nombrs) {
		this.nombrs = nombrs;
	}

	public String getApells() {
		return apells;
	}

	public void setApells(String apells) {
		this.apells = apells;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public Pais getPaisResid() {
		return PaisResid;
	}

	public void setPaisResid(Pais paisResid) {
		PaisResid = paisResid;
	}

	public Departamento getDeptoResid() {
		return deptoResid;
	}

	public void setDeptoResid(Departamento deptoResid) {
		this.deptoResid = deptoResid;
	}

	public Ciudad getCiudadResid() {
		return ciudadResid;
	}

	public void setCiudadResid(Ciudad ciudadResid) {
		this.ciudadResid = ciudadResid;
	}

	@Override
	public String toString() {
		return "NOMBRE:"+nombrs+" "+apells+" RESID:"+PaisResid+deptoResid+ciudadResid;
	}
	
	
}
