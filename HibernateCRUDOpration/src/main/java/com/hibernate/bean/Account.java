package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="account")
public class Account {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="ACCNO",length=10)
     private long accno;
	@Column(name="NAME", length=20,nullable = false)
     private String name;
	@Column(name="BAL",precision=8,scale=2,nullable = false)
     private double balance;
	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DT", nullable=false)
     private Date creationDate;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreationDate() {
		return creationDate;
	}

	/*
	 * public void setCreationDate(Date date) { this.creationDate = date; }
	 */
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", creationDate=" + creationDate
				+ "]";
	}
	public void setCreationDate(java.util.Date date) {
		
		this.creationDate = date;
	}
	
	
     
     
     
}
