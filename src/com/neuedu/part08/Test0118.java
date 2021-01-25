package com.neuedu.part08;
/**
 * 异常处理
 * 程序运行过程中发生的非正常现象（错误）
 * 1.异常的分支种类:
 * Throwable➡Error 栈溢出、堆溢出问题，不属于异常范围内
 *   ⬇
 * Exception➡IOException 编译时异常（在程序需运行之前编译时需要处理的异常）（检查性异常）
 *   ⬇
 * runtimeException 运行时异常（非检查性异常）
 *   ⬇
 * NullPointerException 空指针异常
 * ArrayIndexOutOfBoundsException 数组越界异常
 * ArithmeticException 算术异常
 * 异常会中断程序方法的运行，所以需要处理,处理之后不影响后续代码执行
 * 2.异常的处理
 * try/catch
 * try{需要处理的代码}catch(需要捕获的异常类型){如果捕获到了对应异常，该走的代码逻辑}
 * 若代码发生异常，会判断异常属于哪种类型，然后执行对应的代码
 * 注意：try/catch是一个整体，不能单独写；try中含多行代码时，发生多处异常，此时第一个异常发生且被捕获的处理,且不会再回try
 * catch中的异常可以有多个，用|相隔，只能有一个引用名
 * try/catch是可以嵌套的
 * finally{}当try/catch进行异常处理时，把一定要执行的代码放在finally子句中进行执行,放在最后一般用来关闭流
 * try/finally可以省略catch
 * throws关键字 异常向上抛，向调用存在异常的方法的地方抛
 * 在方法头后面大括号前面写throws关键字加异常类型，多个异常之间用逗号隔开，抛出的异常需要调用的地方处理，不处理则再抛出，直到处理
 * throw关键字创建异常
 * 自己处理完的异常还要往上抛的时候
 * 
 *
 */

public class Test0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		String string=null;
		int[] arr=new int[4];
		try{

			string.equals("111");
			System.out.println(i/0);
		}catch(ArithmeticException|NullPointerException e){
			try{
				arr[4]=0;
			}catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("数组越界异常");
			
	        }
				e.printStackTrace();
				System.out.println("异常");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("其它异常");
			}finally{
				System.out.println("1");
			}
			
		System.out.println("hello");
		
		doException(i);

	}
	public static void doException(int i) throws ArithmeticException{
		System.out.println(i/0);
	}

}
