package com.neuedu.part07;

public class Testanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Cat();
		animal.Calls();
		
		Animal buyAnimal=buyAnimal(1);
		if(buyAnimal!=null){
			if(buyAnimal instanceof Cat){
				System.out.println("买到了猫");
				Cat c=(Cat) buyAnimal;
				c.Calls();
			}
			else if(buyAnimal instanceof Dog){
				System.out.println("买到了狗");
				Dog d=(Dog) buyAnimal;
				d.Calls();
			}
		}

	}
	//买动物
	public static Animal buyAnimal(int type){
		if(type==1){
			return new Cat();
		}
		else if(type==2){
			return new Dog();
		}
		else{
			return null;
		}
	}

}
