package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "COMPANY")

public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer ID;
	private String NAME;
	private Integer AGE;
	private Integer SALARY;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Integer getAGE() {
		return AGE;
	}
	public void setAGE(Integer aGE) {
		AGE = aGE;
	}
	public Integer getSALARY() {
		return SALARY;
	}
	public void setSALARY(Integer sALARY) {
		SALARY = sALARY;
	}
	@Override
	public String toString() {
		return "Company [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", SALARY=" + SALARY + "]";
	}

	
}
