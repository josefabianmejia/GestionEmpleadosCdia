package com.cdia.data.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MTTDCTO")
public class TpDctoIdentificacion extends AbstractTpDcto<Character> {
	
	public TpDctoIdentificacion() { }
	
	public TpDctoIdentificacion(Character id){
		super(id);
	}
}
