package com.neuedu.part02;

import java.util.Scanner;

/**
 * java�����
 * �����������+-*��/��%��������Ϊ����Ϊ����
 *         ++ -- ++�����ȼӺ���   ����++���ú��
 * ��ֵ�����
 * ��ϵ�������<,>,<=,>=,==,!=
 * �߼��������������������͵������в�������
 * &&�߼���  ||�߼���  &���߼���
 * �������ڶ�·����
 * ��Ŀ�������������Ԫ���ʽ��������ʽ1Ϊ�棬��������ʽ2������������ʽ3
 * ���ʽ1�����ʽ2:���ʽ3
 */

public class Test0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		
		System.out.println(i++);//���0
		System.out.println(i);//���1
		System.out.println(++i);//���1
		
		System.out.println(i++ + ++i);//ִ��i++ʱiΪ0 ִ��+ʱiΪ1 ִ��++iʱiΪ2 ��0+2=2�����2 ���ʽ���������Ҳ����Ӱ��
        System.out.println("�ַ�������"+i);//����ַ�������2
        System.out.println("�ַ�������"+i+ ++i);//���23
        System.out.println("�ַ�������"+(i+ ++i));//���5
        
        int x1 = 3, y1 = 5;
        int x2 = 3, y2 = 5;
        int r1, r2;
        r1 = x1++ + x1*y1;//x1++=3 x1=4 y1=5 r1=23
        r2 = ++x2 + x2*y2;//++x2=4 x2=4 y2=5 r2=24
        System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
        System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
        
        x1=x1+3;
        x1+=3;
        System.out.println(x1);
        
        System.out.println(x1==x2);
        System.out.println(x1!=x2);
        
        boolean flag=true,flag1=false;
        System.out.println(flag&&flag1);
        System.out.println(flag||flag1);
        System.out.println(flag^flag1);
        
        System.out.println(1>2?3-1:4+1);
        
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        System.out.println("�ɿ���̨�����ֵΪ��"+c);
	}

}
