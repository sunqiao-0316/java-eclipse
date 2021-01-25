package com.neuedu.part07;

public class BankCard {
	private double money;
	public BankCard(double money){
		this.money=money;
	}
	
	
	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public void shuaka(double money){//参数是消费的钱
		
	}
}

class Debit extends BankCard{//借记卡
	

	public Debit(double money) {
		super(money);
		
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			System.out.println("余额不足");
		}
		else{
			System.out.println("余额是"+(getMoney()-money));
		}
		
	}
	
	
}
class Credit extends BankCard{//信用卡
	public Credit(double money){
		super(money);
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			setMoney(getMoney()-money);
			System.out.println("已透支，欠款为"+getMoney());
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("余额是"+(getMoney()));
		}
		
	}
	
}
