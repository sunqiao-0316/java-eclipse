package com.neuedu.part09;

import java.util.Calendar;

public class Test0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出当前的月历
		Calendar instance = Calendar.getInstance();
		int maximum = instance.getMaximum(Calendar.DATE);//获得当前月的最大天
		instance.set(Calendar.DATE, 1);//设置代表的日期为1号
		int start=instance.get(Calendar.DAY_OF_WEEK)-1;//获得1号是星期几
		System.out.println("一     二     三     四     五     六     日");
		System.out.print("            ");
		for(int i=1;i<=maximum;i++){
			if(i<10){
				System.out.print(" "+i+" ");
			}
			else{
				System.out.print(i+" ");
			}
			if((start+i-1)%7==0){//逢七换行
				System.out.println();
			}
		}

	}

}
