package com.duanmin.algorithmTest;
/*
 * 1.实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 *	pop push getmin操作的时间复杂度都是O(1).....
 *
 * make a special Integer stack,as same as basic stack
 * need function pop push getMin,the time complexity of the three functions is O(1)
 * 
 * */
import java.util.Stack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpecialStack {

	private Logger localLoger = LogManager.getLogger("localLog");
	
	private Stack<Integer> minStack = new Stack<Integer>();
	private Stack<Integer> baseStack = new Stack<Integer>();
	
	
	public Integer pop(){
		Integer ret = baseStack.pop();
		if(ret == minStack.peek()){
			minStack.pop();
		}
		return ret;
	}
	
	public void push(Integer item){
		baseStack.push(item);
		if(minStack.isEmpty()){
			minStack.push(item);
		}
		else{
			Integer curMin = minStack.peek();
			if(curMin >= item){
				minStack.push(item);
			}
		}
	}
	
	public Integer getMin(){
		return minStack.peek();
	}
}
