package com.duanmin.algorithmTest;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueAsStack {
	
	private Queue<Integer> firstQueue = new LinkedList<Integer>();
	private Queue<Integer> secondQueue = new LinkedList<Integer>();
	
	public void push(Integer item){
		if(firstQueue.isEmpty()){
			secondQueue.offer(item);
		}
		else{
			firstQueue.offer(item);
		}
	}
	
	public Integer pop(){
		if(firstQueue.isEmpty()&& secondQueue.isEmpty()){
			return null;
		}
		if(!firstQueue.isEmpty()){
			swapTwoQueue(secondQueue,firstQueue);
			return firstQueue.poll();
		}else{
			swapTwoQueue(firstQueue,secondQueue);
			return secondQueue.poll();
		}

	}
		
	
	public Integer peek(){
		if(firstQueue.isEmpty()&& secondQueue.isEmpty()){
			return null;
		}
		Integer ret = 0;
		if(!firstQueue.isEmpty()){
			swapTwoQueue(secondQueue,firstQueue);
			ret = firstQueue.poll();
			secondQueue.offer(ret);
			return ret;
		}else{
			swapTwoQueue(firstQueue,secondQueue);
			ret = secondQueue.poll();
			firstQueue.offer(ret);
			return ret;
		}
	}
	
	private void swapTwoQueue(Queue<Integer> dst,Queue<Integer> src){
		while(src.size()!=1){
			dst.offer(src.poll());
		}
	}
	
	
		
}
