package com.cdia.data.domain;

import java.util.ArrayList;
import java.util.List;

public class OcupDesempeñada extends ExpLaboral{
	private static ExpLaboral instance = new OcupDesempeñada();
	private List<ExpLaboral> list = new ArrayList<>();
	
	private OcupDesempeñada() {  }
	
	public static ExpLaboral getInstance(){
		return instance;
	}	
	
	@Override
	public boolean add(ExpLaboral e) {
		return list.add(e);	
	}

	@Override
	public boolean remove(ExpLaboral e) {
		return list.remove(e);		
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
