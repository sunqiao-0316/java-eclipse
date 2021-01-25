package lianxi.part01;

import java.util.Scanner;

public class Lianxi0109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出1-100内的所有偶数
		/*
		for(int ev=1;ev<=100;ev++){
			if(ev%2==0){
				System.out.print(ev);
			}
			System.out.print('\t');
		}
		System.out.println();
		//求整数1~100的累加值，跳过所有个位为3的数
		int s=0;
		for(int nu=1;nu<=100;nu++){
			if(nu%10!=3){
			s+=nu;	
			}
		}
		System.out.println(s);
		
		//输出式子
		for(int i=1;i<=20;i++){
			int op1=2*i;
			int op2=5*i;
			int s2=op1*op2;
			System.out.println(op1+"*"+op2+"="+s2);
		}
		
		//一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13 米）？
		double depth=0.08;//纸的厚度
		int n=1;
		while(depth<8848130.00){
			depth*=2;
			n++;
		}
		System.out.println(n);
		
		//接收用户输入的一个整数，判断它是奇数还是偶数
		Scanner scanner=new Scanner(System.in);
		int nu1=scanner.nextInt();
		if(nu1%2==0){
			System.out.println("是偶数");
		}
		else if(nu1%2!=0){
			System.out.println("是奇数");
		}
		*/
		//使用循环语句计算20的阶乘。20！
		/*
		long fa=1L;
		for(int nu2=2;nu2<=20;nu2++){
			fa=fa*nu2;
		}
		System.out.println("20的阶乘="+fa);
		
		//让用户输入一个字符，判断他是小写字母还是大写字母，如果是小写字母的话，就转换成大写字母输出
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		if(ch<='z'&&ch>='a'){
			ch=(char) (ch-32);
			System.out.println(ch);
		}
		else if(ch<='Z'&&ch>='A'){
			System.out.println(ch);
		}
		else{
			System.out.println("错误");
		}
		
		//用 while 循环，计算 1~200 之间所有 3 的倍数之和
		int nu3=1;
		int s3=0;
		while(nu3<=20){
			if(nu3%3==0){
				s3+=nu3;
			}
			nu3++;
		}
		System.out.println(s3);	
		*/
		
		//输出 200~500 之间的所有素数 除了1及自身以外不能被整除的数
		/*
		boolean bl;
		for(int nu4=1;nu4<=10;nu4++){
			bl=true;
			for(int nu5=2;nu5<nu4;nu5++){
				if(nu4%nu5==0){
					bl=false;
				}
			}
			if(bl){
				System.out.println(nu4);
			}
		}
		int count=0;
		for(int su=1;su<=10;su++){
			count=0;
			for(int su1=2;su1<su;su1++){
				if(su%su1==0){
					count++;
				}
			}
			if(count==0){
				System.out.println(su);
			}
		}
		*/
		
		//猜数字，随机生成一个数字，让用户猜大小，然后提示猜大了或者猜小了，猜不中让用户一直猜，直到用户猜中，游戏结束，就不需要继续猜了
		//通过Math.random()随机生成一个数字
		int x=(int)(Math.random()*10);//随机生成一个数字
		System.out.println("猜数字");
		Scanner scanner=new Scanner(System.in);
		while(true){
			int y=scanner.nextInt();
			if(y>x){
				System.out.println("猜大了");
			}
			else if(y<x){
				System.out.println("猜小了");
			}
			else{
				System.out.println("猜中了");
				break;
			}
		}
		
		
	}
}
