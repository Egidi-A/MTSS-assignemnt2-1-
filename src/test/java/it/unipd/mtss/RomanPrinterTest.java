package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

	@Test
	public void testStampaI() throws InputNumberException{
		//Arrange
		String Expected = "  _____ \r\n"
		+ " |_   _|\r\n"
		+ "   | |  \r\n"
		+ "   | |  \r\n"
		+ "  _| |_ \r\n"
		+ " |_____|\n";
		//Act
		String actual = RomanPrinter.print(1);
		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaV() throws InputNumberException {
		//Arrange
		String Expected = " __      __\r\n"
		+ " \\ \\    / /\r\n"
		+ "  \\ \\  / / \r\n"
		+ "   \\ \\/ /  \r\n"
		+ "    \\  /   \r\n"
		+ "     \\/    \n" ;
		//Act
		String actual = RomanPrinter.print(5);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaX() throws InputNumberException {
		//Arrange
		String Expected = "__   __\r\n"
		+ " \\ \\ / /\r\n"
		+ "  \\ V / \r\n"
		+ "   > <  \r\n"
		+ "  / . \\ \r\n"
		+ " /_/ \\_\\\r\n"
		+ "        \n" ;

		//Act
		String actual = RomanPrinter.print(10);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaD() throws InputNumberException {
		//Arrange
		String Expected = "  _____  \r\n"
		+ " |  __ \\ \r\n"
		+ " | |  | |\r\n"
		+ " | |  | |\r\n"
		+ " | |__| |\r\n"
		+ " |_____/ \r\n"
		+ "         \n" ;

		//Act
		String actual = RomanPrinter.print(500);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaM() throws InputNumberException {
		//Arrange
		String Expected = "  __  __ \r\n"
		+ " |  \\/  |\r\n"
		+ " | \\  / |\r\n"
		+ " | |\\/| |\r\n"
		+ " | |  | |\r\n"
		+ " |_|  |_|\r\n"
		+ "         \n" ;

		//Act
		String actual = RomanPrinter.print(1000);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaL() throws InputNumberException {
		//Arrange
		String Expected = "  _      \r\n"
		+ " | |     \r\n"
		+ " | |     \r\n"
		+ " | |     \r\n"
		+ " | |____ \r\n"
		+ " |______|\r\n"
		+ "         \n" ;

		//Act
		String actual = RomanPrinter.print(50);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampaC() throws InputNumberException {
		//Arrange
		String Expected = "   _____ \r\n"
		+ "  / ____|\r\n"
		+ " | |     \r\n"
		+ " | |     \r\n"
		+ " | |____ \r\n"
		+ "  \\_____|\n" ;

		//Act
		String actual = RomanPrinter.print(100);

		//Assert
		assertEquals(Expected,actual);
	}
	@Test
	public void testStampa2() throws InputNumberException {
		//Arrange
		String Expected = "  _____ \r\n"
		+ " |_   _|\r\n"
		+ "   | |  \r\n"
		+ "   | |  \r\n"
		+ "  _| |_ \r\n"
		+ " |_____|\n"
		+ "  _____ \r\n"
		+ " |_   _|\r\n"
		+ "   | |  \r\n"
		+ "   | |  \r\n"
		+ "  _| |_ \r\n"
		+ " |_____|\n" ;

		//Act
		String actual = RomanPrinter.print(2);

		//Assert
		assertEquals(Expected,actual);
		
		
		
	}
	
}
