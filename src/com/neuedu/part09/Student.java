package com.neuedu.part09;

public class Student {
	private String stuname;
	private int stuAge;
	private String stuNO;
	private int score;
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuNO() {
		return stuNO;
	}
	public void setStuNO(String stuNO) {
		this.stuNO = stuNO;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void study(){
		System.out.println(this.stuname+"在学习");
	}
	
	//重写object中的toString方法
	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stuAge=" + stuAge + ", stuNO=" + stuNO + ", score=" + score + "]";
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj){
		Student s=(Student)obj;//向下转型
		if(this.getStuname().equals(s.getStuname())&&this.getStuAge()==s.getStuAge()){
			return true;
		}
		return false;
	}
	
	

}
