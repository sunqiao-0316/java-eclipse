package com.neuedu.part02;

import java.util.Scanner;

/**
 * java运算符
 * 算术运算符：+-*‘/’%（被除数为正则为正）
 *         ++ -- ++变量先加后用   变量++先用后加
 * 赋值运算符
 * 关系运算符：<,>,<=,>=,==,!=
 * 逻辑运算符：针对两个布尔型的数进行布尔运算
 * &&逻辑与  ||逻辑或  &！逻辑非
 * 以上属于短路运算
 * 三目条件运算符（三元表达式）如果表达式1为真，则输出表达式2，否则输出表达式3
 * 表达式1？表达式2:表达式3
 */

public class Test0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		
		System.out.println(i++);//输出0
		System.out.println(i);//输出1
		System.out.println(++i);//输出1
		
		System.out.println(i++ + ++i);//执行i++时i为0 执行+时i为1 执行++i时i为2 （0+2=2）输出2 表达式运算过程中也会受影响
        System.out.println("字符串连接"+i);//输出字符串连接2
        System.out.println("字符串连接"+i+ ++i);//输出23
        System.out.println("字符串连接"+(i+ ++i));//输出5
        
        int x1 = 3, y1 = 5;
        int x2 = 3, y2 = 5;
        int r1, r2;
        r1 = x1++ + x1*y1;//x1++=3 x1=4 y1=5 r1=23
        r2 = ++x2 + x2*y2;//++x2=4 x2=4 y2=5 r2=24
        System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
        System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
        
        x1=x1+3;
        x1+=3;
        System.out.println(x1);
        
        System.out.println(x1==x2);
        System.out.println(x1!=x2);
        
        boolean flag=true,flag1=false;
        System.out.println(flag&&flag1);
        System.out.println(flag||flag1);
        System.out.println(flag^flag1);
        
        System.out.println(1>2?3-1:4+1);
        
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        System.out.println("由控制台输入的值为："+c);
	}

}
