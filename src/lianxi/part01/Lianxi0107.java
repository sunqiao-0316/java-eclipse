package lianxi.part01;

import java.util.Scanner;

public class Lianxi0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//编写程序根据x的值，计算y的值，最后输出x和y的值
		/*
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y;
		if(x<0){
			y=-1;
		}
		else if(x==0){
			y=0;
		}
		else {
			y=1;
		}
		System.out.println(x+" "+y);
		*/
		//给定一个字符变量，判断该变量是否为元音字母并输出
		//元音字母为a、e、i、o、u
		/*
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch);
			break;
		default:
			System.out.println("不是元音字母");
		}
*/
		//求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为12
		/*
		for(int i=200;i<=300;i++){
			int a=(i/100%10)*(i/10%10)*(i%10);
			int b=i/100%10+i/10%10+i%10;
			if(a==42&&b==12){
				System.out.println(i);
			}
		}
		*/
		//求0~100奇书和
		/*
		int s=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				
				s+=i;
			}
		}
		System.out.println(s);
		*/
		//寻找所有的水仙花数：一定是三位数，每一位的立方，加起来正好是这个数的本身，比如153=111 + 555 + 333
		/*
		for(int i=100;i<1000;i++){
			int a=i/100%10;
			int b=i/10%10;
			int c=i%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
		*/
		//深秋，树叶开始掉落。第一天树叶开始掉落了一半还多一片，第二天又落下了剩下的一半零一片。如此往复循环，直到第十五天，树上还剩一片叶子。问：这颗大树总共有多少片叶子
		/*
		int s=1;
		for(int i=15;i>1;i--){
			s=2*s+2;
		}
		System.out.println(s);
		*/
		//经典的"百马百担"问题，有一百匹马，驮一百担货，大马驮3担，中马驮2担，两只小马驮1担，问有大，中，小马各几匹？
		/*
		int s=100;
		for(int d=1;d<=100;d++){
			for(int z=1;z<=100;z++){
				for(int x=1;x<=100;x++){
					if(s==3*d+2*z+0.5*x&&d+z+x==100){
						System.out.println(d+" "+z+" "+x);
					}
				}
			}
		}
		*/
		//给定一个年份，判断是否是闰年 1.被4整除但不能被100整除，2.能被400整除
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入年份");
		int i=scanner.nextInt();
		
		//输入一个月份，输出于此月份天数相同的月份:135781012(31)  46911(30) 2(29)
		
		System.out.println("输入月份");
		int mo=scanner.nextInt();
		switch(mo){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if(i%4==0&&i%100!=0){
				System.out.println("28天");
			}
			else if(i%400==0){
				System.out.println("28天");
			}
			else{
				System.out.println("29天");
			}
			break;
		
		}
		*/
	}

}
