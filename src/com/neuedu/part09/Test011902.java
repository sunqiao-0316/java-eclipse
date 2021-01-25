package com.neuedu.part09;

import java.util.Scanner;

/**
 * 程序默认的字符编码GBK（中文）GB2312
 * 字符串类
 * 1.字符串的比较方法：boolean equals()判断是否相等
 *             boolean equalsIgnoreCase()比较两个字符串的内容是否相等，忽略大小
 *             boolean startsWith()测试此字符串是否以指定的前缀开始
 *             boolean endsWith()测试此字符串是否以指定的后缀结束
 * 2.字符串跟数组的转换
 * 字符串可以通过toCharArray()方法转换为数组
 * 可以通过字符串构造器将数组转换为字符串，还可以通过字符串的String.valueof()方法
 * 3.字符串跟byte数组转换
 * 可以通过getBytes()方法获得byte数组
 * 4.字符串的常用方法
 * split通过指定的字符串，进行拆分原字符串为一个字符串数组
 * replace(旧字符串，新字符串)将旧字符串替换为新字符串，返回一个新字符串
 * toUpperCase将字符串转换成大写
 * toLowerCase将字符串转换为小写
 * charAt()返回指定索引处的char值
 * substring(b,e)从b位置开始到e-1位置结束，返回一个新字符串
 * indexOf(字符/字符串)返回字符或字符串所在的位置，如果没有返回-1
 * trim()返回新字符忽略首尾空格
 *
 */

public class Test011902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符串比较
		String s1=new String("A");
		String s2="a";
		boolean b= s1.equalsIgnoreCase(s2);//忽略大小写
		System.out.println(b);
		
		System.out.println(s1.startsWith("a"));//测试此字符串是否以指定的前缀开始
		System.out.println(s1.endsWith("a"));//测试此字符串是否以指定的后缀结束
		
		//字符串转换为数组
		char[] chararray=s2.toCharArray();
		for(char item:chararray){
			int a=item;
			System.out.println(a);
		}
		
		//将字符串转换为数组
		String s3=new String(chararray);//方法1
		String.valueOf(chararray);//方法2
		
		//字符串转换为字节型
		String s4="java";
		byte[] bytes=s4.getBytes();
		System.out.println(bytes.length);
		
		//拆分字符串，根据给定正则表达式的匹配拆分此字符串
		String s5="a,eqwe,hsbdu,snsqds,djfusn";
		String[] splitA=s5.split(",");
		for(String item:splitA){
			System.out.println(item);
		}
		
		//将旧的字符串替换为新的字符串
		String replace=s5.replace(",", "*");
		System.out.println(replace);
		
		//转换大小写
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		//返回索引处的char值
		System.out.println(s5.charAt(s5.length()-1));
		
		//返回一个新字符串，该字符串是从begin开始的字符串的内容
		System.out.println(s5.substring(5));
		
		//返回一个新字符串，该字符串是从begin开始到end-1结束的字符串的内容
		System.out.println(s5.substring(0,3));
		
		//返回指定字符在此字符串中第一次/最后一次出现处的索引
		System.out.println(s5.indexOf('e'));
		System.out.println(s5.lastIndexOf('e'));
		System.out.println(s5.indexOf("eqw"));
		
		//返回新的字符串，忽略首尾空格
		String s6="   shubsgd  jdhuiw ";
		System.out.println(s6.trim());
		
		//统计一个字符串中字符e出现的次数
		String s7="nsaiuheefid";
		System.out.println(s7.length()-s7.replace("e", "").length());
		//计算第一个字符串在第二个字符串出现的次数
		Scanner sc=new Scanner(System.in);
		System.out.println("输入第一个字符串");
		String first=sc.nextLine();
		System.out.println("输入第二个字符串");
		String second=sc.nextLine();
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		
		//输入一个邮箱，判断格式是否正确
		while(true){
		System.out.println("输入一个邮箱");
		String mail=sc.nextLine();
		int length=mail.length();
		int indexof=mail.indexOf("@");
		int indexof2=mail.indexOf(".");
		if(indexof==-1||indexof==0||indexof==length-1){//没有@或者@在最前或在最后
			System.out.println("false");
		}
		else if(indexof2==-1||indexof2==0||indexof2==length-1){//没有点或者点在最前或最后
			System.out.println("false");
		}
		else if(indexof2<indexof||indexof2-indexof==1){//点在@前或者他们挨着
			System.out.println("false");
		}
		else if(indexof!=mail.lastIndexOf("@")||indexof2!=mail.lastIndexOf(".")){//多个@或者多个点
			System.out.println("false");
		}
		else{
			
			String string=mail.substring(indexof2+1);
			if(string.equals("com")||string.equals("cn")){
				System.out.println("true");
				break;
			}
			else{
				System.out.println("false");
			}
		}
		}

	}

}
