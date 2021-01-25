package com.neuedu.part07;

public class TestFootball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个只能有11个对象的足球队类，并验证它
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