package com.cdia.data.domain;

public interface IFormAcademica {
	
	public boolean addFormacion(EstudioAcademico estudio);
	public boolean removeFormacion(EstudioAcademico estudio);
	public EstudioAcademico getFormacion(int index);	
	public boolean containsEstudio(EstudioAcademico estudio);	
	public int numEstudios(); 

}
