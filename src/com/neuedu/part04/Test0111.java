package com.neuedu.part04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 数组
 * 数组是相同类型的数据按照一定顺序组合在一起的引用类型
 * 引用数据类型：以地址形式存放变量
 * 定义：1.定义静态数组：数据类型【】 名称={存放的相同类型的值1，值2...}（【】放名称后面也可以）
 *     2.定义动态数组：数据类型【】 名称=new 数据类型【数组大小】
 * 数组的排序
 * 1.冒泡排序：双层循环
 * 2.java底层给我们提供的排序方式    Arrays.sort(名称)
 * 数组的查找
 * 
 *
 * 面试题：举出你常见的五种异常类型
 */

public class Test0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		char c='A';
		//定义数组1
		int[] arr={3,2,2,5,5,7,9,9,100,0};//把new隐藏了
		System.out.println(arr);//输出地址
		//数组取值方式：通过值的位置（下标）来取值index,从0开始
		System.out.println(arr[1]);
		
		//定义数组2
		//定义好数组后会根据定义的类型赋予默认值：int默认0，char默认空字符
		int[] arr2=new int[60];
		System.out.println(arr2[59]);
		//赋值
		arr2[0]=1;
		arr2[1]=2;
		
		
		
		//数组的赋值和取值1~60个数字
		int j=2;
		for(int i=0;i<60;i++){
			arr2[i]=j;
			j++;
		}
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){//数组查看：循环查看（数组的遍历）
			System.out.print(arr2[i]+" ");
		}
		
		//计算arr2的平均值
		double sum=0;
		for(int i=0;i<arr2.length;i++){
			sum+=arr2[i];
		}
		System.out.println(sum);
		
		//计算arr的最大值和最小值
		int min=arr[0];//取第一位为参照数
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(max+" "+min);
		
		//数组的排序 升序
		int[] arr3={12,3,14,5,17,29,45,0,100};
		for(int i=1;i<arr3.length;i++){//排序的趟数：长度-1
			for(int k=0;k<arr3.length-i-1;k++){//每一趟比较的次数：长度-i
				if(arr3[k+1]<arr3[k]){//因为要比较到arr[7+1]<arr[7]所以上面for循环只循环到7
					int temp=arr3[k+1];
					arr3[k+1]=arr3[k];
					arr3[k]=temp;
				}
			}
		}
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		
		//{}
		int[] arrtest={-10,2,3,246,-100,0,5};
		max=arrtest[0];
		min=arrtest[0];
		sum=arrtest[0];
		for(int i=0;i<arrtest.length;i++){
			if(arrtest[i]>max){
				max=arrtest[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<arrtest.length-1;i++){
			for(int k=0;k<arrtest.length-i-1;k++){
				if(arrtest[k+1]<arrtest[k]){
					int temp1;
					temp1=arrtest[k+1];
					arrtest[k+1]=arrtest[k];
					arrtest[k]=temp1;
				}
				for(int m=0;m<arrtest.length;m++){
					System.out.println(arrtest[m]);
				}
				
			}
		}
		
		//遍历 加强for(类型变量名：需要遍历的目标)遍历用来代表每次遍历的值
		int[] arrtest1={1,2,3};
		Arrays.sort(arrtest1);//默认升序
		for(int item:arrtest1){
			System.out.println(item);
		}
		*/
		//数组查找:二分法
		//二分法查找前提是要排序
		int[] arr4={12,3,14,5,17,29,45,0,100};
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入预期值");
		int expect=scanner.nextInt();
		int min=0;
		int max=arr4.length-1;//定义是下标
		while(max>=min){
			int mid=(min+max)/2;
			if(expect>arr4[mid]){
				min=mid+1;
			}
			else if(expect<arr4[mid]){
				max=mid-1;
			}
			else{
				System.out.println("找到了"+expect+"下标位"+mid);
				break;
			}
		}
		if(max<min){
			System.out.println("预期值没有找到");
		}
		
		//java自带的二分法
		/*
		int binarySearch=Arrays.binarySearch(arr4, 100);
		System.out.println(binarySearch);
		*/
		
		//数组的复制
		/*
		int[] arrCopy=new int[arr4.length];
		for(int i=0;i<arr4.length;i++){
			arrCopy[i]=arr4[i];
		}
		
		//java自带复制
		System.arraycopy(arr4, 0, arrCopy, 0, arr4.length);
		*/
		
		//随机数生成
		Random random=new Random();
		random.nextInt(100);//0~99
		
		//二维数组：数组套数组
		int[][] a={{1,2,3},{2,3,4},{3,4,5},{5,6,7}};//a[4][3]
		

	}

}
