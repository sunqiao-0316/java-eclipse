package com.neuedu.part07;

public class Testanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Cat();
		animal.Calls();
		
		Animal buyAnimal=buyAnimal(1);
		if(buyAnimal!=null){
			if(buyAnimal instanceof Cat){
				System.out.println("����è");
				Cat c=(Cat) buyAnimal;
				c.Calls();
			}
			else if(buyAnimal instanceof Dog){
				System.out.println("���˹�");
				Dog d=(Dog) buyAnimal;
				d.Calls();
			}
		}

	}
	//����
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
