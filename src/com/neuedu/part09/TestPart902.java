package com.neuedu.part09;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序默认的字符编码GBK中文，gb2312
 * 字符串类
 * 字符串内部使用不可变的char型数组存放内容
 * 1.字符串的比较方法：
 * 				boolean equals() 判断是否相等 
 * 			    boolean equalsIgnoreCase() 忽略大小写进行的比较
 *				boolean startsWith() 判断字符串是否以此开始
 *				boolean endsWith() 判断字符串是否以此结束
 * 2.字符串跟char数组的转换
 * 可以通过toCharArray()的方法转换成char型数组
 * 可以通过字符串的构造器将字符数组转换成字符串，还可以通过String.valueOf方法
 * 
 * 3.字符串跟byte数组的转换
 * 可以通过getBytes()的方法获得byte数组，可以获得字符串所占用的字节数
 * 
 * 4.字符串的常用方法
 * split(指定分隔符) 通过指定的字符串，进行拆分原字符串为一个字符串数组
 * replace（旧字符，新字符）将旧字符全部替换成新字符，返回一个新字符串
 * toUpperCase() 将字符串转换成大写
 * toLowerCase() 将字符串转换成小写
 * charAt(index) 返回index下标对应的字符
 * substring(b,e) 从b位置开始，到e-1位置结束，返回一个新字符串
 * indexOf(字符/字符串) 返回字符或者字符串所在的位置，如果没有返回-1
 * trim() 去掉字符串首尾空格
 * matches(正则表达式)字符串格式如果符合，返回true，不符合返回false，用于校验字符串
 * 
 * 5.如果一个字符串频繁变化，不推荐使用String定义
 * 可变字符串：StringBuffer StringBuilder
 * 面试题：StringBuffer StringBuilder区别
 * StringBuffer线程安全同步，速度较慢；StringBuilder线程不安全，速度较快
 * append(xxx)将xxx拼接到字符串后面	
 * insert(指定位置,xxx)在指定位置插入xxx
 * deleteCharAt(指定位置)删除指定位置字符串	
 * 6.Date类
 * after判断日期是否在指定日期之后
 * before
 * 7.Calendar日历类
 * 8.SimpleDateFormat类 自定义日期格式
 * y代表年，M月，d日，H小时，m分钟，s秒
 * format(Date d)日期型转为字符串
 * parse(String s)字符串转为日期型，字符串要和SimpleDateFormat里定义的格式一致才可以转换
 * 9.math工具类
 * Math.floor 截取整数
 * Math.ceil 凑整
 * Math.rint 四舍五入取整
 * 
 */
public class TestPart902 {

	public static void main(String[] args) {
		String str = new String("aaaaaa");
		String str2 = "中";
		
		boolean b = str.equalsIgnoreCase(str2);
		
		System.out.println(b);
		
		System.out.println(str.startsWith("aaaa"));
		System.out.println(str.endsWith("a"));
		char[] charArray = str2.toCharArray();
		for(char item: charArray){
			System.out.println(item);
		}
		str = new String(charArray);
		String.valueOf(charArray);
		
		byte[] bytes = null;
		bytes = str2.getBytes();
		
		for(byte item: bytes){
			System.out.println(item);
		}
		str2 = new String(bytes);
		System.out.println(str2);
		
		String str3 = "   a,eqwe,   ,dasdsad,    asdasd    ";
		
		String[] splitA = str3.split(",");
		
		for(String item: splitA){
			System.out.println(item);
		}
		
		String replace = str3.replace(',', '#');
		System.out.println(replace);
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		System.out.println(str3.charAt(str3.length()-1));
		System.out.println(str3.substring(0, 3));
		
		System.out.println(str3.indexOf("eqw"));
		
		System.out.println(str3.trim());
		String s = "abecedkjkacedjkdseddklj";
		//统计一个字符串中字符e出现的次数
		System.out.println(s.length()-s.replace("e", "").length());
		//System.out.println("计算第一个字符串在第二个字符串中出现的次数");
		Scanner sc = new Scanner(System.in);
		
		/*String first = sc.nextLine();
		String second = sc.nextLine();
		
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		*/
		//输入一个邮箱 判断邮箱的格式是否正确111@qq.com
		/*
		while (true) {
			System.out.println("请输入一个邮箱");
			String mail = sc.nextLine();
			
		
			
			
			int length = mail.length();
			int indexOf = mail.indexOf("@");
			int indexOf2 = mail.indexOf(".");
			if(length>20){
				System.out.println("邮箱不合法");
			}else
			if(indexOf == -1 || indexOf ==0 || indexOf == length-1){
				System.out.println("邮箱不合法");
			}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){
				System.out.println("邮箱不合法");
			}else if(indexOf2<indexOf || indexOf2-indexOf==1){//点在@符前面,或者它们挨着
				System.out.println("邮箱不合法");
			}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){
				System.out.println("邮箱不合法");
			}else{
				String string = mail.substring(indexOf2+1);
				if(string.equals("com") || string.equals("cn") ){
					System.out.println("邮箱合法");
					break;
				}else{
					System.out.println("邮箱不合法");
				}
			}
		}
		
		*/
		/*
		StringBuffer stringBuffer=new StringBuffer ("aaa");
		//字符串的拼接
		stringBuffer.append("1111");
		//指定位置插入
		stringBuffer.insert(0, b);//在第0个位置插入布尔型（布尔型会自动转为字符串）
		//删除指定下标的字符
		stringBuffer.deleteCharAt(1);
		//替换指定字符串
		stringBuffer.replace(1, 2, "00");
		System.out.println(stringBuffer);
		//StringBuilder stringBuilder=new StringBuilder("bbb");
		
		//控制台输入10次字符串，输出连接之后的
		StringBuffer stringBuffer2=new StringBuffer();
		for(int i=0;i<2;i++){
			String input=sc.nextLine();
			stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		*/
		//Date类
		Date date=new Date();
		System.out.println(date);
		System.out.println();
		Date date2=new Date(2000);
		System.out.println(date.before(date2));//日期比较
		
		//日历类
		Calendar instance = Calendar.getInstance();//返回对象快捷键Alt+shift+l
		System.out.println(instance.getTime());
		String str4;
		int type=instance.get(9);//0是上午，1是下午
		if(type==0){
			str4="上午";
		}
		else{
			str4="下午";
		}
		int year=instance.get(1);
		int month=instance.get(2);
		int day=instance.get(5);
		int hour=instance.get(10);
		int min=instance.get(12);
		int se=instance.get(13);
		System.out.println(year+" "+month+1+" "+day+" "+hour+" "+min+" "+se+" "+str4);
		
		//自定义日期格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String format = sdf.format(new Date());//日期型转为字符串
		System.out.println(format);
		
		
	}

}
