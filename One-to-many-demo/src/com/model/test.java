/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:33:01 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		
		girlfriends g1=new girlfriends();
		g1.setAge(12);
		g1.setName("bushara");
		
		girlfriends g2=new girlfriends();
		g2.setAge(11);
		g2.setName("didi 1");
		
		girlfriends g3=new girlfriends();
		g3.setAge(12);
		g3.setName("didi 2");
		
		girlfriends g4=new girlfriends();
		g4.setAge(13);
		g4.setName("rashi");
		
		student s=new student();
		
		s.setName("irfan");
		s.getListofgrilfrends().add(g1);
		s.getListofgrilfrends().add(g2);
		s.getListofgrilfrends().add(g3);
		s.getListofgrilfrends().add(g4);
		ses.getTransaction().begin();
		ses.persist(s);
		ses.persist(g1);
		ses.persist(g2);
		ses.persist(g3);
		ses.persist(g4);
		ses.getTransaction().commit(); 
		s=(student) ses.get(student.class, 1);
		System.out.println(s);
		
		
		
		
		
	}

}
