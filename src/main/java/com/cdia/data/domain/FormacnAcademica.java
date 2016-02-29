package com.cdia.data.domain;

import java.util.ArrayList;
import java.util.List;

public class FormacnAcademica implements IFormAcademica{
	
	private List<EstudioAcademico> listFormacion;
	
	public FormacnAcademica() {
		listFormacion = new ArrayList<>();
	}

	@Override
	public boolean addFormacion(EstudioAcademico estudio) {
		return this.listFormacion.add(estudio);
	}

	@Override
	public boolean removeFormacion(EstudioAcademico estudio) {
		return this.listFormacion.remove(estudio);
	}

	@Override
	public EstudioAcademico getFormacion(int index) {
		return this.listFormacion.get(index);
	}
	
	@Override
	public boolean containsEstudio(EstudioAcademico estudio) {
		return this.listFormacion.contains(estudio);
	}

	@Override
	public int numEstudios() {
		return this.listFormacion.size();
	}

	public List<EstudioAcademico> getListFormacion() {
		return listFormacion;
	}


}
