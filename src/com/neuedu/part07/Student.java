package com.neuedu.part07;

public class Student {
	private int ID;
	private String name;
	private char sex;
	private int age;
	private int finalExam;//期末成绩
	private int midsemester;//期中成绩
	
	public Student(int finalExam,int midsemester,int ID,String name,char sex,int age){
		this.finalExam=finalExam;
		this.midsemester=midsemester;
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public int getMidsemester() {
		return midsemester;
	}

	public void setMidsemester(int midsemester) {
		this.midsemester = midsemester;
	}

	public double Score(){
		 return this.finalExam*0.5+this.midsemester*0.5;
	}
	

}
class English extends Student{
	private int speechScore;//演讲成绩
	public English(int finalExam,int midsemester,int speechScore,int ID,String name,char sex,int age){
		super(finalExam,midsemester,ID, name, sex, age);
		this.speechScore=speechScore;
	}

	public int getSpeechScore() {
		return speechScore;
	}

	public void setSpeechScore(int speechScore) {
		this.speechScore = speechScore;
	}

	@Override
	public double Score() {
		return this.speechScore*0.5+getFinalExam()*0.25+getMidsemester()*0.25;
		
	}
	
}
class IT extends Student{
	private int caozuo;
	private int write;
	

	public int getCaozuo() {
		return caozuo;
	}

	public void setCaozuo(int caozuo) {
		this.caozuo = caozuo;
	}

	public int getWrite() {
		return write;
	}

	public void setWrite(int write) {
		this.write = write;
	}

	public IT(int finalExam,int midsemester,int caozuo,int write,int ID,String name,char sex,int age) {
		super(finalExam,midsemester, ID, name, sex, age);
		this.caozuo=caozuo;
		this.write=write;
	}

	@Override
	public double Score() {
		return caozuo*0.4+write*0.2+getFinalExam()*0.2+getMidsemester()*0.2;
	}
	
}
class Chinese extends Student{
	private int read;
	private int speechScore;

	public Chinese(int finalExam,int midsemester,int read,int speechScore,int ID,String name,char sex,int age) {
		super(finalExam,midsemester,ID, name, sex, age);
		this.speechScore=speechScore;
		this.read=read;
		
	}

	@Override
	public double Score() {
		return speechScore*0.35+read*0.35+getFinalExam()*0.15+getMidsemester()*0.15;
	}
	
}
