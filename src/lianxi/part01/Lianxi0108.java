package lianxi.part01;

import java.util.Scanner;

public class Lianxi0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入两个数，输出他们最大公约数
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入两个数");
		int result=0;
		int first=scanner.nextInt();
		int last=scanner.nextInt();
		for(int m=2;m<first&&m<last;m++){
			if(first%m==0&&last%m==0){
				result=m;
			}
		}
		System.out.println(result);
		*/
		//输出1000以内所有水仙花数narcissus
		/*
		for(int shuixian=100;shuixian<1000;shuixian++){
			int bai=shuixian/100%10;
			int shi=shuixian/10%10;
			int ge=shuixian%10;
			if(shuixian==bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println(shuixian);
			}
		}
		*/
		//猴子第一天摘下若干个桃子，当即吃了一半，
		//还不瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		//以后每天早上都吃了前一天剩下的一半零一个。
		//到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
		/*
		int tao=1;
		for(int da=9;da>=1;da--){
			tao=2*tao+2;
		}
		System.out.println(tao);
		*/

	}

}
