package demo;

/**
 * javaSE 标准版，包含了java的核心类
 * javaEE 企业版，包含了SE的类，企业级应用
 * javaME 微缩版，一般用于手机、嵌入式端开发
 *
 * java特点：1.跨平台：程序由.java文件（源文件）编译成.class字节码文件，然后通过不同版本的虚拟机（JVM）进行解释执行，JVM与操作系统交互
 *         2.半编译半解释：先编译后运行
 *         3.简单：相对于c++少了指针功能
 *         4.健壮：通过垃圾回收机制对内存进行管理，保证了语言的健壮性
 *         5.安全：封装特性
 *         6.多线程：支持多线程并发处理
 */
/**当前是文件级别的注释
 * 
 */
//这是行级别的注释
/*
 * 这是多行注释
 */

public class HelloWorld {
	//java文件 public是修饰符 class代表这个文件是类 文件名{}
	//java程序需要入口 叫main方法
	//Alt/ 提示
	public static void main(String[] args){
		System.out.print("hello world");
	}
	
	
	
}
