package com.neuedu.part07;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һ��������5��ѧ����ѧ�������飬ʹ���������������װ���ϵѧ���Ķ���Ȼ�����¸�ʽ��������е���Ϣ
		Student[] students=new Student[5];
		Random random=new Random();
		for(int i=0;i<students.length;i++){
			//�����������̬���ѧ������
			students[i]=getStudentInfo(random.nextInt(3));
		}
		for(Student item:students){
			System.out.println("ѧ��"+item.getID()+"����"+item.getName()+"�Ա�"+item.getSex()+"����"+item.getAge()+"�ɼ�"+item.Score());
		}

	}
	public static Student getStudentInfo(int type){
		if(type==0){
			return new English(100,80,90,1001,"xiaoming",'��',18);
		}
		else if(type==1){
			return new IT(100,90,100,90,1002,"xiaohua",'Ů',19);
		}
		else {
			return new Chinese(100,80,100,90,1003,"xiaohui",'Ů',20);
		}
	}

}
