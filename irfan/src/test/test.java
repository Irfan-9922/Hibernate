/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.BoyDetails;
import model.girlfirends;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:58:22 pm
 *DATE:08-Sep-2017
 *TAGS:
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		SessionFactory factory=null;
		Session ses=null;
		
			girlfirends girls1=new girlfirends();
			
			girls1.setGname("samrin");
			girls1.setAge("18");
			girls1.setIsbeautifull("looking grourgous");
			girls1.setOtherBoyFriends("no");
			
			girlfirends girls2=new girlfirends();
			girls2.setAge("19");
			girls2.setGname("bushi");
			
			girls2.setIsbeautifull("lokking good");
			
			girls2.setOtherBoyFriends("no");
			
			BoyDetails details=new BoyDetails();
			details.setEducation("mca");
			details.setLook("looks nice");
			details.setName("irfan");
			details.setPhno("009");
			details.setProperty1("1000 cr");
			details.getListOfgirlfirends().add(girls1);
			details.getListOfgirlfirends().add(girls2);
			factory=new Configuration().configure().buildSessionFactory();
			ses=factory.openSession();
			ses.getTransaction().begin();
			//main object put first in the order to solve null pointer exception
			ses.save(details);
			ses.save(girls1);
			ses.save(girls2);
		
			details=(BoyDetails) ses.get(BoyDetails.class, 1);
		
			ses.getTransaction().commit();
			
			System.out.println("=========================================");
			System.out.println(details);
			System.out.println("=========================================");
		
		
		System.out.println("recorf=d is enterd into table");
	}

}
