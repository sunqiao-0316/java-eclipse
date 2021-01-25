package com.neuedu.part09;

import java.util.UUID;

/**
 * 1.java 常用API
 * java.awt java绘制图形工具
 * java.IO java跟磁盘文件操作
 * java.lang java基础类
 * java.net 网络通信，基于TCP/IP协议 面试：1.了解http/https区别 2.TCP/IP协议特点
 * java.sql 与关系型数据库交互的工具类
 * java.util java常用工具类
 * 2.object 所有类的父类
 * 输出一个对象时，默认会调用他的toString方法
 * 常用的3个toString(),equals(),hashCode()
 * 3.包装类
 * 为了让基本数据类型也能具备面向对象的特性（继承封装多态）提供了包装类的概念
 * 类继承comparable接口，实现里面的comparable方法，可以作为对象比较工具，返回值int
 * 基本类型和包装类的转换
 * 对应关系下，基本数据类型转换为包装类，通过new对象
 * 包装类转换为基本数据类型，通过引用.基本数据类型Value()方法
 * 还含有自动装箱自动拆箱的概念
 * 字符串和包装类转换:包装类转字符串，调用对应的toString方法
 *              字符串转包装类,都可以通过包装器构造类转换，或者包装类.ValueOf(需要转换的字符串)
 * 字符串和基本数据类型转换：字符串转基本通过对应的包装类调用各自的parsexxx（参数是对应字符串）方法，如果不符合条件则报异常
 *
 */

public class Test0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个学生类对象
		Student student=new Student();
		student.setStuname("lin");
		student.setScore(20);
		student.setStuAge(19);
		student.setStuNO(UUID.randomUUID().toString());
		System.out.println(student);
		Student student1=new Student();
		student1.setStuname("kui");
		student1.setScore(30);
		student1.setStuAge(18);
		student1.setStuNO(UUID.randomUUID().toString());
		System.out.println(student.equals(student1));//调用方法时将student类的参数传到object类型中，自动发生向上转型
		
		Integer integer=new Integer(10);//包装类
		//基本数据类型
		String str="111";
		int m=100;
		Integer in=new Integer(m);//基本数据类型转包装类
		int i=integer.intValue();//包装类转为基本数据类型
		Long long1=new Long(100000L);//定义一个Long包装类对象
		long l=long1.longValue();//包装类转为基本数据类型
		
		
		//包装类转字符串
		int n=10;
		Integer integer1=new Integer(n);
		String strInt=integer1.toString();
		System.out.println(strInt);
		
		//字符串转包装类
		String str3="112";
		Integer in2=Integer.valueOf(str3);
		
		//字符串转为基本数据类型
		int s1=Integer.parseInt(str);//方法1
		int s2=Integer.valueOf(str);//方法2
		//基本数据类型转字符串
		int j=10;
		String str1=Integer.toString(j);//方法1
		String str2=String.valueOf(j);//方法2

		
		
		
	}

}
