import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.myHelp.inter.TicketServiceInter;

public class showTicketTest  extends TestCase{

	private TicketServiceInter ticketMock;	
	List ticketlist = Arrays.asList(1,"liubobo","title","description",1,"2016-01-01",2);

	@Before
	public void setUp() throws Exception {				
		ticketMock = EasyMock.createMock(TicketServiceInter.class);
	}

	@Test
	public void testHandleHttpServletRequestHttpServletResponseObjectBindException() {		
		EasyMock.expect(ticketMock.showTicket()).andReturn(ticketlist);		
		EasyMock.replay(ticketMock);
		assertEquals(ticketlist, ticketMock.showTicket() );		
		
		
//	EasyMock.expect(abc.someMethod).andReturn(answer), you recorded the expected behaviour. 
//  But, when you write EasyMock.replay(abc) , you are actually activating it.
		
	}

	
	@After  
    public void cleanup()   
    {        
		ticketMock=null;  
   } 
}
