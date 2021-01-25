package com.neuedu.part09;

import java.util.Scanner;

/**
 * ����Ĭ�ϵ��ַ�����GBK�����ģ�GB2312
 * �ַ�����
 * 1.�ַ����ıȽϷ�����boolean equals()�ж��Ƿ����
 *             boolean equalsIgnoreCase()�Ƚ������ַ����������Ƿ���ȣ����Դ�С
 *             boolean startsWith()���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
 *             boolean endsWith()���Դ��ַ����Ƿ���ָ���ĺ�׺����
 * 2.�ַ����������ת��
 * �ַ�������ͨ��toCharArray()����ת��Ϊ����
 * ����ͨ���ַ���������������ת��Ϊ�ַ�����������ͨ���ַ�����String.valueof()����
 * 3.�ַ�����byte����ת��
 * ����ͨ��getBytes()�������byte����
 * 4.�ַ����ĳ��÷���
 * splitͨ��ָ�����ַ��������в��ԭ�ַ���Ϊһ���ַ�������
 * replace(���ַ��������ַ���)�����ַ����滻Ϊ���ַ���������һ�����ַ���
 * toUpperCase���ַ���ת���ɴ�д
 * toLowerCase���ַ���ת��ΪСд
 * charAt()����ָ����������charֵ
 * substring(b,e)��bλ�ÿ�ʼ��e-1λ�ý���������һ�����ַ���
 * indexOf(�ַ�/�ַ���)�����ַ����ַ������ڵ�λ�ã����û�з���-1
 * trim()�������ַ�������β�ո�
 *
 */

public class Test011902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ����Ƚ�
		String s1=new String("A");
		String s2="a";
		boolean b= s1.equalsIgnoreCase(s2);//���Դ�Сд
		System.out.println(b);
		
		System.out.println(s1.startsWith("a"));//���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
		System.out.println(s1.endsWith("a"));//���Դ��ַ����Ƿ���ָ���ĺ�׺����
		
		//�ַ���ת��Ϊ����
		char[] chararray=s2.toCharArray();
		for(char item:chararray){
			int a=item;
			System.out.println(a);
		}
		
		//���ַ���ת��Ϊ����
		String s3=new String(chararray);//����1
		String.valueOf(chararray);//����2
		
		//�ַ���ת��Ϊ�ֽ���
		String s4="java";
		byte[] bytes=s4.getBytes();
		System.out.println(bytes.length);
		
		//����ַ��������ݸ���������ʽ��ƥ���ִ��ַ���
		String s5="a,eqwe,hsbdu,snsqds,djfusn";
		String[] splitA=s5.split(",");
		for(String item:splitA){
			System.out.println(item);
		}
		
		//���ɵ��ַ����滻Ϊ�µ��ַ���
		String replace=s5.replace(",", "*");
		System.out.println(replace);
		
		//ת����Сд
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		//������������charֵ
		System.out.println(s5.charAt(s5.length()-1));
		
		//����һ�����ַ��������ַ����Ǵ�begin��ʼ���ַ���������
		System.out.println(s5.substring(5));
		
		//����һ�����ַ��������ַ����Ǵ�begin��ʼ��end-1�������ַ���������
		System.out.println(s5.substring(0,3));
		
		//����ָ���ַ��ڴ��ַ����е�һ��/���һ�γ��ִ�������
		System.out.println(s5.indexOf('e'));
		System.out.println(s5.lastIndexOf('e'));
		System.out.println(s5.indexOf("eqw"));
		
		//�����µ��ַ�����������β�ո�
		String s6="   shubsgd  jdhuiw ";
		System.out.println(s6.trim());
		
		//ͳ��һ���ַ������ַ�e���ֵĴ���
		String s7="nsaiuheefid";
		System.out.println(s7.length()-s7.replace("e", "").length());
		//�����һ���ַ����ڵڶ����ַ������ֵĴ���
		Scanner sc=new Scanner(System.in);
		System.out.println("�����һ���ַ���");
		String first=sc.nextLine();
		System.out.println("����ڶ����ַ���");
		String second=sc.nextLine();
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		
		//����һ�����䣬�жϸ�ʽ�Ƿ���ȷ
		while(true){
		System.out.println("����һ������");
		String mail=sc.nextLine();
		int length=mail.length();
		int indexof=mail.indexOf("@");
		int indexof2=mail.indexOf(".");
		if(indexof==-1||indexof==0||indexof==length-1){//û��@����@����ǰ�������
			System.out.println("false");
		}
		else if(indexof2==-1||indexof2==0||indexof2==length-1){//û�е���ߵ�����ǰ�����
			System.out.println("false");
		}
		else if(indexof2<indexof||indexof2-indexof==1){//����@ǰ�������ǰ���
			System.out.println("false");
		}
		else if(indexof!=mail.lastIndexOf("@")||indexof2!=mail.lastIndexOf(".")){//���@���߶����
			System.out.println("false");
		}
		else{
			
			String string=mail.substring(indexof2+1);
			if(string.equals("com")||string.equals("cn")){
				System.out.println("true");
				break;
			}
			else{
				System.out.println("false");
			}
		}
		}

	}

}
