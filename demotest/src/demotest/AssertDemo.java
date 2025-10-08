package demotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertDemo {
	@Test
	public void testasserttrue() {
		assertTrue("Hello".contains("e"));
	}
	@Test
	public void testassertequal()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	@Test
	public void testassertnull()
	{
		String s=null;
		assertNull(s);
	}
}
