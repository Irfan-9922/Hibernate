/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ij.model.student;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:12:11 am
 *TIME:01-Sep-2017
 *TAGS:
 */
public class test {

	static SessionFactory factory=null;
	static Session session=null;
	Transaction tx=null;
	static student st=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   factory=new Configuration().configure().buildSessionFactory();
	   session=factory.openSession();
	   st=new student();
	  
	  
	 st.setName("irfan");
	
	  
	   try{
		   session.beginTransaction();
		   session.save(st);
		   session.getTransaction().commit();
		  st= (student) session.get(student.class, 1);
		   System.out.println(st);
		   
	   }
	   catch(HibernateException e){
		   session.getTransaction().rollback();
	   }
	   finally{
		   session.close();
		   factory.close();
	   }
	   System.out.println("record is enterd sucessfully");
	   
		

	}

}
