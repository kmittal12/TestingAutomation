package tests;

import javax.xml.transform.TransformerFactory;

import org.testng.annotations.Test;

public class SecondTest {
	TransformerFactory fact = new net.sf.saxon.TransformerFactoryImpl();
	@Test
	public void testSecond()
	{
		System.out.println("hey");
	}

}
