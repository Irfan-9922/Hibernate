/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ij.model.Question;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:14:03 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
public class test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
SessionFactory factory=new Configuration().configure().buildSessionFactory();
Session ses=factory.openSession();
		
		
		Map<String,String> ans=new HashMap();
		ans.put("java is object orinted language", "by Irfan");
		ans.put("opensource", "by nisar");

		Map<String,String> ans1=new HashMap();
		ans.put("php is object orinted language", "by shivam");
		ans.put("commarsial", "by mahesh");
		Question  s=new Question();
		s.setQuestion("what is java");
		s.setAnswer(ans);
		ses.getTransaction().begin();
		ses.save(s);
		ses.save(ans);
		ses.save(ans1);
		ses.getTransaction().commit();
	//	System.out.println("record is inserted"+s.getQid());
		
	}

}
