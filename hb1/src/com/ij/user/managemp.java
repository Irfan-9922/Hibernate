/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.user;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.mkyong.util.HibernateUtil;


/**
 * NAME:shaikh irfan
 *
 * DATE:4:55:45 pm
 *TIME:31-Aug-2017
 *TAGS:
 */
public class managemp {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		emp user = new emp();

		user.setId(100);
		user.setName("superman");
		
		session.save(user);
		session.getTransaction().commit();
	}


	}


