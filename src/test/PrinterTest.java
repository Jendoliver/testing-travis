package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.Printer;

public class PrinterTest 
{
	private static final String MSG = "Hello Travis!";
	
	@Test
	public void printTest()
	{
		assertEquals("Maricon", Printer.print(MSG));
	}
}
