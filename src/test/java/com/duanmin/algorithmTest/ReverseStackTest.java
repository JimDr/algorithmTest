package com.duanmin.algorithmTest;

import java.util.Stack;

import org.junit.Test;

public class ReverseStackTest {
	ReverseStack mytest = new ReverseStack();
	//@Test
	public void reverseStackTest(){
		System.out.println(mytest.add(5));
		
	}
	
	//@Test
	public void MultiplicationTest(){
		System.out.println(mytest.multiplication(7));
		
	}
	
	@Test
	public void multiplicationWithAddTest(){
		Stack<Integer> basicStack = new Stack<Integer>();
		basicStack.push(1);
		basicStack.push(2);
		basicStack.push(3);
		basicStack.push(4);
		basicStack.push(5);
		mytest.reversed(basicStack);
		while(!basicStack.isEmpty()){
			System.out.println(basicStack.pop());
		}
	}
}
