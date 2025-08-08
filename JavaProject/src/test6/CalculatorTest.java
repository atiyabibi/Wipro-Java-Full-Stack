package test6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2,3));
	}

	@Test
	public void testMultiply() {
		Calculator c=new Calculator();
		assertEquals(15,c.multiply(3, 5));
	}

	@Test
	public void testSubtract() {
		Calculator c=new Calculator();
		assertEquals(5,c.subtract(5,3));
	}

}
