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


	public void shuaka(double money){//���������ѵ�Ǯ
		
	}
}

class Debit extends BankCard{//��ǿ�
	

	public Debit(double money) {
		super(money);
		
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			System.out.println("����");
		}
		else{
			System.out.println("�����"+(getMoney()-money));
		}
		
	}
	
	
}
class Credit extends BankCard{//���ÿ�
	public Credit(double money){
		super(money);
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			setMoney(getMoney()-money);
			System.out.println("��͸֧��Ƿ��Ϊ"+getMoney());
		}
		else{
			setMoney(getMoney()-money);
			System.out.println("�����"+(getMoney()));
		}
		
	}
	
}
