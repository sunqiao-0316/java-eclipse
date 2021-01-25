package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * ����
 * �����Ǳ䳤�ģ�ֻ�ܷ������������͵����ݼ�(���Բ�ͬ����)
 * List����
 * �ص㣺���򣬿��ظ�
 * 1.ArrayList:���Խṹ���ײ��Ǹ����飬Ĭ�ϳ�����10
 * ���ϲ��ܳ�����ǰsize-1�ĵط���ֵ
 * ���ϻ�ȡ���ȵ���size()����
 * �����������add()
 * ��ȡ������get(index)
 * ��һ�����ϵ�����Ԫ����ӽ���addAll()
 * ��ռ�������clear()
 * ָ��λ��ɾ��remove()
 * �жϼ����Ƿ���Ԫ��isEmpty()
 * ������
 * �̳���Collection�ӿڵļ��϶����ڵķ���
 * ͨ����Ӧ�������õ���iterator()����������һ������������
 * hasNext()�ж��α��ұ��Ƿ���Ԫ��
 * next()�����α��ұߵ�Ԫ�ز��ƶ��α굽��һλ��
 * 2.LinkedList�ڲ��洢�ṹ��ArrayList��ͬ
 * ��һ���������������λ���ݽ��д���
 * addFirst()���ײ���������
 * addLast()��β����������
 * removeFirst()ɾ���ײ�
 * �����⣺ArrayList��LinkedList������
 * �ṹ��ͬ
 * Ƶ��������������ʱ���в�ѯ�����϶�ʱ������ʹ��ArrayList
 * �����ݲ����ɾ�������϶�ʱ������ʹ��LinkedList
 * 
 * Set����
 * �ص㣺���򣬲����ظ�
 * HashSet����ȥ���ظ�
 * ��ν�������Ǻ����ݲ���˳���޹�
 * 
 * Collections.sort()���̳���Collections�ӿڵļ�������
 *
 */

public class Test0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List����
		ArrayList arrayList=new ArrayList();//�ײ��Ǹ�����
		//���ֵ
		arrayList.add(new Integer(1));
		arrayList.add(0);//����֧���Զ�װ�����
		arrayList.add("string");
		//���ϳ���
		int size = arrayList.size();
		System.out.println(size);
		System.out.println(arrayList);
		//��ȡ����
		System.out.println(arrayList.get(0));
		//��ָ��λ���������
		arrayList.add(arrayList.size(), "2");
		System.out.println(arrayList);
		//����
		ArrayList arrayList2=new ArrayList();
		arrayList2.add(10);
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
		//ָ��λ��ɾ��
		arrayList2.remove(0);
		System.out.println(arrayList2);
		
		//���ϱ���
		//��һ��
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		//�ڶ���,�������ӿ�
		Iterator iterator = arrayList.iterator();//��ȡһ����ǰ���ϵĵ���������
		while(iterator.hasNext()){//�ж��α��ұ��Ƿ���Ԫ��
			System.out.println(iterator.next());//�����α��ұߵ�Ԫ�ز��ƶ��α굽��һλ��
		}
		
		
		
		
		LinkedList linkedList=new LinkedList();
		linkedList.add(1);
		linkedList.get(0);
		linkedList.addFirst(10);
		System.out.println(linkedList);
		linkedList.addLast(2);
		System.out.println(linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
		
		//Set����
		HashSet hashset=new HashSet();
		hashset.add(10);
		hashset.add(10);
		hashset.add("aa");
		hashset.add("qqq");
		hashset.add(9);
		System.out.println(hashset);
		
		
		//35���������ȡ7�����뼯����
		Random random=new Random();
		HashSet hashset1=new HashSet();
		while(true){
			hashset1.add(random.nextInt(35)+1);
			if(hashset1.size()==7){
				break;
			}
		}
		System.out.println(hashset1);
		
		
		//����˳���б�ArrayList�д洢��Ԫ������������1~5������ÿ��Ԫ�أ���ÿ��Ԫ��˳�����
		ArrayList arrayList3=new ArrayList();
		arrayList3.add(1);
		arrayList3.add(2);
		arrayList3.add(3);
		arrayList3.add(4);
		arrayList3.add(5);
		Collections.sort(arrayList3);
		Iterator iterator1 = arrayList3.iterator();
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
	
		
		//��һ���б��д洢����Ԫ�أ�apple,grape,banana,pear,���ؼ����е����ĺ���С��Ԫ�ء�
		ArrayList arrayList4 =new ArrayList();
		arrayList4.add("apple");
		arrayList4.add("grape");
		arrayList4.add("banana");
		arrayList4.add("pear");
		Collections.sort(arrayList4);//����
		System.out.println(arrayList4.get(0)+" "+arrayList4.get(size-1));//�����������СԪ��
		Iterator iterator2=arrayList4.iterator();//����
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		
		
		
	}

}
/*
 * ����ѧ����Ϣname score ����exit�˳�������ڼ����л�ȡƽ����
 */
/*
class Student{
	private String name;
	private int score;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	ArrayList stu=new ArrayList();
	Scanner sc=new Scanner(System.in);
	while(true){
		Student student=new Student();
		System.out.println("����ѧ������");
		String name=sc.nextLine();
		student.setName(name);
		System.out.println("�������");
		int score=sc.nextInt();
		student.setScore(score);
		System.out.println("��������");
		int age=sc.nextInt();
		student.setAge(age);
		stu.add(student);
		System.out.println("�Ƿ����¼�룬�˳��밴exit");
		Scanner scanner=new Scanner(System.in);
		String info=scanner.nextLine();
		if("exit".equals(info)){
			break;
		}
	}
	int sum=0;
	Iterator iterator3=arrayList4.iterator();//����
		while(iterator3.hasNext()){
			System.out.println(iterator3.next());
		}
}
*/