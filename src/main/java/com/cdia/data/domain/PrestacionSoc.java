package com.cdia.data.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PrestacionSoc {
	private FondoPens fondoPens;
	private Cesantia cesantia;
	private Eps eps;
	
	public PrestacionSoc() { }

	@ManyToOne
	@JoinColumn(name="CODFONPEN")
	public FondoPens getFondoPens() {
		return fondoPens;
	}

	public void setFondoPens(FondoPens fondoPens) {
		this.fondoPens = fondoPens;
	}

	@ManyToOne
	@JoinColumn( name="CONDFONCES")
	public Cesantia getCesantia() {
		return cesantia;
	}

	public void setCesantia(Cesantia cesantia) {
		this.cesantia = cesantia;
	}

	@ManyToOne
	@JoinColumn(name="CODEPS")
	public Eps getEps() {
		return eps;
	}

	public void setEps(Eps eps) {
		this.eps = eps;
	}		

}
