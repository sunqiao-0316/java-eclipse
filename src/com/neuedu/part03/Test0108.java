package com.neuedu.part03;

import java.util.Scanner;

/**
 * ѭ��
 * 1.while(���ʽ){}������ʽ���Ϊ����ִ�д���飬��������ʽ����ʱѭ��ֹͣ
 * 2.do...while   do{�����}while(���ʽ)��ִ��һ�δ���飬������ʽ���Ϊ�����ٴ�ִ�д���飬��������ʽ����ʱѭ��ֹͣ
 * 3.for(���ʽ1�����ʽ2�����ʽ3){�����}
 * ���ʽ1��ʼ��������ִֻ��һ�Σ����ʽ2��ѭ���������Ϊ�����ͣ����ʽ3�������仯�����ʽ���Բ�д��';'����д��
 * 4.ѭ�����жϣ�break;��ֹĳ�������ִ��
 * 5.continue;��������ѭ��
 * 6.ָ��ѭ��λ����������Ŀ��λ�ô�������lable����ʶ����: �����������ź���ӱ�ʶ������
 * break lable��ָ��ѭ����ֹ
 * continue lable��ָ��ѭ����ʼ
 * 7.����ģʽ�����if else��������  ����ԭ�򣺶���չ���ţ����޸Ĺرգ��������޸Ĵ��룬������ࣩ
 * debug������ԣ��ȼӶϵ㣬F6ִ�д��룬F8������ǰ�ϵ�
 * ѡ����Ҫ������ʽ�Ĵ��밴ctrl+shift+f
 * ctrl+z���� ctrl+Y������
 */
public class Test0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileѭ����do whileѭ��
		/*
		int a=1;
		int b=2;
		while(a>b){
			System.out.println("ִ��ѭ��");	
		}
		a=1;
		b=2;
		do{
			System.out.println("ִ��ѭ��");//��ִ��һ��
			
		}while(a>b);
		//���1~100�ĺ�
		int i=1;
		int s=0;
		while(i<=100){//ʲôʱ��ֹͣѭ��
			s+=i;
			i++;
		}
		System.out.println(s);
		
		
		 i=1;
		 s=0;
		do{
			s+=i;
			i++;
		}
		while(i<=100);
		System.out.println(s);
		*/
		
		//���1~1000������
		/*
		int i=0;
		int s=0;
		while(i<=1000){
			if(i%2!=0){
				s+=i;
			}
			i++;
		}
		System.out.println(s);
		*/
		/*
		int s=0;
		for(int i=0;i<=1000;i++){//���ʽ����ʡ��,����ʡ��;
			if(i%2!=0){
				s+=i;
			}
		}
		System.out.println(s);
		*/
		
		//���5��7�е�*
		/*
		for(int i=1;i<=5;i++){
			System.out.println("*******");
		}
		*/
		
		//�ж�����:����1������1���������⣬û��������������
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		int j=scanner.nextInt();
		for(int i=1;i<=j;i++){
			if(j%i==0&&i!=1&&i!=j){
				System.out.println("��������");
				return;
			}
		}
		System.out.println("������");
		*/
		
		//һ��������꣬ÿ��4%�����ʣ������Ϣ����
		/*
		double money=100;
		for(int i=1;i<=3;i++){
			money*=(1+0.04);
		}
		System.out.println(money);
		*/
		
		//���5��7���Ǻ�
		/*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=7;j++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
		*/
		//���1+1/2+1/3+1/4...+1/100
		/*
		double j=1;
		double s=0;
		for(int i=1;i<=100;i++){
			s=s+j/i;
		}
		System.out.println(s);
		*/
		//���99�˷���
		/*
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
		*/
		
		//1+2+3+...�ж��ۼӶ��״��ܳ���666
		//ѭ�����ж�
		/*
	    int s=0;
	    int count=1;
	    int i=1;
	    while(true){
	    	s+=i;
	    	if(s>666){
	    		break;
	    	}
	    	count++;
	    	i++;
	    }
	    System.out.println(count);
	    */
		
	    //�ҳ�����200����С����(���ַ���)
		/*
		int j=200;
		while(true){
			int count=0;
			j++;
			for(int i=2;i<j;i++){
			if(j%i==0){
				count++;
				break;
			}
			}
			if(count==0){
			System.out.println("������");
			break;
			}
		}
		System.out.println(j);
		*/
		/*
		boolean flag;
		int j=200;
		while(true){
			flag=true;
			j++;
			for(int i=2;i<j;i++){
			if(j%i==0){
			flag=false;
				break;
			}
			}
			if(flag){
			System.out.println("������");
			break;
			}
		}
		System.out.println(j);
		*/
		
		//continue��������ѭ��
		/*
		for(int i=1;i<20;i++){
			if(i%2==0){
				continue;
			}
			System.out.println(i);
		}
		*/
		//ָ��ѭ��λ������
		/*
		inner:for(int i=1;i<20;i++){
			if(i%2==0){
				continue inner;
			}
			System.out.println(i);
		}
	*/
		//break lable��ָ��ѭ����ֹ
		//continue lable��ָ��ѭ����ʼ
		/*
		 outer: for (int i = 0; i < 10; i++) {
	            System.out.println("���ѭ��");
	            inner: while (true) {
	                Scanner sc = new Scanner(System.in);
	                String s = sc.next();
	                System.out.println("�ڲ�ѭ��" + s);
	                if (s.equals("hello"))
	                    break inner;
	                if (s.equals("kitty"))
	                    continue outer;
	            }
	        }
	        */
		
	}

}
