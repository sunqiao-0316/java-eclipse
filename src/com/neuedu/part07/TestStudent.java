package com.neuedu.part07;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个可容纳5个学生的学生类数组，使用随机数给该数组装入各系学生的对象，然后按如下格式输出数组中的信息
		Student[] students=new Student[5];
		Random random=new Random();
		for(int i=0;i<students.length;i++){
			//根据随机数动态获得学生对象
			students[i]=getStudentInfo(random.nextInt(3));
		}
		for(Student item:students){
			System.out.println("学号"+item.getID()+"姓名"+item.getName()+"性别"+item.getSex()+"年龄"+item.getAge()+"成绩"+item.Score());
		}

	}
	public static Student getStudentInfo(int type){
		if(type==0){
			return new English(100,80,90,1001,"xiaoming",'男',18);
		}
		else if(type==1){
			return new IT(100,90,100,90,1002,"xiaohua",'女',19);
		}
		else {
			return new Chinese(100,80,100,90,1003,"xiaohui",'女',20);
		}
	}

}
