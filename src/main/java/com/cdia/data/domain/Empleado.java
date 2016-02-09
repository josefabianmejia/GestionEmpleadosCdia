package com.cdia.data.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="[MTHOJAV]")
public class Empleado extends Persona {
	
	private String id;	
	private String doc;	
	private String apells;	
	private String email;
	private int numPersCarg;	
	private int numHjos;		
	private EstadoCivil<Character> estadCiv;
	//private Character estadCiv;
	private Sexo<Character> sexo;
	private NacimtoEmpleado nacimtoEmpleado;
	private TpVivienda tpVivienda;
	private CaractFisca caractFisc;
	private HabitPersonal habits;		
	private Empleo empleo;
	
    public Empleado() { }  
    
    public Empleado(String id) {
    	this.id = id;
    }  
    
    @Id		
	@Column(name="CODIGO")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
	
	@Column(name="CEDULA",nullable=false)
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}
	
	@Column(name="APELLIDO")	
	public String getApells() {
		return apells;
	}
	
	public void setApells(String apells) {
		this.apells = apells;
	}
	
	@Column(name="EMAIL")	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}

	@Column(name="ACARGO")
	public int getNumPersCarg() {
		return numPersCarg;
	}

	public void setNumPersCarg(int numPersCarg) {
		this.numPersCarg = numPersCarg;
	}
	
	@Column(name="NROHIJOS")
	public int getNumHjos() {
		return numHjos;
	}

	public void setNumHjos(int numHjos) {
		this.numHjos = numHjos;
	}
	
	@Embedded
	public  EstadoCivil<Character> getEstadCiv(){
		return estadCiv;
	}
	
	public void setEstadCiv(EstadoCivil<Character> estadCiv) {
		this.estadCiv = estadCiv;
	}

//	@Column(name = "EDOCIV")
//	public  Character getEstadCiv(){
//		return estadCiv;
//	}
//	
//	public void setEstadCiv(Character estadCiv) {
//		this.estadCiv = estadCiv;
//	}
	
	@Embedded
	public Sexo<Character> getSexo() {
		return sexo;
	}

	public void setSexo(Sexo<Character> sexo) {
		this.sexo = sexo;
	}
	
	@Embedded
	public NacimtoEmpleado getNacimtoEmpleado() {
		return nacimtoEmpleado;
	}

	public void setNacimtoEmpleado(NacimtoEmpleado nacimtoEmpleado) {
		this.nacimtoEmpleado = nacimtoEmpleado;
	}

	@ManyToOne
	@JoinColumn(name="CODVIVIEND")
	public TpVivienda getTpVivienda() {
		return tpVivienda;
	}

	public void setTpVivienda(TpVivienda tpVivienda) {
		this.tpVivienda = tpVivienda;
	}
	
	@Embedded
	public CaractFisca getCaractFisc() {
		return caractFisc;
	}

	public void setCaractFisc(CaractFisca caractFisc) {
		this.caractFisc = caractFisc;
	}

	@Embedded
	public HabitPersonal getHabits() {
		return habits;
	}

	public void setHabits(HabitPersonal habits) {
		this.habits = habits;
	}

	@Embedded
	public Empleo getEmpleo() {
		return empleo;
	}

	public void setEmpleo(Empleo empleo) {
		this.empleo = empleo;
	}	

	@Override
	public String toString() {
		return "EMPLEADO:"+id+" Contacto:"+contacto+" Caract:"+caractFisc+habits;
	}

}
