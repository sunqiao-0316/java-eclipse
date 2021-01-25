package com.neuedu.part07;

public class Animal {
	public void Calls(){
		
	}

}


class Cat extends Animal{

	@Override
	public void Calls() {
		System.out.println("ίχίχίχ");
	}
	
}
class Dog extends Animal{

	@Override
	public void Calls() {
		System.out.println("Ντ");
	}
	
}


