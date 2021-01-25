package com.neuedu.part07;
import com.neuedu.part06.*;//导入包
import java.util.Scanner;//导入包中的scanner类
/**
 * 面向对象的高级特性：继承 封装 多态
 * 1.继承：编码更高效，易维护，代码重用
 * 子类(派生类)继承父类(超类)：可以继承父类的属性、方法，一般用于子类新功能扩展，一个类只能继承一个父类，一个父类可以有多个子类
 * 子类名 extends 父类名{}
 * 子类实例化时，会先调用父类的构造方法进行实例化，再调用子类自己的构造方法
 * super关键字代表当前对象的父类对象
 * super()代表父类构造方法，需要放在子类构造函数第一句，不能和this()同时存在
 * 面试题：子类实例化顺序：先构造父类后构造子类
 * 2.包名和类名组成全类名:com.neuedu.part07.Test0114/
 * import.导入的包名.类名
 * java.lang包下的类不需要导入，可以直接使用
 * 导入其它包时，只能导入public修饰的类
 * 3.封装
 * public 范围最大
 * protected 能在当前类和同一包中使用，在不同包中时继承则可以使用，可以修饰属性和方法
 * default 默认的 只能在当前类和同一包中的类进行使用
 * private 私有的 只能在当前类使用，通常用来修饰属性
 * 类只能用public或者默认
 * 带有可见性修饰符的变量是类的成员，而不是方法的局部变量
 * 4.构造器方法
 * 由于属性的私有化，需要特定提供读取和赋值的方式，把这种方法称为构造器方法
 * 读取getter：public 返回值类型 get属性名(){ return 属性名； }
 * 赋值setter：public void set属性名(数据类型参数值){ 属性名 = 参数值； }
 * 需要自动创建构造器方式：在指定的类，右键点击source选中generate getterssetters 
 * 5.方法的覆盖
 * 子类重写父类的方法叫覆盖
 * 覆盖的规则：需要有相同的方法名
 *         需要有完全一致的参数
 *         返回值类型相同
 *         父类被覆盖方法权限小于等于子类方法
 * 面试题：方法重载和方法覆盖的区别
 * 重载是同一类的水平关系，覆盖是父子类的垂直关系，再分别介绍重载的规则和覆盖的规则
 * 6.引用数据类型转换
 * 向上转型：子类转换成父类，自动转换
 * 需要有子父类继承关系，转换之后会丢失子类扩展的属性和行为
 * 向下转型：父类显示的转换成子类，强制转换
 * 只有经历过向上转型，才能向下转型
 * instanceOf关键字
 * 判断向上转型后的对象属于哪个类
 *
 */

public class Test0114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITworker itworker=new ITworker("java",500,"mark","20",10);//子类实例化过程仍然可以调用父类方法
		
		itworker.getAll();
		itworker.jiaban();
		Employee e=new Employee();
		com.neuedu.part06.Employee e1=new com.neuedu.part06.Employee();//创建包6的打工人类对象
		pro();
	}
	
	protected static void pro(){
		System.out.println("这是potected修饰的类");
		
		ITworker itworker=new ITworker();
		itworker.getAll();
	}
	
	
	//引用数据类型转换
	//向上转型
	Employee employee=new ITworker();//子类转换为父类
	//向下转型
	ITworker itworker=(ITworker) employee;//父类转为子类

}
class Employee{//打工人类
	String name;
	String birth;
	private String age;
	private double salary;//属性私有化
	//构造器方法
	public double getSalary1(){//读取getter方法
		return this.salary;
	}
	public void setSalary1(double salary){//设置setter方法
		this.salary=salary;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	public Employee(){
		System.out.println("这是父类构造方法");
	}
	public Employee(String name,String birth,double salary){
		this.name=name;
		this.birth=birth;
		this.salary=salary;
	}
	public void getAll(){
		System.out.print("name is "+name+"  birth is "+birth+"  salary is "+salary);
		System.out.println();
	}
	public double getSalary(){
		System.out.println("salary is"+salary);
		return salary;
	}
}




class ITworker extends Employee{//程序员类,继承打工人类
	String ltype;//语言种类
	int code;//每天写的代码数
	public ITworker(String ltype,int code,String name,String birth,double salary){
		super(name,birth,salary);
		this.ltype=ltype;
		this.code=code;
	}
	public ITworker(){
		System.out.println("这是子类构造方法");
	}
	public void jiaban(){
		System.out.println(super.name+"使用"+ltype+" "+code);
	}
	public void nianling(){
		System.out.println(super.getAge());
	}
	
	//方法覆盖
	@Override
	public void getAll(){
		System.out.print("name is "+name+"  birth is "+birth+"  salary is "+getSalary()+"语言是"+ltype);
		System.out.println();
		
	}
}