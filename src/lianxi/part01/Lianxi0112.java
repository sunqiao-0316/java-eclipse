package lianxi.part01;

import java.util.Scanner;

public class Lianxi0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¼��ͬѧ���ͳɼ������㼰���ʣ�����������ڰٷ�֮60���£���Ϊ������ͬѧ+2��ֱ�������ʹ��ٷ�֮60��������������
	/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("����ͬѧ��");
		int stu=scanner.nextInt();
		System.out.println("����ɼ�");
		int[] a=new int[stu];
		double j=0;
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		//ͳ�Ƽ�������
		
		for(int i=0;i<stu;i++){
			if(a[i]>=60){
				j++;
			}
		}
		
		double rate=j/stu;
		while(true){
			if(rate<0.6){
				for(int i=0;i<stu;i++){
					if(a[i]<60){
						a[i]=a[i]+2;
						if(a[i]>=60){
							j++;
						}
					}
				}
			}
			else{
				
				System.out.println("������"+rate);
				break;
			}
		}
		*/
		
		
		//��һ������ǰ����������һ�����飬���û��������һ����������Ϸ����
		//�����˷����ϣ���û��������+1�֣���������ʱ������һ��Ϊ+1����˴�+2�֣��������һ�ζ�2��
		Scanner scanner=new Scanner(System.in);
		int len=scanner.nextInt();
		int[] a=new int[len];
		int s=0;
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				s+=a[i];
			}
			else if(a[i]==0){
				System.out.println("over");
				break;
			}
		}
		System.out.println(s);

	}

}
