package lianxi.part01;

import java.util.Random;

public class Lianxi0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Random random=new Random();
		System.out.println("BANG!!!!");
		int i=random.nextInt(10);
		System.out.println(i);
		int[] T=new int[70];
		int[] H=new int[70];
		int k=1;
		for(int j=0;j<70;j++){
			T[j]=k;
			k++;
		}
		k=0;
		for(int m=0;m<70;m++){
			H[m]=k;
			k++;
		}
		for(int n=0;n<70;n++){
		if(i<=5&&i>=1){
			T[n]=T[n+3];
		}
		else if(i<=7&&i>=6){
			if(n>=6){
				T[n]=T[n-6];
			}
			else{
				T[n]=T[0];
			}
		}
		else if(i<=10&&i>=8){
			T[n]=T[n+1];
		}
		System.out.print(T[n]+" ");
		if(i<=4&&i>=3){
			H[n]=H[n+9];
		}
		else if(i==5){
			if(n>=12){
				H[n]=H[n-12];
			}
			else{
				H[n]=H[0];
			}
		}
		else if(i<=8&&i>=6){
			H[n]=H[n+1];
		}
		else if(i<=10&&i>=9){
			if(n>=2){
				H[n]=H[n-2];
			}
			else{
				H[n]=H[0];
			}
		}
		System.out.print(H[n]+" ");
		if(H[n]==T[n]){
			System.out.println("OUCH！！！");
		}
		System.out.print(",");
		if(T[n]>=T[69]){
			System.out.println("乌龟胜");
			break;
		}
		if(H[n]>=H[69]){
			System.out.println("兔子胜");
			break;
		}
			
		}
		*/
		
		//每秒执行1次（线程休眠1s）
		Random r=new Random();
		String[] str=new String[70];//定义赛道
		System.out.println("BANG!!!!");//初始化场景
		for(int i=0;i<str.length;i++){
			if(i==0){
				str[i]="(T/H)";//代表同一起点
			}
			else{
				str[i]="-";//初始化赛道
			}
		}
		for(String item:str){//输出轨迹
			System.out.print(item);
		}
		int wg=0;//乌龟初始化位置
		int tz=0;//兔子初始化位置
		while(true){
			System.out.println();
			//每次重置赛道
			for(int i=0;i<str.length;i++){
			str[i]="-";}
			//做一个定时器
			try {
				Thread.sleep(1000);//Tread类的睡眠方法 毫秒单位
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//生成随机数
			int wgi=r.nextInt(10);
			int tzi=r.nextInt(10);
			if(wgi<=4&&wgi>=0){
				wg+=3;
			}
			else if(wgi>=5&&wgi<=6){
				wg-=6;
				if(wgi<0){
					wg=0;
				}
			}
			else if(wgi>=7&&wgi<=9){
				wg+=1;
			}
			
			if(tzi<=3&&tzi>=2){
				tz+=9;
			}
			else if(tzi==4){
				tz-=12;
				if(tz<0){
					tz=0;
				}
			}
			else if(tzi>=5&&tzi<=7){
				tz+=1;
			}
			else if(tzi>=8&&tzi<=9){
				tz-=1;
				if(tz<0){
					tz=0;
				}
			}
			
			if(wg!=tz&&wg>=69){//乌龟赢
				System.out.println("乌龟胜");
				break;
			}
			else if(wg!=tz&&tz>=69){//兔子赢
				System.out.println("兔子胜");
				break;
			}
			else if(wg==tz&&wg>=69){//表扬乌龟
				System.out.println("表扬乌龟");
				break;
			}
			//没结束时输出轨迹
			for(int i=0;i<str.length;i++){
				if(wg==tz){
					str[i]="O";//同位置
				}
				else if(i==wg){
					str[i]="T";//乌龟轨迹
				}
				else if(i==tz){
					str[i]="H";//兔子轨迹
				}
			}
			//输出轨迹
			for(String item:str){
				System.out.print(item);
			}
		 System.out.println();
		}

	}

}
