package com.neuedu.part07;

public class TestFruit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit2 growFruit=growFruit(1);
		growFruit.eatFruit();
		//出现空指针异常最常见的场景：点前面的东西是null

	}
	//返回值多态
	public static Fruit2 growFruit(int type){
		if(type==1){
			return new Apple();
		}
		else if(type==2){
			return new Banana();
		}
		return null;
	}

}
