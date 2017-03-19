package tests;

import javax.xml.transform.TransformerFactory;

import org.testng.annotations.Test;

public class SecondTest {
	TransformerFactory fact = new net.sf.saxon.TransformerFactoryImpl();
	@Test
//conflict-1
//conflict-2
	public void testSecond()
	{
		System.out.println("hey");
	}

}
