package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class CaractFisca {
	
	@Column(name="SEXO")
	private char sexo;
	
	@Column(name="PESO")	
	private Float peso;
	
	@Column(name="ESTATURA")
	private Float estatur;
	
	@Column(name="LIMITACION")	
	private String limFisic;
	
	@Column(name="GRUPOSAN")	
	private String tpSangr;
	
	public CaractFisca() { }

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getEstatur() {
		return estatur;
	}

	public void setEstatur(Float estatur) {
		this.estatur = estatur;
	}

	public String getLimFisic() {
		return limFisic;
	}

	public void setLimFisic(String limFisic) {
		this.limFisic = limFisic;
	}

	public String getTpSangr() {
		return tpSangr;
	}

	public void setTpSangr(String tpSangr) {
		this.tpSangr = tpSangr;
	}

	@Override
	public String toString() {
		return "Sex:"+sexo+" peso:"+peso+"tipSang:"+tpSangr;
	}
	
}
