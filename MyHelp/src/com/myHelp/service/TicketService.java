package com.myHelp.service;
import java.io.Serializable;
import java.util.List;
import com.myHelp.dao.TicketDao;
import com.myHelp.entity.Ticket;

public class TicketService {

	public TicketDao ticketdao;
	
	
	 public void addTicket(Ticket tkt){		 
		 ticketdao.addTicket(tkt);
	 }
	 
	 public List<Ticket> showTicket(){		 
		 ticketdao.showTicket();
		 return null;
	 }
	 
	 public void updTicket(Serializable id) {
		 ticketdao.updTicket(Ticket.class,id);
	 }
	 
	 public void delTicket(Serializable id) {
		 ticketdao.delTicket(Ticket.class,id);
	 }
}
