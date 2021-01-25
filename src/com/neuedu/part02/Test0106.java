package com.neuedu.part02;
/**
 * 变量和运算符
 * 由{}确定代码块（程序块），其中可以写数据类型、变量、运算符、条件流语句
 * 
 * 1.标识符
 * 命名规则：由字母、数字、美元符号、下划线组成
 *        不能以数字开头
 *        不能是关键字或保留字
 *        不能有空格
 *        长度没有限制
 * 规范：
 * 类名每个单词的首字母大写，其它字母小写
 * 包名每个单词都小写
 * 方法名第一个单词首字母小写，其它单词小写
 * 变量名建议和方法名一个规则
 * 常量名建议都大写
 * 
 * 2.变量：在程序运行过程中随时可能发生变化
 * 同一个代码块变量名不能重复
 * java数据类型分为两大类：
 * 1字节=8bit 第一位：01正负标识
 * 基本数据类型：字符型:char 由‘’修饰，只能写单个字符，占用两个字节
 *                  可以写Unicode字符 常用编码：A:65 a:97 0:48
 *                  转义字符\n换行 \r回车 \t空格 \b退格 可以输出特殊字符
 *            布尔型:boolean 只含有true和false两种值 默认值时false
 *            数值型
 *            整型:byte:字节型 1字节 范围： -128~127
 *                short:短整型 2字节 -32768~32767
 *                int:整型 4字节 -2147483648~2147483647
 *                long:长整型 8字节 定义时需要在后面加L -2的63次幂~2的63次幂-1
 *            浮点型:float 单精度浮点型 4字节 -3.403E38~3.403E38 定义时在值的后面加F
 *                 double 双精度浮点型 8字节 -1.798E308 ~ 1.798E308
 * 3.类型转换：强制显式类型转换 自动隐式类型转换
 * 当小范围赋值转换为大范围赋值时 自动转
 * 当大范围转换为小范围时 强制转
 * 
 * 引用数据类型：类、数组、接口
 *                 
 * JDK:java开发环境
 * JRE:java运行环境
 * 我们琳琳染了红头发，好piu酿
 */

public class Test0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i=127;//字节型
		System.out.println(i);
		i=1;
		System.out.println(i);//自动sysout ALT+/
		short j=32767;//短整型
		int k=2147483647;//整型
		long m=2147483648L;//长整型
		
		//二进制用0B定义，以下代码可自动将二进制转化为十进制
		int er=0B0001;
		System.out.println(er);
		//八进制用0开头定义
		int ba=020;
		System.out.println(ba);
		//十六进制用0X开头定义
		
		float f=10.1F;//单精度浮点型
		System.out.println(f);
		double d=10.01D;//双精度浮点型
		System.out.println(d);

		//自动补全返回值	鼠标光标放在语句后，ctrl+1	
		String binaryString = Integer.toBinaryString(10);//转换二进制
		System.out.println(Integer.toBinaryString(10));//转换二进制
		System.out.println(Integer.toOctalString(16));//转换八进制
		System.out.println(Integer.toHexString(100));//转换十六进制
//按住ctrl点击，则可以查看源码
		
		//布尔型
		boolean bl=true;
		boolean bo=false;
		boolean bt=false;
		System.out.println(bt);
		
		//字符型
		char c1='A';
		char c3='\u03A6';
		char c2='a';
		System.out.println(c3);//Unicode码 
		System.out.println("escapechar");
		System.out.println("escape\bchar");
	    System.out.println("escape\tchar");
	    System.out.println("escape\rchar");
	    System.out.println("escape\nchar");
	    System.out.println("\\我在斜线里\\");
	    System.out.println("\'我在单引号里\'");
	    System.out.println("我没有单引号");
	    System.out.println("\"我在双引号里\"");
	    System.out.println("我没有双引号");
	    
	    int ic1=c1;//自动转换（隐式转换）
	    System.out.println(ic1);
	    int ic2=c2;
	    System.out.println(ic2);
	    char ca=(char) (ic1+32);//强制转换（显示转换）
	    System.out.println(ca);
	    int i1=2;
	    double d1=3.3333D;
	    int i2=(int) (i1+d1);
	    System.out.println(i2);
	    		
	    
		
	}

}
