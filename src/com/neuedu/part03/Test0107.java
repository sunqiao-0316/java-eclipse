package com.neuedu.part03;

import java.util.Scanner;

/**
 * 流程控制语句
 * 1.条件语句：在程序运行过程中，根据条件是否成立选择执行代码的过程
 * 1)if语句：if(表达式){执行语句块；}其中表达式结果只能为true或false，如果表达式为真时进入语句块执行
 * if语句可以不写{}，前期是只有一行
 * if多选一：if（）{}else if(){}else{}
 * 
 * 2)switch语句：流程判断 switch(表达式){case 预期值：代码块；break;...default:代码块}
 * 表达式内结果为预期值，break;作用是执行定制，可有可无
 * 表达式的值只能为byte、short、char、int、String
 * case后边的值只能为常数或常量，不能为变量，而且值不能重复（常量：不可变的量，固定值 在变量前加上final）
 *
 */

public class Test0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true){
			System.out.println(1);
		}
		boolean b=true;
		if(b){
			System.out.println(1);
		}
		else{
			System.out.println(2);
		}
		/*
		//从控制台输入一个数，判断这个数时奇数还是偶数
		Scanner scanner=new Scanner(System.in);
		int nextInt=scanner.nextInt();
		if(nextInt%2==0){
			System.out.println("是偶数");
		}
		else{
			System.out.println("是奇数");
		}
		
		//men1 women2 child3
		int type=1;
		if(type==1){
			System.out.println("men");
		}
		else if(type==2){
			System.out.println("women");
		}
		else if(type==3){
		    System.out.println("child");	
		}
		*/
		/*
		//控制台输入一个成绩，输出成绩的等级：
		Scanner scanner1=new Scanner(System.in);
		int chengji=scanner1.nextInt();
		//判断输入的数是否合法
		if(chengji<0||chengji>100){
			System.out.println("输入错误");
			chengji=scanner1.nextInt();
			if(chengji<0||chengji>100){
				System.out.println("频繁错误，输入结束");
				return;//结束当前方法运行
				}
		}
		if(chengji>=90){
			System.out.println("优");
		}
		else if(chengji<=89&&chengji>=80){
			System.out.println("良");
		}
		else if(chengji<=79&&chengji>70){
			System.out.println("中等");
		}
		else if(chengji<=69&&chengji>60){
			System.out.println("及格");
		}
		else{
			System.out.println("不及格");
		}*/
		
		//switch语句
		int i=3;
		switch(i){
		
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("到底啦");
			
		}
		
		//控制台输入一个成绩，输出成绩的等级：
		Scanner scanner1=new Scanner(System.in);
		int chengji=scanner1.nextInt();
		
		switch(chengji/10){
		case 10:
		case 9:
			System.out.println("优");
			break;
		case 8:
			System.out.println("良");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			
		
		}
		
		
		
		

	}

}
