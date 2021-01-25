package com.neuedu.part10;

public class BankerInfo {
	private int no;
	private String name;
	private double balance;
	public BankerInfo(int no,String name,double balanc){
		this.no=no;
		this.name=name;
		this.balance=balance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
