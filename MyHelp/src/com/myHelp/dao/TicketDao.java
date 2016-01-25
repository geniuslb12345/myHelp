package com.myHelp.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.transaction.annotation.Transactional;

import com.myHelp.entity.Ticket;
import com.myHelp.findbyid.findbyid;
import com.myHelp.inter.TicketServiceInter;

@Transactional
public class TicketDao implements TicketServiceInter {


	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addTicket(Ticket tkt) {
		// TODO Auto-generated method stub

		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(tkt);
		tx.commit();
		
	}

	
	public  List<Ticket> showTicket() {
		
			
		String hql="from Ticket";		
		Session s=this.sessionFactory.openSession();		
	    Query query=s.createQuery(hql);			    
	    Transaction tx=s.beginTransaction();
	    tx.commit();
	    System.out.println("ready to show ticket");	
	    
	    System.out.println(query.list());	
		return query.list();  
	}

	@Override
	public void updTicket(Class clazzz, Serializable id) {
		// TODO Auto-generated method stub

		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		s.delete(findbyid.findById (clazzz, id));		
		tx.commit();
		
	}

	@Override
	public void  delTicket(Class clazzz,Serializable id) {
		// TODO Auto-generated method stub
		
		try {
			Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			s.delete(findbyid.findById (clazzz, id));		
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
