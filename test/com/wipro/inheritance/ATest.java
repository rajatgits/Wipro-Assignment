package com.wipro.inheritance;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ATest {

	@Test
	void test() {
		A obj = new A();
	    assertEquals(5,obj.sum(2, 3));
	}

}
