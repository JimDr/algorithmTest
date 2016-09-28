package com.duanmin.algorithmTest;

import org.junit.Test;

public class ReverseStackTest {
	ReverseStack mytest = new ReverseStack();
	//@Test
	public void reverseStackTest(){
		System.out.println(mytest.add(5));
		
	}
	
	@Test
	public void MultiplicationTest(){
		System.out.println(mytest.multiplication(7));
		
	}
	
	@Test
	public void multiplicationWithAddTest(){
		mytest.run(7);
	}
}
