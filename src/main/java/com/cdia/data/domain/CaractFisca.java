package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class CaractFisca {	
			
	private Float peso;
	private Float estatur;
	private String limFisic;
	private String tpSangr;
	
	public CaractFisca() { }
	
	@Column(name="PESO")
	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Column(name="ESTATURA")
	public Float getEstatur() {
		return estatur;
	}

	public void setEstatur(Float estatur) {
		this.estatur = estatur;
	}

	@Column(name="LIMITACION")
	public String getLimFisic() {
		return limFisic;
	}

	public void setLimFisic(String limFisic) {
		this.limFisic = limFisic;
	}

	@Column(name="GRUPOSAN")	
	public String getTpSangr() {
		return tpSangr;
	}

	public void setTpSangr(String tpSangr) {
		this.tpSangr = tpSangr;
	}

	@Override
	public String toString() {
		return "peso:"+peso+"tipSang:"+tpSangr;
	}
	
}
