package com.neuedu.part07;
import java.util.Date;

public class Singleton {
	//构造方法私有化,单例模式
	private Singleton(){
	}
	private static Singleton instance=new Singleton();//饿汉式
	public static Singleton getInstance(){
		return instance;
	}
	/*
	private static Singleton instance=null();//饿汉式
	public static Singleton getInstance(){
	if(instance==null){
		instance=new Singleton;
		}
		return instance;
	
	}
	*/
	public Date getDate(){
		return new Date();
	}

}
class Lianxi{
	private Lianxi(){
		
	}
	private static Lianxi lianxi=new Lianxi();
	public static Lianxi getLianxi(){
		return lianxi;
	}
}