package com.cdia.data.domain;

public abstract class ExpLaboral {		
	protected int mesesExp = 0;	
	
	public ExpLaboral(){  }	
	
	public abstract void add(ExpLaboral e);
	public abstract void remove(ExpLaboral e);
	public abstract ExpLaboral get(int i);	
	public abstract int numeroExp();
	public abstract void calcTiempExp();		
}
