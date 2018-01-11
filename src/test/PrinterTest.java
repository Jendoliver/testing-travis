package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Printer;

class PrinterTest 
{
	private static final String MSG = "Hello Travis!";
	@Test
	void printTest()
	{
		assertEquals(MSG, Printer.print(MSG));
	}
}
