package JUnit;

import static org.junit.Assert.*;
import StringProject.StringManagement; 

import org.junit.Test;
import org.junit.Before; 

public class StringTest 
{
	StringManagement management; 
	
	@Before
	public void setUp ()
	{
		management = new StringManagement(); 
	}
	
	@Test
	public void duzinaStringaTest ()
	{
		int rezultat = management.duzinaStringa("vedran");
		assertEquals(6, rezultat, 0.1);
	}

	@Test
	public void brojUppercaseKarakteraTest ()
	{
		int rezultat = management.brojUpperKaraktera("VeDrAn");
		assertEquals(3, rezultat);
	}
	
	@Test
	public void brojLowercaseKarakteraTest ()
	{
		int rezultat = management.brojLowerKaraktera("Vedran");
		assertEquals(5, rezultat);
	}
}
