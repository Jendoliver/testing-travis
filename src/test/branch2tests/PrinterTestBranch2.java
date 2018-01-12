package branch2tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrinterTestBranch2 
{
	@Test
	public void failedTest() throws Exception
	{
		assertEquals("Me puedes mostrar algun mensaje hijo de puta?", "SORRYMAN", "GONNAFAILT");
	}
	
	@Test
	public void chickyTest() throws Exception
	{
		assertEquals("Sick", "NOICE", "NOICE");
	}
}
