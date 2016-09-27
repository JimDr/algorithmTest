package com.duanmin.algorithmTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoStackAsQueueTest {

	@Test
	public void twoStackAsQueueTest(){
		TwoStackAsQueue myTest = new TwoStackAsQueue();
		myTest.add(2);
		myTest.add(9);
		myTest.add(14);
		myTest.add(1);
		myTest.add(30);
		myTest.add(16);
		myTest.add(10);
		myTest.add(21);
		
		Integer ret = 2;
		assertEquals(ret,myTest.peek());
		assertEquals(ret,myTest.poll());
		ret = 9;
		assertEquals(ret,myTest.poll());
		ret = 14;
		assertEquals(ret,myTest.peek());
		assertEquals(ret,myTest.poll());
		ret = 1;
		assertEquals(ret,myTest.peek());
		assertEquals(ret,myTest.poll());
	}
}
