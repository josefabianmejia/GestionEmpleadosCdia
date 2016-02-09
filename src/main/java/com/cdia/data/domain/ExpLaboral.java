package com.cdia.data.domain;

import java.util.ArrayList;
import java.util.List;

public class ExpLaboral extends AbstractExpLaboral{
	private static AbstractExpLaboral instance = new ExpLaboral();
	private List<AbstractExpLaboral> list = new ArrayList<>();
	
	private ExpLaboral() {  }
	
	public static AbstractExpLaboral getInstance(){
		return instance;
	}	
	
	@Override
	public boolean add(AbstractExpLaboral e) {
		return list.add(e);	
	}

	@Override
	public boolean remove(AbstractExpLaboral e) {
		return list.remove(e);		
	}

	@Override
	public AbstractExpLaboral get(int i) {		
		return list.get(i);
	}	

	@Override
	public int numeroExp() {		
		return list.size();
	}
	
	@Override
	public void calcTiempExp() {
		for(AbstractExpLaboral e:list){
			e.calcTiempExp();
		}
	}

}
