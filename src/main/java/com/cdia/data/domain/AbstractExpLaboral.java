package com.cdia.data.domain;

public abstract class AbstractExpLaboral {		
	protected int mesesExp = 0;	
	
	public AbstractExpLaboral(){  }	
	
	public abstract boolean add(AbstractExpLaboral e);
	public abstract boolean remove(AbstractExpLaboral e);
	public abstract AbstractExpLaboral get(int i);	
	public abstract int numeroExp();
	public abstract void calcTiempExp();		
}
