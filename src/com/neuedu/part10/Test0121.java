package com.neuedu.part10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1.泛型
 * 在使用集合定义时放任意类型的场景，可以用泛型定义
 * 定义使用集合时，如果不加限制，什么类型都可以放，取出来使用不方便，所以要使用泛型
 * 限制存放的类型，不需要强制转换
 * 定义集合时，构造器的泛型在java1.8版本可以省略，不然要和前面声明的泛型保持一致
 * 自定义泛型类
 * 可以实现多个泛型的定义
 * 注意：当一个类继承带有泛型类时，如果在类上表明了泛型标识，那么子类也必须实现泛型功能，如果无标识，则子类可以实现也可以不实现
 * 
 * 2.Map接口
 * map是以键/值对存放成对数据的数据组，K代表key键，V代表value值
 * put(key,value)方法，存值
 * size()取长度
 * HashMap集合
 * 遍历方式：keySet() entrySet()
 * 所有集合都有的foreach方法
 * list.foreach(item->{});
 * set.foreach(item->{});
 * map.foreach((k,v)->{})
 *
 */

public class Test0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
	    a.add(1);
	    a.add(3);
	    a.add(10);
	    Generic<Integer> g=new Generic<>();
	    g.setT(10);
	    Result<Integer,Integer,Integer> result=new Result<>(10,20,30);
	    result.showAll();
	    
	    
	    
	    //HashMap集合
	    HashMap<Integer,Integer> hashMap=new HashMap();
	    hashMap.put(1, 11);
	    hashMap.put(2, 22);
	    hashMap.put(3, 33);
	    hashMap.put(4, 44);
	    hashMap.put(4, 45);
	    System.out.println(hashMap.size());
	    System.out.println(hashMap);
	    
	    //遍历
	    //1.根据key拿value
	   Set<Integer> keySet = hashMap.keySet();//获取所有的key的集合
	   Iterator<Integer> iterator = keySet.iterator();
	    Integer integer=hashMap.get(4);
	    while(iterator.hasNext()){
	    	Integer key=iterator.next();//拿到每一个key
	    	Integer value=hashMap.get(key);//拿到每一个value
	    	System.out.println(key+" "+value);
	    }
	    
	    //2.通过entry集合遍历
	    Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
	    Iterator<Entry<Integer, Integer>> iterator2 = entrySet.iterator();
	    while(iterator.hasNext()){
	    	Entry<Integer,Integer> entry= iterator2.next();//每一对key-value
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    //lamdba表达式
	    a.forEach(item->{//list
	    	System.out.println(item);
	    });
	    hashMap.keySet().forEach(item->{//set
	    	System.out.println(item+","+hashMap.get(item));
	    });
	    hashMap.forEach((k,v)->{//map
	    	System.out.println(k+" "+v);
	    });
	    /*
	    //存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。另外，计算并显示其中某个储户的当前余额
	    HashMap<Integer,BankerInfo> hashMap2=new HashMap<>();
	    hashMap2.put(1, new BankerInfo(1,"tom",200));
	    hashMap2.put(2, new BankerInfo(2,"mark",300));
	    hashMap2.put(3, new BankerInfo(3,"marry",400));
	    Scanner sc=new Scanner(System.in);
	    String type=sc.nextLine();
	   while(true){
		   if("1".equals(type)){
		    	Iterator<Entry<Integer,BankerInfo >> iterator3 = hashMap2.entrySet().iterator();
		    	while(iterator3.hasNext()){
		    		 Entry<Integer, BankerInfo> next = iterator3.next();
		    		 System.out.println(next.getKey()+" "+next.getValue().getName());
		    	}
		    }
		    else if("2".equals(type)){
		    	System.out.println("输入要查询的编号");
		    	 
		    	int no=sc.nextInt();
		    	BankerInfo bankerInfo = hashMap2.get(no);
		    	if(bankerInfo!=null){
		    		System.out.println(bankerInfo.getNo()+" "+bankerInfo.getName()+" "+bankerInfo.getBalance());
		    	}
		    	else{
		    		System.out.println("错误");
		    	}
		    }
		    else{
		    	System.out.println("错误");
		    }
	   }
	    */
	    
	  
	    Hashtable<Object,Object> hashtable=new Hashtable();//保证线程安全（同步）
	    new ConcurrentHashMap<>();//采用分段锁进行线程安全管理，保证线程安全（同步），1.8开始使用CAS锁
	    
	    
	    

	}

}

//自定义泛型类
class Generic<T>{
	private final static int sucType=200;
	private final static String suc="success";
	private T t;
	public Generic(){
		
	}
	public Generic(T t){
		this.t=t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
class Result<E,T,U> extends Generic{//泛型标识也要继承
	private E e;
	private U u;

	public Result(T t,E e,U u) {
		super(t);
		this.e=e;
		this.u=u;
		
	}
	public Result(){
		
	}
	

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}
	public void showAll(){
		System.out.println(getE()+" "+getU()+" "+getT());
	}
	
	
}
