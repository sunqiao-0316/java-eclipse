package com.neuedu.part10;

import java.util.LinkedList;
import java.util.Scanner;

public class Test012102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//请使用LinkedList来模拟一个队列(先进先出的特性):
        //拥有放入对象的方法void　put(Object　o)　
        //取出对象的方法Object　get()　
        //判断队列当中是否为空的方法boolean　isEmpty()；并且，编写测试代码，验证你的队列是否正确。
		MyQueue<String> myqueue=new MyQueue<>();
		myqueue.put("1");
		myqueue.put("2");
		myqueue.put("3");
		myqueue.put("4");
		while(!myqueue.isEmpty()){
			System.out.println(myqueue.get());
		}

	}
	
	

}
class MyQueue<T>{
	LinkedList<T> linkedList=new LinkedList<>();
	public MyQueue(){
		//LinkedList<T> linkedList=new LinkedList<>();
	}
	
	public void put(T t){
		linkedList.addLast(t);
	}
	public T get(){
		T first=linkedList.getFirst();
		linkedList.removeFirst();
		return first;
	}
	public boolean isEmpty(){
		return linkedList.isEmpty();
	}
	
}
