package com.neuedu.part07;

public class TestFootball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ֻ����11�������������࣬����֤��
		while(true){
			if(Ball.creatNewPlayer()==null){
				break;
			}
		}

	}

}
class Ball{
	private static int count=0;
	private static int num=11;
	private Ball(){
		count++;
	}
	public static Ball creatNewPlayer(){
		if(count<num){
			return new Ball();
		}
		else{
			return null;
		}
	}
}