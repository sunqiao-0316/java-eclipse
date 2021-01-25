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
 * 集合
 * 集合是变长的，只能放引用数据类型的数据集(可以不同类型)
 * List集合
 * 特点：有序，可重复
 * 1.ArrayList:线性结构，底层是个数组，默认长度是10
 * 集合不能超过当前size-1的地方赋值
 * 集合获取长度调用size()方法
 * 集合添加数据add()
 * 获取数据用get(index)
 * 将一个集合的所有元素添加进来addAll()
 * 清空集合数据clear()
 * 指定位置删除remove()
 * 判断集合是否有元素isEmpty()
 * 迭代器
 * 继承了Collection接口的集合都存在的方法
 * 通过对应集合引用调用iterator()方法，返回一个迭代器对象
 * hasNext()判断游标右边是否有元素
 * next()返回游标右边的元素并移动游标到下一位置
 * 2.LinkedList内部存储结构和ArrayList不同
 * 是一个链表，可以针对首位数据进行处理
 * addFirst()在首部插入数据
 * addLast()在尾部插入数据
 * removeFirst()删除首部
 * 面试题：ArrayList和LinkedList的区别
 * 结构不同
 * 频繁操作集合数据时，有查询操作较多时，建议使用ArrayList
 * 对数据插入或删除操作较多时，建议使用LinkedList
 * 
 * Set集合
 * 特点：无序，不可重复
 * HashSet可以去除重复
 * 所谓的无序是和数据插入顺序无关
 * 
 * Collections.sort()给继承了Collections接口的集合排序
 *
 */

public class Test0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List集合
		ArrayList arrayList=new ArrayList();//底层是个数组
		//添加值
		arrayList.add(new Integer(1));
		arrayList.add(0);//集合支持自动装箱拆箱
		arrayList.add("string");
		//集合长度
		int size = arrayList.size();
		System.out.println(size);
		System.out.println(arrayList);
		//获取数据
		System.out.println(arrayList.get(0));
		//在指定位置添加数据
		arrayList.add(arrayList.size(), "2");
		System.out.println(arrayList);
		//复制
		ArrayList arrayList2=new ArrayList();
		arrayList2.add(10);
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
		//指定位置删除
		arrayList2.remove(0);
		System.out.println(arrayList2);
		
		//集合遍历
		//第一种
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		//第二种,迭代器接口
		Iterator iterator = arrayList.iterator();//获取一个当前集合的迭代器对象
		while(iterator.hasNext()){//判断游标右边是否有元素
			System.out.println(iterator.next());//返回游标右边的元素并移动游标到下一位置
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
		
		//Set集合
		HashSet hashset=new HashSet();
		hashset.add(10);
		hashset.add(10);
		hashset.add("aa");
		hashset.add("qqq");
		hashset.add(9);
		System.out.println(hashset);
		
		
		//35个数随机抽取7个放入集合中
		Random random=new Random();
		HashSet hashset1=new HashSet();
		while(true){
			hashset1.add(random.nextInt(35)+1);
			if(hashset1.size()==7){
				break;
			}
		}
		System.out.println(hashset1);
		
		
		//假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出
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
	
		
		//在一个列表中存储以下元素：apple,grape,banana,pear,返回集合中的最大的和最小的元素　
		ArrayList arrayList4 =new ArrayList();
		arrayList4.add("apple");
		arrayList4.add("grape");
		arrayList4.add("banana");
		arrayList4.add("pear");
		Collections.sort(arrayList4);//排序
		System.out.println(arrayList4.get(0)+" "+arrayList4.get(size-1));//集合中最大最小元素
		Iterator iterator2=arrayList4.iterator();//遍历
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		
		
		
	}

}
/*
 * 输入学生信息name score 输入exit退出，存放在集合中获取平均分
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
		System.out.println("输入学生姓名");
		String name=sc.nextLine();
		student.setName(name);
		System.out.println("输入分数");
		int score=sc.nextInt();
		student.setScore(score);
		System.out.println("输入年龄");
		int age=sc.nextInt();
		student.setAge(age);
		stu.add(student);
		System.out.println("是否继续录入，退出请按exit");
		Scanner scanner=new Scanner(System.in);
		String info=scanner.nextLine();
		if("exit".equals(info)){
			break;
		}
	}
	int sum=0;
	Iterator iterator3=arrayList4.iterator();//遍历
		while(iterator3.hasNext()){
			System.out.println(iterator3.next());
		}
}
*/