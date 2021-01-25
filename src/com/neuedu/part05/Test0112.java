package com.neuedu.part05;
/**
 * 方法的定义和调用
 * 方法是定义好的，具有独立功能，可重复调用的，为了简化代码存在，在面向对象程序设计中，方法一般用来描述对象的动作和行为
 * 方法的组成：
 * 方法头 方法体【访问权限控制符】【修饰符】返回值类型 方法名（参数类型 参数名，参数类型 参数名...）{方法体}
 * 1.返回值类型：如果没有返回值写void
 * 2.当方法调用传递参数为基本数据类型时：传值拷贝过程
 *   当方法调用传递参数为引用数据类型时：返回地址，传引用过程（String特殊，因为本身不可变）
 * 3.参数类型
 *   方法头中定义带数据类型的参数：形式参数
 *   调用时实际传的值：实际参数
 * 
 * 方法的重载：在同一个类中，允许同时存在多个相同方法
 * 方法重载规则：1.方法名相同
 *          2.方法参数不同（参数个数或者参数类型不同）
 *          3.方法的返回值无所谓（可以相同，可以不相同）
 *  
 * 递归：一个方法自己调用自己
 *
 */

public class Test0112 {

	public static void main(String[] args) {//在静态方法调用的方法也只能是静态的
		// TODO Auto-generated method stub
		//5行6列
		outPrint(5,6);//5 6实参
		
		//计算两个数的最大值
		System.out.println(compare(1.0,2));
		
		//返回数值+2
		int i=2;
		int j=3;
		int add=add(j);
		System.out.println(add);
		System.out.println(j);//只能将值复制传过去，j本身不过去
		System.out.println(add(j));
		System.out.println(add==j);
		
		//调用一个方法，将数组赋值
		int[] arr=new int[5];
		input(arr);
		for(int item:arr){
			System.out.println(item);
		}
		
		String str="aaabbbccc";//是一个特殊的引用数据类型,输出的不是地址
		String str2=new String("aaabbbccc");
		
		//计算图形面积
		System.out.println(getArea(1.0));
		
		//求阶乘
		System.out.println(fac(5));
		
		System.out.println(fb(15));

	}
	
	//打印一个row行col列的*
	//没有返回值的写法 void
	//synchronized控制线程同步（修饰符）
	public static void outPrint(int row,int col){//形参
		
				for(int i=1;i<=row;i++){
					for(int j=1;j<=col;j++){
						System.out.print("*");
					}
					System.out.println();
				}
	}
	
	//计算两个数最大值
	public static int compare(int num1,int num2){
		return num1>num2?num1:num2;
	}
	//方法重载:根据参数不同，动态选择对应的方法进行运行
	public static double compare(double num1,double num2){
		return num1>num2?num1:num2;
	}
	
	//调用一次方法返回来对应数值+2
	public static int add(int j){
		j=j+2;
		return j;
	}
	
	//调用一个方法，将数组赋值
	public static void input(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=count++;
		}
	}
	
	//计算图形面积
	//圆，长方形，正方形
	public static double getArea(double radius){
		return radius*radius*3.14;
	}
    public static double getArea(int height,int width){
		return height*width;
	}
    public static double getArea(int len){
	    return len*len;
}
    
    //编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
    public static int fac(int n){
    	int result=1;
    	for(int i=1;i<=n;i++){
    		result*=i;
    	}
    	return result;
    }
    
    //用递归方法算阶乘
    public static int facdigui(int n){
    	if(n==2){
    		return 2;
    	}
    	else{
    		return n*=facdigui(n-1);
    	}
    	
    }
    
    //计算斐波那契数列的第16位（前两个数相加等于下一个数）
    //1，1，2，3，5，8，13，21
    public static int fb(int m){//n是第几个数
    	if(m==1||m==2){
    		return 1;
    	}
    	else{
    		return fb(m-1)+fb(m-2);
    	}
    }


}
