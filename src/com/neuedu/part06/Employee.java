package com.neuedu.part06;

public class Employee {//打工人类
	//先写属性
	String name;
	int age;
	double sal;
	
	//构造方法
	public Employee(){
		this("菜",19);//用this方法调用另一个构造方法(必须放在第一行)
		System.out.println("这是Employee类的构造方法");
	}
	public Employee(String _name,int _age,double _sal){
		name=_name;
		age=_age;
		sal=_sal;
	}
	public Employee(String name,int age){
		this("cai",19,8);
		this.name=name;
		this.age=age;
		
	}
	
	//写方法
	/**
	 * 获取名字
	 * @param 为空
	 * @return name 名字
	 */
	public String showName(){//获取名字
		System.out.println(name);
		return name;
	}
	/**
	 * 修改名字
	 * @param name1 预期修改的名字
	 */
	public void updateName(String name1){
		name=name1;
	}
	/**
	 * 获取年纪
	 * @param 为空
	 * @return age 年纪
	 */
	public int showAge(){
		System.out.println(age);
		return age;
	}
	/**
	 * 领取工资
	 * @return sal 工资
	 */
	public double getSal(){
		
		System.out.println(sal);
		return sal;
	}

}
