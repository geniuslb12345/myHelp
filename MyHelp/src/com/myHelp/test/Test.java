package com.myHelp.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.myHelp.dao.*;
import com.myHelp.entity.*;
import com.myHelp.inter.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lt;
		 
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    //TestService ts=(TestService) ac.getBean("testService");
		//System.out.println(ts.getName());
		
		//SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
		
		//Session s=sf.openSession();
		
		TicketServiceInter ticketservicedao=(TicketServiceInter) ac.getBean("ticketService");
				
		//Ticket ticket=new Ticket(1,"Liu","monitor","broken",1,  new java.util.Date(), 2 );
		
		//ticketservicedao.addTicket(ticket);
		
		lt=ticketservicedao.showTicket();
		
		System.out.println(lt);
	}

	

}
