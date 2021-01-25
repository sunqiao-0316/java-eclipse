package com.neuedu.part07;

public interface Fruit {
	public void eat();

}
class Tao implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("¥‡");
	}
	
}
class Group implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("»Ì");
	}
	
}