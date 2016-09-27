package com.duanmin.algorithmTest;
/*
 * 
 * 仅用递归函数和栈操作逆序一个栈
 * just use Recursive reverse order a stack
 * 
 * */


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
	public int Multiplication(int num){
		return 0;
		
	}
}