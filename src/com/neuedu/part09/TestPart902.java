package com.neuedu.part09;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ����Ĭ�ϵ��ַ�����GBK���ģ�gb2312
 * �ַ�����
 * �ַ����ڲ�ʹ�ò��ɱ��char������������
 * 1.�ַ����ıȽϷ�����
 * 				boolean equals() �ж��Ƿ���� 
 * 			    boolean equalsIgnoreCase() ���Դ�Сд���еıȽ�
 *				boolean startsWith() �ж��ַ����Ƿ��Դ˿�ʼ
 *				boolean endsWith() �ж��ַ����Ƿ��Դ˽���
 * 2.�ַ�����char�����ת��
 * ����ͨ��toCharArray()�ķ���ת����char������
 * ����ͨ���ַ����Ĺ��������ַ�����ת�����ַ�����������ͨ��String.valueOf����
 * 
 * 3.�ַ�����byte�����ת��
 * ����ͨ��getBytes()�ķ������byte���飬���Ի���ַ�����ռ�õ��ֽ���
 * 
 * 4.�ַ����ĳ��÷���
 * split(ָ���ָ���) ͨ��ָ�����ַ��������в��ԭ�ַ���Ϊһ���ַ�������
 * replace�����ַ������ַ��������ַ�ȫ���滻�����ַ�������һ�����ַ���
 * toUpperCase() ���ַ���ת���ɴ�д
 * toLowerCase() ���ַ���ת����Сд
 * charAt(index) ����index�±��Ӧ���ַ�
 * substring(b,e) ��bλ�ÿ�ʼ����e-1λ�ý���������һ�����ַ���
 * indexOf(�ַ�/�ַ���) �����ַ������ַ������ڵ�λ�ã����û�з���-1
 * trim() ȥ���ַ�����β�ո�
 * matches(������ʽ)�ַ�����ʽ������ϣ�����true�������Ϸ���false������У���ַ���
 * 
 * 5.���һ���ַ���Ƶ���仯�����Ƽ�ʹ��String����
 * �ɱ��ַ�����StringBuffer StringBuilder
 * �����⣺StringBuffer StringBuilder����
 * StringBuffer�̰߳�ȫͬ�����ٶȽ�����StringBuilder�̲߳���ȫ���ٶȽϿ�
 * append(xxx)��xxxƴ�ӵ��ַ�������	
 * insert(ָ��λ��,xxx)��ָ��λ�ò���xxx
 * deleteCharAt(ָ��λ��)ɾ��ָ��λ���ַ���	
 * 6.Date��
 * after�ж������Ƿ���ָ������֮��
 * before
 * 7.Calendar������
 * 8.SimpleDateFormat�� �Զ������ڸ�ʽ
 * y�����꣬M�£�d�գ�HСʱ��m���ӣ�s��
 * format(Date d)������תΪ�ַ���
 * parse(String s)�ַ���תΪ�����ͣ��ַ���Ҫ��SimpleDateFormat�ﶨ��ĸ�ʽһ�²ſ���ת��
 * 9.math������
 * Math.floor ��ȡ����
 * Math.ceil ����
 * Math.rint ��������ȡ��
 * 
 */
public class TestPart902 {

	public static void main(String[] args) {
		String str = new String("aaaaaa");
		String str2 = "��";
		
		boolean b = str.equalsIgnoreCase(str2);
		
		System.out.println(b);
		
		System.out.println(str.startsWith("aaaa"));
		System.out.println(str.endsWith("a"));
		char[] charArray = str2.toCharArray();
		for(char item: charArray){
			System.out.println(item);
		}
		str = new String(charArray);
		String.valueOf(charArray);
		
		byte[] bytes = null;
		bytes = str2.getBytes();
		
		for(byte item: bytes){
			System.out.println(item);
		}
		str2 = new String(bytes);
		System.out.println(str2);
		
		String str3 = "   a,eqwe,   ,dasdsad,    asdasd    ";
		
		String[] splitA = str3.split(",");
		
		for(String item: splitA){
			System.out.println(item);
		}
		
		String replace = str3.replace(',', '#');
		System.out.println(replace);
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		System.out.println(str3.charAt(str3.length()-1));
		System.out.println(str3.substring(0, 3));
		
		System.out.println(str3.indexOf("eqw"));
		
		System.out.println(str3.trim());
		String s = "abecedkjkacedjkdseddklj";
		//ͳ��һ���ַ������ַ�e���ֵĴ���
		System.out.println(s.length()-s.replace("e", "").length());
		//System.out.println("�����һ���ַ����ڵڶ����ַ����г��ֵĴ���");
		Scanner sc = new Scanner(System.in);
		
		/*String first = sc.nextLine();
		String second = sc.nextLine();
		
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		*/
		//����һ������ �ж�����ĸ�ʽ�Ƿ���ȷ111@qq.com
		/*
		while (true) {
			System.out.println("������һ������");
			String mail = sc.nextLine();
			
		
			
			
			int length = mail.length();
			int indexOf = mail.indexOf("@");
			int indexOf2 = mail.indexOf(".");
			if(length>20){
				System.out.println("���䲻�Ϸ�");
			}else
			if(indexOf == -1 || indexOf ==0 || indexOf == length-1){
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf2<indexOf || indexOf2-indexOf==1){//����@��ǰ��,�������ǰ���
				System.out.println("���䲻�Ϸ�");
			}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){
				System.out.println("���䲻�Ϸ�");
			}else{
				String string = mail.substring(indexOf2+1);
				if(string.equals("com") || string.equals("cn") ){
					System.out.println("����Ϸ�");
					break;
				}else{
					System.out.println("���䲻�Ϸ�");
				}
			}
		}
		
		*/
		/*
		StringBuffer stringBuffer=new StringBuffer ("aaa");
		//�ַ�����ƴ��
		stringBuffer.append("1111");
		//ָ��λ�ò���
		stringBuffer.insert(0, b);//�ڵ�0��λ�ò��벼���ͣ������ͻ��Զ�תΪ�ַ�����
		//ɾ��ָ���±���ַ�
		stringBuffer.deleteCharAt(1);
		//�滻ָ���ַ���
		stringBuffer.replace(1, 2, "00");
		System.out.println(stringBuffer);
		//StringBuilder stringBuilder=new StringBuilder("bbb");
		
		//����̨����10���ַ������������֮���
		StringBuffer stringBuffer2=new StringBuffer();
		for(int i=0;i<2;i++){
			String input=sc.nextLine();
			stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		*/
		//Date��
		Date date=new Date();
		System.out.println(date);
		System.out.println();
		Date date2=new Date(2000);
		System.out.println(date.before(date2));//���ڱȽ�
		
		//������
		Calendar instance = Calendar.getInstance();//���ض����ݼ�Alt+shift+l
		System.out.println(instance.getTime());
		String str4;
		int type=instance.get(9);//0�����磬1������
		if(type==0){
			str4="����";
		}
		else{
			str4="����";
		}
		int year=instance.get(1);
		int month=instance.get(2);
		int day=instance.get(5);
		int hour=instance.get(10);
		int min=instance.get(12);
		int se=instance.get(13);
		System.out.println(year+" "+month+1+" "+day+" "+hour+" "+min+" "+se+" "+str4);
		
		//�Զ������ڸ�ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		String format = sdf.format(new Date());//������תΪ�ַ���
		System.out.println(format);
		
		
	}

}
