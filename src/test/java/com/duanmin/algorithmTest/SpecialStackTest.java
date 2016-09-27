package com.duanmin.algorithmTest;


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SpecialStackTest {

	@Test
    public void specialStackTest(){
		SpecialStack myTestStack = new SpecialStack();
		myTestStack.push(12);
		myTestStack.push(13);
		myTestStack.push(20);
		myTestStack.push(18);
		myTestStack.push(9);
		myTestStack.push(9);
		myTestStack.push(30);
		myTestStack.push(15);
		myTestStack.push(4);
		
		Integer ret = 4;
		assertEquals(ret,myTestStack.getMin());
		assertEquals(ret,myTestStack.pop());
		ret = 15;
		assertEquals(ret,myTestStack.pop());
		ret = 9;
		assertEquals(ret,myTestStack.getMin());	
		myTestStack.pop();
		myTestStack.pop();
		assertEquals(ret,myTestStack.getMin());
    }


}
