package lianxi.part01;

import java.util.Scanner;

public class Lianxi0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���������飬�������⣬�����ȡһ�����ʿ�ʼ�²⣬����̨Ĭ����ʾ-----
		//�����ַ����в²⣬�����ǵ����ڵ����滻-��������ʾ�ַ������ڣ���5�λ���
		int n=1;
		char[] a={'a','b','c','d'};
		char[] a2={'-','-','-','-'};
		System.out.println("----");
		Scanner sc=new Scanner(System.in);
		System.out.println("���뵥��");
		while(n<=5){
		char c=sc.next().charAt(0);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a2.length;j++){
				if(c==a[i]){
				for(int m=0;m<a2.length;m++){
					if(m==i){
						a2[m]=a[i];
					}
				}
				}
				if(c!=a[i]){
					System.out.println("����");
					break;
				}
			}	
			n++;
			break;
		}
		for(int j=0;j<a2.length;j++){
			System.out.print(a2[j]);
		}
	 }
	}

}
