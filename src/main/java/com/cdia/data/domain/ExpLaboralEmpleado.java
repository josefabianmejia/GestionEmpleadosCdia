package com.cdia.data.domain;

import java.util.ArrayList;
import java.util.List;

public class ExpLaboralEmpleado{
	
	private static ExpLaboralEmpleado instance = new ExpLaboralEmpleado();
	private List<ExpLaboral> list = new ArrayList<>();
	private int mesesExp = 0;
	
	private ExpLaboralEmpleado() {  }
	
	public static ExpLaboralEmpleado getInstance(){
		return instance;
	}	
	
	public boolean add(ExpLaboral e) {
		return list.add(e);	
	}

	public boolean remove(ExpLaboral e) {
		return list.remove(e);		
	}

	public ExpLaboral get(int i) {		
		return list.get(i);
	}	

	public int numeroExp() {		
		return list.size();
	}
	
	public int calcTiempExp() {
		for(ExpLaboral e:list){
			mesesExp += e.calcTiempExp();
		}
		return mesesExp;
	}

}
