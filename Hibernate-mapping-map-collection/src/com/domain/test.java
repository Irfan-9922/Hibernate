/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.domain;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:2:27:55 am
 *DATE:09-Sep-2017
 *TAGS:
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		
		
		Map<String,String> l=new HashMap<>();

		l.put("irfan", "java");
		l.put("nisar", "java");
		l.put("sahsi", "java");
		

		question q=new question(1, "nisar", "what is java", l);
		question q1=new question(2, "nisar", "what is java", l);
		try{
			
	
		ses.getTransaction().begin();
	ses.persist(q);
		ses.persist(q1);
	
		ses.getTransaction().commit();
		ses.flush();
		q=(question) ses.get(question.class, 1);
		System.out.println(q);
		}
		catch(HibernateException e){
			ses.getTransaction().rollback();
			System.out.println("roobak");
		}
		finally{
			ses.close();
			System.out.println("in finally");
			
		}
	
	System.out.println("recor d is inserted");
		
	}

}
