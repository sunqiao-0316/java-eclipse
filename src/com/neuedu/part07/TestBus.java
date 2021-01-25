package com.neuedu.part07;

public class TestBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payPakingFee(new MiniBus(3));

	}
	//参数多态
	public static void payPakingFee(Bus bus){
		int pakingFee = bus.pakingFee();
		System.out.println("收费"+pakingFee);
	}

}
