package demo02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum2Number() {
		assertEquals(6, sum(2, 4));
	}
	

	@Test
	public void testSumWithZero() {
		assertEquals(4, sum(0, 4));
		assertEquals(4, sum(4, 0));
	}


	@Test
	public void testSumWithNegativos() {
		assertEquals(10, sum(12, -2));
		assertEquals(-7, sum(-4, -3));
	}

	
	int sum(int a, int b) {
		return Sum.sum(a,  b);
	}

	
	@Test
	public void suma3Numeros() {
		assertEquals(16, Sum.sum(4, 5, 7));
		
	}

}
