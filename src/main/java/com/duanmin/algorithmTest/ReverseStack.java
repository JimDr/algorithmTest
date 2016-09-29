package com.duanmin.algorithmTest;
/*
 * 
 * 仅用递归函数和栈操作逆序一个栈
 * just use Recursive reverse order a stack
 * 
 * */

import java.util.Stack;

//first ,test recursive
public class ReverseStack {
	
	///计算1+2+3+4+。。。+n，传入n
	public int add(int num){
		if(num==1){
			return 1;
		}else{
			return num+add(num-1);
		}		
		
	}	
	///计算 1*2*3*4*。。。*n，传入n
	public int multiplication(int num){
		if((num==1)||(num==2)){
			return num;
		}else{
			return num*multiplication(num-1);
		}
		
		//return 0;
		
	}
	
	
	/*计算 1*2*3*4*。。。*n，传入n
	 * 
	 * 计算n!通过（n-1）!加n次的办法
	 * 
	 * 
	 * 
	 */
	public int multiplicationWithAdd(int num){
			int i = 0;
			int ret = 0;
			int total = 0;
			if(num == 1){
				return 1;
			}
			ret = multiplicationWithAdd(num-1);
			for(i=num;i>0;i--){
				total=total+ret;				
			}
			System.out.println(total);
			return total;
		}
		
	
		//return 0;
	public void showNum(int num){
		int i = 0;
		for(i=1;i<=num;i++){
			System.out.print(i);
			if(i==num){
				break;
			}else{
				System.out.print("*");
			}		
		}
		System.out.print("=");
	}
	public void run(int num){
		//showNum(num);
		int ret = multiplicationWithAdd(num);
		System.out.println("ret = "+ret);
		System.out.println("==========================");
		
	}
	
	
	public Integer getBottomNumber(Stack<Integer> basicStack){
		Integer ret = 0;
		Integer last = 0;
		ret = basicStack.pop();
		if(basicStack.isEmpty()){
			return ret;
		}else{
			last = getBottomNumber(basicStack);
			basicStack.push(ret);
			return last;
		}
		
	}
	
	public void reversed(Stack<Integer> basicStack){
		Integer bottomNumber = 0;	
		bottomNumber = getBottomNumber(basicStack);
		if(basicStack.isEmpty()){
			basicStack.push(bottomNumber);
			return;
		}else{
			reversed(basicStack);
			basicStack.push(bottomNumber);
			return;
		}
		
	}
	
	
	
	
	
	
	
}