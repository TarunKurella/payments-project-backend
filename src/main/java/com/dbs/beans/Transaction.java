package com.dbs.beans;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transaction")
public class Transaction {

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int id, Date transDateTime, String fromAccount, int amount, String toAccount, String toName,
			String bic, String mssgCode) {
		super();
		this.id = id;
		this.transDateTime = transDateTime;
		this.fromAccount = fromAccount;
		this.amount = amount;
		this.toAccount = toAccount;
		this.toName = toName;
		this.bic = bic;
		this.mssgCode = mssgCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTransDateTime() {
		return transDateTime;
	}
	public void setTransDateTime(Date transDateTime) {
		this.transDateTime = transDateTime;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getMssgCode() {
		return mssgCode;
	}
	public void setMssgCode(String mssgCode) {
		this.mssgCode = mssgCode;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="transdatetime")
	Date  transDateTime;
	@Column(name="fromaccount")
	String fromAccount;
	@Column(name="amount")
	int amount;
	@Column(name="toaccount")
	String toAccount;
	@Column(name="toname")
	String toName;
	@Column(name="bic")
	String bic;
	@Column(name="mssgcode")
	String mssgCode;

}
