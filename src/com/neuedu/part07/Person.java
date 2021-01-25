package com.neuedu.part07;

public interface Person {
	public void eat();
	public void speak();
	public void live();

}
interface Salesman extends Person{
	
}
interface CollegeStudent extends Person{
	public void study();
	
}
class Worker implements Salesman,CollegeStudent{//接口的实现类

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("can eat");
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("can speak");
		
	}

	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.println("can live");
		
	}

	@Override
	public void study() {
		System.out.println("can study");
		
	}
	
}