package com.neuedu.part09;

import java.util.UUID;

/**
 * 1.java ����API
 * java.awt java����ͼ�ι���
 * java.IO java�������ļ�����
 * java.lang java������
 * java.net ����ͨ�ţ�����TCP/IPЭ�� ���ԣ�1.�˽�http/https���� 2.TCP/IPЭ���ص�
 * java.sql ���ϵ�����ݿ⽻���Ĺ�����
 * java.util java���ù�����
 * 2.object ������ĸ���
 * ���һ������ʱ��Ĭ�ϻ��������toString����
 * ���õ�3��toString(),equals(),hashCode()
 * 3.��װ��
 * Ϊ���û�����������Ҳ�ܾ߱������������ԣ��̳з�װ��̬���ṩ�˰�װ��ĸ���
 * ��̳�comparable�ӿڣ�ʵ�������comparable������������Ϊ����ȽϹ��ߣ�����ֵint
 * �������ͺͰ�װ���ת��
 * ��Ӧ��ϵ�£�������������ת��Ϊ��װ�࣬ͨ��new����
 * ��װ��ת��Ϊ�����������ͣ�ͨ������.������������Value()����
 * �������Զ�װ���Զ�����ĸ���
 * �ַ����Ͱ�װ��ת��:��װ��ת�ַ��������ö�Ӧ��toString����
 *              �ַ���ת��װ��,������ͨ����װ��������ת�������߰�װ��.ValueOf(��Ҫת�����ַ���)
 * �ַ����ͻ�����������ת�����ַ���ת����ͨ����Ӧ�İ�װ����ø��Ե�parsexxx�������Ƕ�Ӧ�ַ���������������������������쳣
 *
 */

public class Test0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ѧ�������
		Student student=new Student();
		student.setStuname("lin");
		student.setScore(20);
		student.setStuAge(19);
		student.setStuNO(UUID.randomUUID().toString());
		System.out.println(student);
		Student student1=new Student();
		student1.setStuname("kui");
		student1.setScore(30);
		student1.setStuAge(18);
		student1.setStuNO(UUID.randomUUID().toString());
		System.out.println(student.equals(student1));//���÷���ʱ��student��Ĳ�������object�����У��Զ���������ת��
		
		Integer integer=new Integer(10);//��װ��
		//������������
		String str="111";
		int m=100;
		Integer in=new Integer(m);//������������ת��װ��
		int i=integer.intValue();//��װ��תΪ������������
		Long long1=new Long(100000L);//����һ��Long��װ�����
		long l=long1.longValue();//��װ��תΪ������������
		
		
		//��װ��ת�ַ���
		int n=10;
		Integer integer1=new Integer(n);
		String strInt=integer1.toString();
		System.out.println(strInt);
		
		//�ַ���ת��װ��
		String str3="112";
		Integer in2=Integer.valueOf(str3);
		
		//�ַ���תΪ������������
		int s1=Integer.parseInt(str);//����1
		int s2=Integer.valueOf(str);//����2
		//������������ת�ַ���
		int j=10;
		String str1=Integer.toString(j);//����1
		String str2=String.valueOf(j);//����2

		
		
		
	}

}
