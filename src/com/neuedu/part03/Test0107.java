package com.neuedu.part03;

import java.util.Scanner;

/**
 * ���̿������
 * 1.������䣺�ڳ������й����У����������Ƿ����ѡ��ִ�д���Ĺ���
 * 1)if��䣺if(���ʽ){ִ�����飻}���б��ʽ���ֻ��Ϊtrue��false��������ʽΪ��ʱ��������ִ��
 * if�����Բ�д{}��ǰ����ֻ��һ��
 * if��ѡһ��if����{}else if(){}else{}
 * 
 * 2)switch��䣺�����ж� switch(���ʽ){case Ԥ��ֵ������飻break;...default:�����}
 * ���ʽ�ڽ��ΪԤ��ֵ��break;������ִ�ж��ƣ����п���
 * ���ʽ��ֵֻ��Ϊbyte��short��char��int��String
 * case��ߵ�ֵֻ��Ϊ��������������Ϊ����������ֵ�����ظ������������ɱ�������̶�ֵ �ڱ���ǰ����final��
 *
 */

public class Test0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true){
			System.out.println(1);
		}
		boolean b=true;
		if(b){
			System.out.println(1);
		}
		else{
			System.out.println(2);
		}
		/*
		//�ӿ���̨����һ�������ж������ʱ��������ż��
		Scanner scanner=new Scanner(System.in);
		int nextInt=scanner.nextInt();
		if(nextInt%2==0){
			System.out.println("��ż��");
		}
		else{
			System.out.println("������");
		}
		
		//men1 women2 child3
		int type=1;
		if(type==1){
			System.out.println("men");
		}
		else if(type==2){
			System.out.println("women");
		}
		else if(type==3){
		    System.out.println("child");	
		}
		*/
		/*
		//����̨����һ���ɼ�������ɼ��ĵȼ���
		Scanner scanner1=new Scanner(System.in);
		int chengji=scanner1.nextInt();
		//�ж���������Ƿ�Ϸ�
		if(chengji<0||chengji>100){
			System.out.println("�������");
			chengji=scanner1.nextInt();
			if(chengji<0||chengji>100){
				System.out.println("Ƶ�������������");
				return;//������ǰ��������
				}
		}
		if(chengji>=90){
			System.out.println("��");
		}
		else if(chengji<=89&&chengji>=80){
			System.out.println("��");
		}
		else if(chengji<=79&&chengji>70){
			System.out.println("�е�");
		}
		else if(chengji<=69&&chengji>60){
			System.out.println("����");
		}
		else{
			System.out.println("������");
		}*/
		
		//switch���
		int i=3;
		switch(i){
		
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("������");
			
		}
		
		//����̨����һ���ɼ�������ɼ��ĵȼ���
		Scanner scanner1=new Scanner(System.in);
		int chengji=scanner1.nextInt();
		
		switch(chengji/10){
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����");
			break;
		default:
			System.out.println("������");
			
		
		}
		
		
		
		

	}

}
