package com.neuedu.part06;
/**
 * 面向对象基础
 * 类是一个模板，把相似的一类特定种类的对象归为一类，可以通过类定义这一类对象的属性和行为
 * 1.类创建过程：先写属性，类中的方法里都可以直接使用，不用初始化（属性有默认值，是全局变量；方法中的变量只在对应作用域中使用，是局部变量）
 * 2.类的结构
 * [public][abstract|final]class 类名[extends父类][implements接口列表]{属性声明及初始化；方法声明及方法体}
 * 3.对象：类的实际个体（实例）
 * 实例化
 * 4.构造方法：是一种特殊的方法，用来初始化类的属性，方法名与类名相同[访问控制符]类名（参数列表）{//方法体}
 * 作用：可以通过构造方法，完成对象的创建
 *     通过有参的构造方法完成对象属性的初始化
 * 注意：构造方法可以重载
 *     当存在有参的构造方法时，默认无参的构造方法就不在了，如果需要用无参则定义出来
 * 5.this关键字:代表当前对象，不做区分时可以省略；在方法中可以理解为调用当前方法的对象
 * this()可以在构造器中使用，可以调用另一个构造方法(一般用无参构造调用有参构造，创建默认值)
 * 只能在构造方法中通过this来调用其他构造方法，普通方法中不能使用。
 * 6.匿名对象：在创建对象时，不定义对象的句柄，而直接调用这个对象的方法
 * 7.变量的作用域
 * 局部变量：定义在方法体中的变量；或是方法的形参。
 * 实例变量：即类的属性，也是类内的全局变量。
 * 静态变量：在类中声明为static 的属性。
 * 作用域：
 * 类变量：用static修饰的属性，它们在类被载入时创建，只要类存在，static变量就存在
 * 实例变量：类体中声明的属性为全局变量，全局变量在类的整个生命周期中都有效。
 * 局部变量：方法体中声明的变量，方法中的参数，或代码块中声明的变量，都是局部变量，局部变量只在方法调用的过程中有效，方法调用结束后失效。
 * 垃圾回收机制：程序运行过程中由一个低优先级线程（gc）进行处理（人为控制不了）
 * 一旦运行该线程，会寻找没有引用的对象，调用该对象的finalize（）方法，执行垃圾回收机制进行回收
 * object类 所有类默认继承的父亲
 *
 */

public class Test0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Employee epl=new Employee();//类名 对象名 new 构造器
		//通过引用去操作对应对象的属性和方法
		epl.age=21;
		epl.name="小琳";
		epl.showAge();
		epl.showName();
		epl.updateName("琳琳");
		
		Employee epl1=new Employee("蔡小葵",22,1);
		System.out.println(epl1.showName());
		
		Employee epl2=new Employee("蔡小葵",22);
		epl2.getSal();
		
		/*
		//提醒操作 垃圾回收操作提醒
		System.gc();
		System.runFinalization();*/
		
		//匿名对象
		int age=new Employee("丸子",24).showAge();
		
		//
		Employee[] aemp=new Employee[50];
		for(int i=0;i<aemp.length;i++){
			aemp[i]=new Employee();
		}
		for(Employee item:aemp){
			System.out.println(item);
		}

	}

}
