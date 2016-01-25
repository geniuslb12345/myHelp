import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.myHelp.entity.Ticket;

public class ticket_entity_class_test {

	
	@Test
	public void test_Ticket_creator_name() {
		Ticket tkt;
		tkt=new Ticket();
		
		tkt.setTicket_creator_name("boboliu");
		String result = tkt.getTicket_creator_name();
		assertEquals("boboliu", result);
	}

	@Test
	public void test_Ticket_title() {
		Ticket tkt;
		tkt=new Ticket();
		
		tkt.setTicket_title("computer");
		String result = tkt.getTicket_title();
		assertEquals("computer", result);
	}

	@Test
	public void test_Ticket_problem_description() {
		Ticket tkt;
		tkt=new Ticket();
		
		tkt.setTicket_problem_description("nopower");
		String result = tkt.getTicket_problem_description();
		assertEquals("nopower", result);
	}

	@Test
	public void test_Ticket_status() {
		Ticket tkt;
		tkt=new Ticket();
		
		tkt.setTicket_status(1);
		int result = tkt.getTicket_status();
		assertEquals(1, result);
	}

	@Test
	public void test_Ticket_priority() {
		Ticket tkt;
		tkt=new Ticket();
		
		tkt.setTicket_priority(2);
		int result = tkt.getTicket_priority();
		assertEquals(2, result);
	}
	
	
	
	
	
}
