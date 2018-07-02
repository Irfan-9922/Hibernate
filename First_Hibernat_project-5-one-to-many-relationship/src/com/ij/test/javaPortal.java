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

	static SessionFactory factory=new Configuration().configure().buildSessionFactory();
static	Session ses=factory.openSession();
	public static void main(String[] args) {
   
		question question=new question();
	
		question.setQuestion("what is java");
		answer ans1=new answer();
		ans1.setListOfAnswer("object Oriantd");
		answer ans2=new answer();
		ans2.setListOfAnswer("multiTreded");
		
		answer ans3=new answer();
		/*List l=new ArrayList();
		l.add(ans1);
		l.add(ans2);
		l.add(ans3);*/
		ans3.setListOfAnswer("paltform Indipendent");
		//question.setAnswer(l);
		question.getAnswer().add(ans1);
		question.getAnswer().add(ans2);
		question.getAnswer().add(ans3);
		question question1=new question();
		
		question1.setQuestion("what is php");
		question1.getAnswer().add(ans1);
		question1.getAnswer().add(ans2);
		question1.getAnswer().add(ans3);
		
		try{
			ses=factory.openSession();
			ses.beginTransaction();
			
			ses.save(question);
			ses.save(question1);
			ses.save(ans1);
			ses.save(ans2);
			question=(com.ij.model.question) ses.get(question.class, 1);
			question1=(com.ij.model.question) ses.get(question.class, 2);
			System.out.println(question);
			System.out.println(question1);
			
			ses.getTransaction().commit();
			
			
		}
		catch(HibernateException h){
			ses.getTransaction().rollback();
		}
	}

}
