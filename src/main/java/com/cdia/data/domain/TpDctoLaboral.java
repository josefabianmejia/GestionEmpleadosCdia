package com.cdia.data.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MTDCTOS")
public class TpDctoLaboral extends AbstractTpDcto<String> {
	
	public TpDctoLaboral() { }

	public TpDctoLaboral(String id) {
		super(id);		
	}
}
