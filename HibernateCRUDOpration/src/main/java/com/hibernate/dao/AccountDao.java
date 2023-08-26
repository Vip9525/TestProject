package com.hibernate.dao;

import org.hibernate.Session;

import com.hibernate.bean.Account;
import com.hibernate.util.SessionUtil;

public class AccountDao {
    public Account get(long accno)
    {
    	Session session=null;
    	Account account=null;
    	try {
    	     session=SessionUtil.getSession();
    	      account=(Account)session.get(Account.class,accno);
    	}
    	catch(Exception exp)
    	{
    		 exp.printStackTrace(); 
    	}
    	finally {
    		SessionUtil.closeSession(session);
    	}
    	return account;
    	
    }
    
    public void insert(Account account)
    {
    	Session session=null;
        //session start
    	try {
    		session= SessionUtil.getSession();
    		session.getTransaction().begin();
    		session.save(account);
    		session.getTransaction().commit();
    	}
    	catch(Exception exp)
    	{    session.getTransaction().rollback();
    		exp.printStackTrace();
    	}
    	finally {
    		SessionUtil.closeSession(session);
    	}
    	
    	
    }
    public void update(Account account)
    { 
    	Session session=null;
    	try {
    		  session=SessionUtil.getSession();
    		  session.getTransaction().begin();
    		    session.update(account);
    		    session.getTransaction().commit();
    		    
    	}
    	catch(Exception exp)
    	{
    		session.getTransaction().rollback();
    	}
    	finally {
    		SessionUtil.closeSession(session);
    	}
    	
    }
    public void delete(long accno)
    {
    	Session session=null;
            try {
            	session=SessionUtil.getSession();
            	session.getTransaction().begin();
            	       Account account=session.get(Account.class,accno);
            	session.delete(account);
            	session.getTransaction().commit();
            }  
            catch(Exception exp)
            { session.getTransaction().rollback();
            exp.printStackTrace();
            	
            }
            finally {
            	SessionUtil.closeSession(session);
            }
    }
    
}
