package lianxi.part01;

import java.util.Scanner;

public class Zuoye0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð������
		int[] a={2,5,4};
		sort(a);
		

	}
	public static void sort(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j+1]<a[j]){
					int temp;
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
			
			}
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		
	}
	 

}
