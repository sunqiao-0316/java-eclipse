package lianxi.part01;

import java.util.Scanner;

public class Zuoye0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值
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
		//在一个有8个整数（18，25，7，89，13，2，63）的数组中找出其中最大的数及其下标
		
		int[] a2={18,25,7,89,13,2,5,63};
		int max=a2[0];//最值
		int p=0;//下标
		for(int k=1;k<a2.length;k++){
			if(a2[k]>max){
				max=a2[k];
				p=k;
			}
		}
		
		System.out.println(max+" "+p);
		// 将一个数组中的元素逆序存放
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入长度");
		int len=scanner.nextInt();
		System.out.println("输入数组");
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
