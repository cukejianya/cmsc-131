import static org.junit.Assert.*;
import org.junit.Test;

public class TestingExample {
	
	@Test
	public void testWillFail() {
		StringHolder s1 = new StringHolder("Hi");		
		s1.addOn("Bye");
		StringHolder s2 = new StringHolder(s1);
		
		System.out.println("***" +  s1 + "***" + s2 + "***");
		assertTrue(s1.equals(s2));
		
		s1.addOn("Word");
		System.out.println("***" +  s1 + "***" + s2 + "***");
		assertFalse(s1.gettextValue1().equals(s2.gettextValue1()));
		assertFalse(s1.gettextValue2().equals(s2.gettextValue2()));
		assertFalse(s1.getnumberValue() == (s2.getnumberValue()));
	}

}
