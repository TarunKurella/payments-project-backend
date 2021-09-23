package com.dbs.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="bank")
public class Bank {

	
	@Id
	@Column(name="bic")
	String BIC;
	@Column(name="institutename")
	String instituteName;
	public String getBIC() {
		return BIC;
	}
	public void setBIC(String bIC) {
		BIC = bIC;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public Bank(String bIC, String instituteName) {
		super();
		BIC = bIC;
		this.instituteName = instituteName;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
