package com.neuedu.part04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ����
 * ��������ͬ���͵����ݰ���һ��˳�������һ�����������
 * �����������ͣ��Ե�ַ��ʽ��ű���
 * ���壺1.���徲̬���飺�������͡��� ����={��ŵ���ͬ���͵�ֵ1��ֵ2...}�����������ƺ���Ҳ���ԣ�
 *     2.���嶯̬���飺�������͡��� ����=new �������͡������С��
 * ���������
 * 1.ð������˫��ѭ��
 * 2.java�ײ�������ṩ������ʽ    Arrays.sort(����)
 * ����Ĳ���
 * 
 *
 * �����⣺�ٳ��㳣���������쳣����
 */

public class Test0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		char c='A';
		//��������1
		int[] arr={3,2,2,5,5,7,9,9,100,0};//��new������
		System.out.println(arr);//�����ַ
		//����ȡֵ��ʽ��ͨ��ֵ��λ�ã��±꣩��ȡֵindex,��0��ʼ
		System.out.println(arr[1]);
		
		//��������2
		//�������������ݶ�������͸���Ĭ��ֵ��intĬ��0��charĬ�Ͽ��ַ�
		int[] arr2=new int[60];
		System.out.println(arr2[59]);
		//��ֵ
		arr2[0]=1;
		arr2[1]=2;
		
		
		
		//����ĸ�ֵ��ȡֵ1~60������
		int j=2;
		for(int i=0;i<60;i++){
			arr2[i]=j;
			j++;
		}
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){//����鿴��ѭ���鿴������ı�����
			System.out.print(arr2[i]+" ");
		}
		
		//����arr2��ƽ��ֵ
		double sum=0;
		for(int i=0;i<arr2.length;i++){
			sum+=arr2[i];
		}
		System.out.println(sum);
		
		//����arr�����ֵ����Сֵ
		int min=arr[0];//ȡ��һλΪ������
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
		
		//��������� ����
		int[] arr3={12,3,14,5,17,29,45,0,100};
		for(int i=1;i<arr3.length;i++){//���������������-1
			for(int k=0;k<arr3.length-i-1;k++){//ÿһ�˱ȽϵĴ���������-i
				if(arr3[k+1]<arr3[k]){//��ΪҪ�Ƚϵ�arr[7+1]<arr[7]��������forѭ��ֻѭ����7
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
		
		//���� ��ǿfor(���ͱ���������Ҫ������Ŀ��)������������ÿ�α�����ֵ
		int[] arrtest1={1,2,3};
		Arrays.sort(arrtest1);//Ĭ������
		for(int item:arrtest1){
			System.out.println(item);
		}
		*/
		//�������:���ַ�
		//���ַ�����ǰ����Ҫ����
		int[] arr4={12,3,14,5,17,29,45,0,100};
		Scanner scanner=new Scanner(System.in);
		System.out.println("����Ԥ��ֵ");
		int expect=scanner.nextInt();
		int min=0;
		int max=arr4.length-1;//�������±�
		while(max>=min){
			int mid=(min+max)/2;
			if(expect>arr4[mid]){
				min=mid+1;
			}
			else if(expect<arr4[mid]){
				max=mid-1;
			}
			else{
				System.out.println("�ҵ���"+expect+"�±�λ"+mid);
				break;
			}
		}
		if(max<min){
			System.out.println("Ԥ��ֵû���ҵ�");
		}
		
		//java�Դ��Ķ��ַ�
		/*
		int binarySearch=Arrays.binarySearch(arr4, 100);
		System.out.println(binarySearch);
		*/
		
		//����ĸ���
		/*
		int[] arrCopy=new int[arr4.length];
		for(int i=0;i<arr4.length;i++){
			arrCopy[i]=arr4[i];
		}
		
		//java�Դ�����
		System.arraycopy(arr4, 0, arrCopy, 0, arr4.length);
		*/
		
		//���������
		Random random=new Random();
		random.nextInt(100);//0~99
		
		//��ά���飺����������
		int[][] a={{1,2,3},{2,3,4},{3,4,5},{5,6,7}};//a[4][3]
		

	}

}
