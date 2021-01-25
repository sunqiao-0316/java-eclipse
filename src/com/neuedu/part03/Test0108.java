package com.neuedu.part03;

import java.util.Scanner;

/**
 * 循环
 * 1.while(表达式){}如果表达式结果为真则执行代码块，不满足表达式条件时循环停止
 * 2.do...while   do{代码块}while(表达式)先执行一次代码块，如果表达式结果为真则再次执行代码块，不满足表达式条件时循环停止
 * 3.for(表达式1；表达式2；表达式3){代码块}
 * 表达式1初始化变量，只执行一次；表达式2，循环条件结果为布尔型；表达式3，变量变化（表达式可以不写但';'必须写）
 * 4.循环的中断：break;终止某个语句块的执行
 * 5.continue;跳出本次循环
 * 6.指定循环位置跳出：在目标位置创建名称lable（标识符）: 并在跳出符号后面加标识符名称
 * break lable是指定循环终止
 * continue lable是指定循环开始
 * 7.策略模式：解决if else过多问题  开闭原则：对扩展开放，对修改关闭（不建议修改代码，建议加类）
 * debug代码调试：先加断点，F6执行代码，F8结束当前断点
 * 选中需要调整格式的代码按ctrl+shift+f
 * ctrl+z撤回 ctrl+Y反撤回
 */
public class Test0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while循环与do while循环
		/*
		int a=1;
		int b=2;
		while(a>b){
			System.out.println("执行循环");	
		}
		a=1;
		b=2;
		do{
			System.out.println("执行循环");//先执行一次
			
		}while(a>b);
		//输出1~100的和
		int i=1;
		int s=0;
		while(i<=100){//什么时候停止循环
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
		
		//输出1~1000奇数和
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
		for(int i=0;i<=1000;i++){//表达式可以省略,不能省略;
			if(i%2!=0){
				s+=i;
			}
		}
		System.out.println(s);
		*/
		
		//输出5行7列的*
		/*
		for(int i=1;i<=5;i++){
			System.out.println("*******");
		}
		*/
		
		//判断素数:大于1，除了1和他本身外，没有数可以整除他
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入数");
		int j=scanner.nextInt();
		for(int i=1;i<=j;i++){
			if(j%i==0&&i!=1&&i!=j){
				System.out.println("不是素数");
				return;
			}
		}
		System.out.println("是素数");
		*/
		
		//一百万存三年，每年4%的利率，三年后本息多少
		/*
		double money=100;
		for(int i=1;i<=3;i++){
			money*=(1+0.04);
		}
		System.out.println(money);
		*/
		
		//输出5行7列星号
		/*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=7;j++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
		*/
		//输出1+1/2+1/3+1/4...+1/100
		/*
		double j=1;
		double s=0;
		for(int i=1;i<=100;i++){
			s=s+j/i;
		}
		System.out.println(s);
		*/
		//输出99乘法表
		/*
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
		*/
		
		//1+2+3+...判断累加多首次能超过666
		//循环的中断
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
		
	    //找出大于200的最小质数(两种方法)
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
			System.out.println("是质数");
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
			System.out.println("是质数");
			break;
			}
		}
		System.out.println(j);
		*/
		
		//continue跳出本次循环
		/*
		for(int i=1;i<20;i++){
			if(i%2==0){
				continue;
			}
			System.out.println(i);
		}
		*/
		//指定循环位置跳出
		/*
		inner:for(int i=1;i<20;i++){
			if(i%2==0){
				continue inner;
			}
			System.out.println(i);
		}
	*/
		//break lable是指定循环终止
		//continue lable是指定循环开始
		/*
		 outer: for (int i = 0; i < 10; i++) {
	            System.out.println("外层循环");
	            inner: while (true) {
	                Scanner sc = new Scanner(System.in);
	                String s = sc.next();
	                System.out.println("内层循环" + s);
	                if (s.equals("hello"))
	                    break inner;
	                if (s.equals("kitty"))
	                    continue outer;
	            }
	        }
	        */
		
	}

}
