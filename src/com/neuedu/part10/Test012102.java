package com.neuedu.part10;

import java.util.LinkedList;
import java.util.Scanner;

public class Test012102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʹ��LinkedList��ģ��һ������(�Ƚ��ȳ�������):
        //ӵ�з������ķ���void��put(Object��o)��
        //ȡ������ķ���Object��get()��
        //�ж϶��е����Ƿ�Ϊ�յķ���boolean��isEmpty()�����ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ��
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
