package com.neuedu.part07;

public class Testshuaka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pay(new Debit(1000),500);

	}
	public static void pay(BankCard bankCard,double payMoney){
		bankCard.shuaka(payMoney);
	}

}
