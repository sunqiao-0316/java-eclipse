package com.neuedu.part07;

public class TestFruit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit2 growFruit=growFruit(1);
		growFruit.eatFruit();
		//���ֿ�ָ���쳣����ĳ�������ǰ��Ķ�����null

	}
	//����ֵ��̬
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
