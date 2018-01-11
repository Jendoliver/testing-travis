package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Printer;

public class PrinterTest 
{
	private static final String MSG = "Hello Travis!";
	
	@Test
	public void printTest()
	{
		assertEquals(MSG, Printer.print(MSG));
	}
}
