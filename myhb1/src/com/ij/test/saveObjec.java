/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ij.domain.employee;

/**
 * NAME:shaikh irfan
 *
 * DATE:6:06:34 pm
 *TIME:31-Aug-2017
 *TAGS:
 */
public class saveObjec {

	static Configuration cfg=null;
	static SessionFactory ssf=null;
	static Session s=null;
	// static employee e=null;
	static Transaction tx=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cfg=new Configuration();
		cfg=cfg.configure("/com/ij/cfg/hib.cfg.xml");
		ssf=cfg.buildSessionFactory();
		s=ssf.openSession();
		employee e=new employee();
		/*employee e=new employee();
		e.setNo(221);
		e.setFname("irfan");
		e.setLname("jalil");
		e.setEmail("irfan@gmail.com");*/
		e=(employee) s.get(employee.class, 1012);
		if(e!=null){
			System.out.println(e);
		}
		else{
			System.out.println("record not found");
		}
/*	try{
		tx=s.beginTransaction();
		tx.commit();
	}
	catch(Exception ee){
		tx.rollback();
		ee.printStackTrace();
	}
	System.out.println("object inserted");
	}
*/
}
}
