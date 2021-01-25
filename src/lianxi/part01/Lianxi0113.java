package lianxi.part01;

import java.util.Scanner;

public class Lianxi0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个单词数组，长度随意，随机获取一个单词开始猜测，控制台默认显示-----
		//输入字符进行猜测，若果是单词内的则替换-，否则显示字符不存在，有5次机会
		int n=1;
		char[] a={'a','b','c','d'};
		char[] a2={'-','-','-','-'};
		System.out.println("----");
		Scanner sc=new Scanner(System.in);
		System.out.println("输入单词");
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
					System.out.println("错误");
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
