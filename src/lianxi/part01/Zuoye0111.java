package lianxi.part01;

import java.util.Scanner;

public class Zuoye0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����9��������1,6,2,3,9,4,5,7,8�������飬������Ȼ����������������ֵ
		/*
		int[] a1={1,6,2,3,9,4,5,7,8};
		for(int i=0;i<a1.length-1;i++){
			for(int j=0;j<a1.length-i-1;j++){
				if(a1[j+1]<a1[j]){
					int temp;
					temp=a1[j+1];
					a1[j+1]=a1[j];
					a1[j]=temp;
				}
			}
		}
		for(int k=0;k<a1.length;k++){
			System.out.print(a1[k]+" ");
		}
		*/
		//��һ����8��������18��25��7��89��13��2��63�����������ҳ����������������±�
		
		int[] a2={18,25,7,89,13,2,5,63};
		int max=a2[0];//��ֵ
		int p=0;//�±�
		for(int k=1;k<a2.length;k++){
			if(a2[k]>max){
				max=a2[k];
				p=k;
			}
		}
		
		System.out.println(max+" "+p);
		// ��һ�������е�Ԫ��������
		Scanner scanner=new Scanner(System.in);
		System.out.println("���볤��");
		int len=scanner.nextInt();
		System.out.println("��������");
		int[] a3=new int[len];
		for(int i=0;i<len;i++){
			a3[i]=scanner.nextInt();
		}
		for(int i=0;i<a3.length-1;i++){
			for(int j=0;j<a3.length-i-1;j++){
				int temp2=a3[j+1];
				a3[j+1]=a3[j];
				a3[j]=temp2;
			}
		}
		for(int m=0;m<a3.length;m++){
			System.out.print(a3[m]+" ");
		}
		
		 
		

	}

}
