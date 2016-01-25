package com.myHelp.inter;

import java.io.Serializable;
import java.util.List;
import com.myHelp.entity.*;

public interface TicketServiceInter {

	public void addTicket(Ticket tkt);
	public List<Ticket> showTicket();
	public void updTicket(Class clazzz, java.io.Serializable id);
	
	public void delTicket(Class clazzz, java.io.Serializable id);
	
}


