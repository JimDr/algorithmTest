package com.duanmin.algorithmTest;

import java.util.Stack;

/*
 * 
 * 2.编写一个类，用两个栈实现队列，支持队列基本操作add poll peek
 * 
 *  Realize a class ,use tow stack to complete one queue feature
 *  need funciton add poll peek
 *  
 * 
 * 
 * */

public class TwoStackAsQueue {

	private Stack<Integer> inputStack = new Stack<Integer>();
	private Stack<Integer> outputStack = new Stack<Integer>();
	
	public void add(Integer item){
		inputStack.push(item);
	}
	
	public Integer poll(){
		if(outputStack.isEmpty()){
			while(!inputStack.isEmpty()){
				Integer tmp = inputStack.pop();
				outputStack.push(tmp);
			}
		}
		return outputStack.pop();
	}
	
	public Integer peek(){
		if(outputStack.isEmpty()){
			while(!inputStack.isEmpty()){
				Integer tmp = inputStack.pop();
				outputStack.push(tmp);
			}
		}
		return outputStack.peek();
	}
}
