package com.neuedu.part09;

import java.util.Calendar;

public class Test0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ǰ������
		Calendar instance = Calendar.getInstance();
		int maximum = instance.getMaximum(Calendar.DATE);//��õ�ǰ�µ������
		instance.set(Calendar.DATE, 1);//���ô��������Ϊ1��
		int start=instance.get(Calendar.DAY_OF_WEEK)-1;//���1�������ڼ�
		System.out.println("һ     ��     ��     ��     ��     ��     ��");
		System.out.print("            ");
		for(int i=1;i<=maximum;i++){
			if(i<10){
				System.out.print(" "+i+" ");
			}
			else{
				System.out.print(i+" ");
			}
			if((start+i-1)%7==0){//���߻���
				System.out.println();
			}
		}

	}

}
