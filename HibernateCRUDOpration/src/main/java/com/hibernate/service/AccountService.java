package com.hibernate.service;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.bean.Account;
import com.hibernate.dao.AccountDao;
import com.hibernate.util.SessionUtil;


public class AccountService {
	
   public static void main(String[] args) {
	
	   AccountDao dao=new AccountDao();
	   //create Account
	   //Account acc=new Account();
	    
	     Account acc=new Account();
	   acc.setAccno(144);
	  acc.setName("Vipin");
	   acc.setBalance(120000.00);
	  acc.setCreationDate( new Date());
	  dao.insert(acc); 
	   System.out.println("Successfully inserted to the database....");
	   //Retrive Account
		/*
		 * Account racc=dao.get(101); System.out.println("Account detailss.......");
		 * System.out.println("Name :"+racc.getName());
		 * System.out.println("Balance :"+racc.getBalance());
		 * System.out.println("Date :"+racc.getCreationDate());
		 */
	  //update Account
	   // Account uacc=new Account();
	    //uacc.setAccno(102);
	   // uacc.setName("Satendra");
	   // uacc.setBalance(123200.00);
	   // uacc.setCreationDate((java.sql.Date) new Date());
	   // dao.update(uacc);
	    //System.out.println("Updated Successfully..");
	    //delete Account
	    //dao.delete( 101);
	    //System.out.println("Deleted Successfully..");
}
}
