package com.neuedu.part07;

public class Fruit2 {
	public void eatFruit(){
		
	}

}
class Apple extends Fruit2{

	@Override
	public void eatFruit() {
		System.out.println("´à");
	}
	
}
class Banana extends Fruit2{

	@Override
	public void eatFruit() {
		System.out.println("Ìð");
	}
	
}