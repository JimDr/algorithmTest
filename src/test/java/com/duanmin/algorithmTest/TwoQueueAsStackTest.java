package com.duanmin.algorithmTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoQueueAsStackTest {
	
	@Test
	public void twoQueueAsStackTest(){
		TwoQueueAsStack twoQueTest = new TwoQueueAsStack();
		twoQueTest.push(12);
		twoQueTest.push(3);
		twoQueTest.push(20);
		twoQueTest.push(15);
		twoQueTest.push(1);
		twoQueTest.push(8);
		twoQueTest.push(21);
		Integer ret = 21;
		assertEquals(ret,twoQueTest.peek());
		assertEquals(ret,twoQueTest.pop());
		ret = 8;
		assertEquals(ret,twoQueTest.peek());
		assertEquals(ret,twoQueTest.pop());
		ret = 1;
		assertEquals(ret,twoQueTest.peek());
		assertEquals(ret,twoQueTest.pop());
	}
}
