package com.neuedu.part02;
/**
 * �����������
 * ��{}ȷ������飨����飩�����п���д�������͡�����������������������
 * 
 * 1.��ʶ��
 * ������������ĸ�����֡���Ԫ���š��»������
 *        ���������ֿ�ͷ
 *        �����ǹؼ��ֻ�����
 *        �����пո�
 *        ����û������
 * �淶��
 * ����ÿ�����ʵ�����ĸ��д��������ĸСд
 * ����ÿ�����ʶ�Сд
 * ��������һ����������ĸСд����������Сд
 * ����������ͷ�����һ������
 * ���������鶼��д
 * 
 * 2.�������ڳ������й�������ʱ���ܷ����仯
 * ͬһ�����������������ظ�
 * java�������ͷ�Ϊ�����ࣺ
 * 1�ֽ�=8bit ��һλ��01������ʶ
 * �����������ͣ��ַ���:char �ɡ������Σ�ֻ��д�����ַ���ռ�������ֽ�
 *                  ����дUnicode�ַ� ���ñ��룺A:65 a:97 0:48
 *                  ת���ַ�\n���� \r�س� \t�ո� \b�˸� ������������ַ�
 *            ������:boolean ֻ����true��false����ֵ Ĭ��ֵʱfalse
 *            ��ֵ��
 *            ����:byte:�ֽ��� 1�ֽ� ��Χ�� -128~127
 *                short:������ 2�ֽ� -32768~32767
 *                int:���� 4�ֽ� -2147483648~2147483647
 *                long:������ 8�ֽ� ����ʱ��Ҫ�ں����L -2��63����~2��63����-1
 *            ������:float �����ȸ����� 4�ֽ� -3.403E38~3.403E38 ����ʱ��ֵ�ĺ����F
 *                 double ˫���ȸ����� 8�ֽ� -1.798E308 ~ 1.798E308
 * 3.����ת����ǿ����ʽ����ת�� �Զ���ʽ����ת��
 * ��С��Χ��ֵת��Ϊ��Χ��ֵʱ �Զ�ת
 * ����Χת��ΪС��Χʱ ǿ��ת
 * 
 * �����������ͣ��ࡢ���顢�ӿ�
 *                 
 * JDK:java��������
 * JRE:java���л���
 * ��������Ⱦ�˺�ͷ������piu��
 */

public class Test0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i=127;//�ֽ���
		System.out.println(i);
		i=1;
		System.out.println(i);//�Զ�sysout ALT+/
		short j=32767;//������
		int k=2147483647;//����
		long m=2147483648L;//������
		
		//��������0B���壬���´�����Զ���������ת��Ϊʮ����
		int er=0B0001;
		System.out.println(er);
		//�˽�����0��ͷ����
		int ba=020;
		System.out.println(ba);
		//ʮ��������0X��ͷ����
		
		float f=10.1F;//�����ȸ�����
		System.out.println(f);
		double d=10.01D;//˫���ȸ�����
		System.out.println(d);

		//�Զ���ȫ����ֵ	������������ctrl+1	
		String binaryString = Integer.toBinaryString(10);//ת��������
		System.out.println(Integer.toBinaryString(10));//ת��������
		System.out.println(Integer.toOctalString(16));//ת���˽���
		System.out.println(Integer.toHexString(100));//ת��ʮ������
//��סctrl���������Բ鿴Դ��
		
		//������
		boolean bl=true;
		boolean bo=false;
		boolean bt=false;
		System.out.println(bt);
		
		//�ַ���
		char c1='A';
		char c3='\u03A6';
		char c2='a';
		System.out.println(c3);//Unicode�� 
		System.out.println("escapechar");
		System.out.println("escape\bchar");
	    System.out.println("escape\tchar");
	    System.out.println("escape\rchar");
	    System.out.println("escape\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("\'���ڵ�������\'");
	    System.out.println("��û�е�����");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
	    int ic1=c1;//�Զ�ת������ʽת����
	    System.out.println(ic1);
	    int ic2=c2;
	    System.out.println(ic2);
	    char ca=(char) (ic1+32);//ǿ��ת������ʾת����
	    System.out.println(ca);
	    int i1=2;
	    double d1=3.3333D;
	    int i2=(int) (i1+d1);
	    System.out.println(i2);
	    		
	    
		
	}

}
