/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ij.model.answer;
import com.ij.model.question;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:15:09 am
 *DATE:01-Sep-2017
 *TAGS:
 */
public class javaPortal {

	
	public static void main(String[] args) {
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		answer a=new answer();
		a.setAns("java");
		answer b=new answer();
		b.setAns("php");
		question q=new question();
q.setQuest("what is language");
q.getListofans().add(a);
q.getListofans().add(b);
ses.getTransaction().begin();

ses.save(q);
ses.getTransaction().commit();
System.out.println("record inserted");

   
		
	}

}
