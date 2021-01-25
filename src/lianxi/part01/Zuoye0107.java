package lianxi.part01;

import java.util.Scanner;

public class Zuoye0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入a,b");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println("a="+a+" "+"b="+b);
		*/
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除
		/*
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		int s;
		if(i>0&&i<1000){
			s=i/100%10+i/10%10+i%10;
			System.out.println(s);
		}
		else{
			return;
		}
		*/
		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("选择温度，1为输入华氏度，0为输入摄氏度");
		int j=scanner.nextInt();
		switch(j){
		case 1:
		int huashi=scanner.nextInt();
		int sheshi=(huashi-32)*5/9;
		System.out.println(sheshi);
		break;
		case 0:
		sheshi=scanner.nextInt();
	    huashi=sheshi*5/9+32;
		System.out.println(huashi);
		break;
		}
		*/
		//给定一个任意的大写字母A~Z，转换为小写字母
		/*
		Scanner scanner=new Scanner(System.in);
		char daxie=scanner.next().charAt(0);
		char xiaoxie=(char) (daxie+32);
		System.out.println(xiaoxie);
		*/
		/*
		int s=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				s+=i;
			}
		}
		System.out.println(s);
*/
		/*for(int i=1;i<=9;i++){
			System.out.println(i);
			for(int j=1;j<=i;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}*/
		
	}

}
