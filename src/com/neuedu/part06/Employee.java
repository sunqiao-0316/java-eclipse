package com.neuedu.part06;

public class Employee {//������
	//��д����
	String name;
	int age;
	double sal;
	
	//���췽��
	public Employee(){
		this("��",19);//��this����������һ�����췽��(������ڵ�һ��)
		System.out.println("����Employee��Ĺ��췽��");
	}
	public Employee(String _name,int _age,double _sal){
		name=_name;
		age=_age;
		sal=_sal;
	}
	public Employee(String name,int age){
		this("cai",19,8);
		this.name=name;
		this.age=age;
		
	}
	
	//д����
	/**
	 * ��ȡ����
	 * @param Ϊ��
	 * @return name ����
	 */
	public String showName(){//��ȡ����
		System.out.println(name);
		return name;
	}
	/**
	 * �޸�����
	 * @param name1 Ԥ���޸ĵ�����
	 */
	public void updateName(String name1){
		name=name1;
	}
	/**
	 * ��ȡ���
	 * @param Ϊ��
	 * @return age ���
	 */
	public int showAge(){
		System.out.println(age);
		return age;
	}
	/**
	 * ��ȡ����
	 * @return sal ����
	 */
	public double getSal(){
		
		System.out.println(sal);
		return sal;
	}

}
