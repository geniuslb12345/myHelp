package com.myHelp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.myHelp.entity.Ticket;
import com.myHelp.inter.*;
import com.myHelp.service.*;

public class TicketController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object commond, BindException exception)
			throws Exception {
		// TODO Auto-generated method stub
		
		Ticket  ticket=(Ticket) commond;
		System.out.println(ticket);
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
		TicketServiceInter ticketservice=(TicketServiceInter) ac.getBean("ticketService");
        ticketservice.addTicket(ticket);
		//ticketservice.addTicket(ticket);
		
		return new ModelAndView("success");
		
		
		
		
		
		
		
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),true));
		
		
	}


	
}
