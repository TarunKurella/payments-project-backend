package com.dbs.beans;
import javax.persistence.*;

@Entity(name="account")
public class Account {
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String customerID, String name, int clearBalance, String isOverdraft, String isBank) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.clearBalance = clearBalance;
		this.isOverdraft = isOverdraft;
		this.isBank = isBank;
	}
	@Id
	@Column(name="customerid")
	String customerID;
	String name;
	@Column(name="clearbalance")
	int clearBalance;
	@Column(name="isoverdraft")
	String isOverdraft;
	@Column(name="isbank")
	String isBank;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(int clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getIsOverdraft() {
		return isOverdraft;
	}
	public void setIsOverdraft(String isOverdraft) {
		this.isOverdraft = isOverdraft;
	}
	public String getIsBank() {
		return isBank;
	}
	public void setIsBank(String isBank) {
		this.isBank = isBank;
	}

}
