/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ij.model.student;

/**
 * NAME:shaikh irfan
 *
 * DATE:12:19:44 am
 *TIME:01-Sep-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st=new student();
	
		st.setName("first");
		student st1=new student();
		
		st1.setName("second");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		ses.beginTransaction();
		ses.save(st);
		ses.save(st1);
		ses.getTransaction().commit();
		System.out.println("record is inserted");
		ses.close();
		
		//ses.get(student.class, arg1)

		
	}

}