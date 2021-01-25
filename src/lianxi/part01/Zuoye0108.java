package lianxi.part01;

import java.util.Scanner;

public class Zuoye0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//母鸡3元/只，公鸡4元/只，小鸡0.5元/只，如果花100元钱买100只鸡，每一种鸡可以买0只，请问有哪些可能？
		//方法一：每种鸡都有0~100只的可能，求出所有可能只数
		for(int woman=0;woman<=100;woman++){
			for(int man=0;man<=100;man++){
				for(int child=0;child<=100;child++){
					if(3*woman+4*man+0.5*child==100&&woman+man+child==100){
						System.out.println(woman+" "+man+" "+child);
					}
				}
			}
		}
		//方法二：母鸡最多可以买33只，公鸡最多可以买24只，小鸡=100-公鸡-母鸡
		for(int woman1=0;woman1<=33;woman1++){
			for(int man1=0;man1<=25;man1++){
				int child1=100-woman1-man1;
				if(3*woman1+4*man1+0.5*child1==100){
					System.out.println(woman1+" "+man1+" "+child1);
				}
			}
		}
		
		//企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
		//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		//20万到40万之间时，高于20万元的部分，可提成5%；
		//40万到60万之间时高于40万元的部分，可提成3%；
		//60万到100万之间时，高于60万元的部分，可提成1.5%，
		//高于100万元时，超过100万元的部分按1%提成，
		//在程序中设定一个变量为当月利润，求应发放奖金总数？
		Scanner scanner=new Scanner(System.in);
		double bonus;//奖金
		System.out.println("输入利润");
		int profit=scanner.nextInt();//利润
		if(profit<=100000){
			bonus=profit*0.1;
		}
		else if(profit<=200000&&profit>100000){
			bonus=100000*0.1+(profit-100000)*0.075;
		}
		else if(profit<=400000&&profit>200000){
			bonus=100000*0.1+100000*0.075+(profit-200000)*0.05;
		}
		else if(profit<=600000&&profit>400000){
			bonus=100000*0.1+100000*0.075+200000*0.05+(profit-400000)*0.03;
		}
		else if(profit<=1000000&&profit>600000){
			bonus=100000*0.1+100000*0.075+200000*0.05+200000*0.03+(profit-600000)*0.015;
		}
		else {
			bonus=100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(profit-1000000)*0.01;
		}
		System.out.println(bonus);
		
		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321
		System.out.println("输入4位整数");
		int shu=scanner.nextInt();
		if(shu>=1000){
		int q=shu/1000%10;
		int b=shu/100%10;
		int s=shu/10%10;
		int g=shu%10;
		int x1=q;
		q=g;
		g=x1;
		int x2=b;
		b=s;
		s=x2;
		System.out.println(q+""+b+""+s+""+g);
		}
		else{
			System.out.println("错误");
		}

	}

}
