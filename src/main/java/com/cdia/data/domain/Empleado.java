package com.cdia.data.domain;

import java.util.Date;

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
	private String apells;
	private String email;
	private int numPersCarg;	
	private int numHjos;	
	private Pais paisNac;	
	private Departamento deptoNac;	
	private Ciudad ciudadNac;
	private TpVivienda tpVivienda;
	private CaractFisca caractFisc;
	private HabitPersonal habits;	
	//private ExpLaboral expLaboral;
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
	
	@Column(name="CEDULA",nullable=false)
	@Override
	public String getDoc() {
		return doc;
	}

	@Column(name="TIPODCTO",nullable=false)
	@Override
	public Long getTpDoc() {
		return tpDoc;
	}

	@Column(name="CCEXPED")
	@Override
	public String getCiudadExpDoc() {
		return ciudadExpDoc;
	}

	@Column(name="FECNAC")	
	@Override
	public Date getFchNac() {
		return fchNac;
	}
	
	@Column(name="EDOCIV")
	@Override
	public char getEstadCiv() {
		return estadCiv;
	}
	
	@Column(name="NOMBRE")
	@Override
	public String getNombrs() {
		return nombrs;
	}	

	@Column(name="TELEFONO")
	@Override
	public String getTel() {
		return tel;
	}

	@Column(name="CELULAR")
	@Override
	public String getCel() {
		return cel;
	}
	
	@Column(name="DIRECCION")
	@Override
	public String getDirec() {
		return direc;
	}
	
	@ManyToOne
	@JoinColumn(name="CODPAISRES")
	@Override
	public Pais getPaisResid() {
		return PaisResid;
	}

	@ManyToOne
	@JoinColumn(name="CODDPTORES")
	@Override
	public Departamento getDeptoResid() {
		return deptoResid;
	}

	@ManyToOne
	@JoinColumn(name="CODCIUDRES")
	@Override
	public Ciudad getCiudadResid() {
		return ciudadResid;
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

	@ManyToOne
	@JoinColumn(name="CODPAISNAC")
	public Pais getPaisNac() {
		return paisNac;
	}

	public void setPaisNac(Pais paisNac) {
		this.paisNac = paisNac;
	}

	@ManyToOne
	@JoinColumn(name="CODDPTONAC")
	public Departamento getDeptoNac() {
		return deptoNac;
	}
	
	public void setDeptoNac(Departamento deptoNac) {
		this.deptoNac = deptoNac;
	}

	@ManyToOne
	@JoinColumn(name="CODCIUDNAC")
	public Ciudad getCiudadNac() {
		return ciudadNac;
	}
	
	public void setCiudadNac(Ciudad ciudadNac) {
		this.ciudadNac = ciudadNac;
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
	
//	@Embedded
//	public ExpLaboral getExpLaboral() {
//		return expLaboral;
//	}
//
//	public void setExpLaboral(ExpLaboral expLaboral) {
//		this.expLaboral = expLaboral;
//	}

	@Embedded
	public Empleo getEmpleo() {
		return empleo;
	}

	public void setEmpleo(Empleo empleo) {
		this.empleo = empleo;
	}	

	@Override
	public String toString() {
		return "EMPLEADO:"+id+" CARCT:"+caractFisc+habits;
	}

}
