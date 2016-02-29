package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;

@Embeddable
public class HabitPersonal {
	
	private boolean isfuma;	
	private boolean isAntOjs;	
	private boolean isConsLic;	
	private String pasaTiemp;
	
	public HabitPersonal() { }

	@Column(name="FUMA")
	@Type(type="org.hibernate.type.NumericBooleanType")
	public boolean isIsfuma() {
		return isfuma;
	}

	public void setIsfuma(boolean isfuma) {
		this.isfuma = isfuma;
	}

	@Column(name="ANTEOJOS")
	@Type(type="org.hibernate.type.NumericBooleanType")
	public boolean isIsAntOjs() {
		return isAntOjs;
	}

	public void setIsAntOjs(boolean isAntOjs) {
		this.isAntOjs = isAntOjs;
	}

	@Column(name="BEBE")
	@Type(type="org.hibernate.type.NumericBooleanType")
	public boolean isIsConsLic() {
		return isConsLic;
	}

	public void setIsConsLic(boolean isConsLic) {
		this.isConsLic = isConsLic;
	}

	@Column(name="PASATIEMPO")
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
