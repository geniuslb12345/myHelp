package com.myHelp.findbyid;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.myHelp.entity.Ticket;

public class findbyid {

	private static SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public static Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub	
		System.out.println("clazzzzzzzz");
		Session s=sessionFactory.openSession();
		return s.get(clazz, id);		
	}
}