/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.domain.employe;

/**
 * NAME:shaikh irfan
 *
 * DATE:7:10:19 pm
 *TIME:31-Aug-2017
 *TAGS:
 */
public class test {

	static Configuration cfg=null;
	static SessionFactory factory=null;
	static Session ses=null;
	employe e=new employe();
	static org.hibernate.Transaction tx=null;
	public void insert1(){
		
		e.setNo(9);
		e.setFname("nisar");
		e.setLname("jalil");
		e.setEmail("sir@gml.com");
		try{
			tx=ses.beginTransaction();
			ses.persist(e);
			tx.commit();
			System.out.println(e);
		}
		catch(Exception d)
		{
			tx.rollback();
		}
		System.out.println("record is inserted");
		}//end of method
	
	public void show(){
		e=(employe) ses.get(employe.class, 9);
		System.out.println(e);
		return;
		
	}
	public void update1(){
		e=(employe) ses.get(employe.class, 9);
		
		try{
			tx=ses.beginTransaction();
			e.setEmail("jim@");
			tx.commit();
			System.out.println(e);
			
			 
			
		}
		catch(Exception ee){
			tx.rollback();
		}
		System.out.println("record is updated");
		
		
	}
	public void del(){
		e=(employe) ses.get(employe.class, 9);
		tx=ses.beginTransaction();
		ses.delete(e);
		tx.commit();
		System.out.println("record is deleted");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cfg=new Configuration();
		cfg=cfg.configure("/com/ij/hbconfg.hbm.xml");
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		test t=new test();
		//t.insert1();
		t.del();
		
		
		}
		
	}


