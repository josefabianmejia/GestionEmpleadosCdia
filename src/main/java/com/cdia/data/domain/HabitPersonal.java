package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;

@Embeddable
public class HabitPersonal {
	
	@Column(name="FUMA")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean isfuma;
	
	@Column(name="ANTEOJOS")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean isAntOjs;
	
	@Column(name="BEBE")
	@Type(type="org.hibernate.type.NumericBooleanType")
	private boolean isConsLic;
	
	@Column(name="PASATIEMPO")
	private String pasaTiemp;
	
	public HabitPersonal() { }

	public boolean isIsfuma() {
		return isfuma;
	}

	public void setIsfuma(boolean isfuma) {
		this.isfuma = isfuma;
	}

	public boolean isAntOjs() {
		return isAntOjs;
	}

	public void setAntOjs(boolean isAntOjs) {
		this.isAntOjs = isAntOjs;
	}

	public boolean isConsLic() {
		return isConsLic;
	}

	public void setConsLic(boolean isConsLic) {
		this.isConsLic = isConsLic;
	}

	public String getPasaTiemp() {
		return pasaTiemp;
	}

	public void setPasaTiemp(String pasaTiemp) {
		this.pasaTiemp = pasaTiemp;
	}

	@Override
	public String toString() {
		return "HABITOS:fuma:"+isfuma+" bebe:"+isConsLic+ " pasatemp:"+pasaTiemp;
	}
	
}
