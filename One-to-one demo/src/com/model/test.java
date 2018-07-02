/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:13:30 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		adress a=new adress();
		a.setCity("latur");
		a.setCountery("india");
		student s=new student();
		s.setName("irfan");
		s.setAdress1(a);
		ses.getTransaction().begin();
		
		ses.save(s);
		ses.save(a);
		
	
		ses.getTransaction().commit();
		s=	(student) ses.get(student.class, 1);
		System.out.println(s);
			
	}

}
