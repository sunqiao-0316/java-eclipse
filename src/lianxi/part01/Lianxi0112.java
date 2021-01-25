package lianxi.part01;

import java.util.Scanner;

public class Lianxi0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//录入同学数和成绩，计算及格率，如果及格率在百分之60以下，则为不及格同学+2分直到及格率过百分之60，最后输出及格率
	/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入同学数");
		int stu=scanner.nextInt();
		System.out.println("输入成绩");
		int[] a=new int[stu];
		double j=0;
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		//统计及格人数
		
		for(int i=0;i<stu;i++){
			if(a[i]>=60){
				j++;
			}
		}
		
		double rate=j/stu;
		while(true){
			if(rate<0.6){
				for(int i=0;i<stu;i++){
					if(a[i]<60){
						a[i]=a[i]+2;
						if(a[i]>=60){
							j++;
						}
					}
				}
			}
			else{
				
				System.out.println("及格率"+rate);
				break;
			}
		}
		*/
		
		
		//跳一跳：从前方快跳到下一个方块，如果没有跳到下一个方块则游戏结束
		//跳到了方块上，但没到中心则+1分；跳到中心时，若上一局为+1分则此次+2分，否则比上一次多2分
		Scanner scanner=new Scanner(System.in);
		int len=scanner.nextInt();
		int[] a=new int[len];
		int s=0;
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				s+=a[i];
			}
			else if(a[i]==0){
				System.out.println("over");
				break;
			}
		}
		System.out.println(s);

	}

}
