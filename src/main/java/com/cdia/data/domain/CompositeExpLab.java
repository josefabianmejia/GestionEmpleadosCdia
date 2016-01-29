package com.cdia.data.domain;

import java.util.ArrayList;
import java.util.List;

public class CompositeExpLab extends ExpLaboral{
	private List<ExpLaboral> list = new ArrayList<>();
	
	@Override
	public void add(ExpLaboral e) {
		list.add(e);	
	}

	@Override
	public void remove(ExpLaboral e) {
		list.remove(e);		
	}

	@Override
	public ExpLaboral get(int i) {		
		return list.get(i);
	}	

	@Override
	public int numeroExp() {		
		return list.size();
	}
	
	@Override
	public void calcTiempExp() {
		for(ExpLaboral e:list){
			e.calcTiempExp();
		}
	}

}
