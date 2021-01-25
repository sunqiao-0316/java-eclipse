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
 * 1.����
 * ��ʹ�ü��϶���ʱ���������͵ĳ����������÷��Ͷ���
 * ����ʹ�ü���ʱ������������ƣ�ʲô���Ͷ����Էţ�ȡ����ʹ�ò����㣬����Ҫʹ�÷���
 * ���ƴ�ŵ����ͣ�����Ҫǿ��ת��
 * ���弯��ʱ���������ķ�����java1.8�汾����ʡ�ԣ���ȻҪ��ǰ�������ķ��ͱ���һ��
 * �Զ��巺����
 * ����ʵ�ֶ�����͵Ķ���
 * ע�⣺��һ����̳д��з�����ʱ����������ϱ����˷��ͱ�ʶ����ô����Ҳ����ʵ�ַ��͹��ܣ�����ޱ�ʶ�����������ʵ��Ҳ���Բ�ʵ��
 * 
 * 2.Map�ӿ�
 * map���Լ�/ֵ�Դ�ųɶ����ݵ������飬K����key����V����valueֵ
 * put(key,value)��������ֵ
 * size()ȡ����
 * HashMap����
 * ������ʽ��keySet() entrySet()
 * ���м��϶��е�foreach����
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
	    
	    
	    
	    //HashMap����
	    HashMap<Integer,Integer> hashMap=new HashMap();
	    hashMap.put(1, 11);
	    hashMap.put(2, 22);
	    hashMap.put(3, 33);
	    hashMap.put(4, 44);
	    hashMap.put(4, 45);
	    System.out.println(hashMap.size());
	    System.out.println(hashMap);
	    
	    //����
	    //1.����key��value
	   Set<Integer> keySet = hashMap.keySet();//��ȡ���е�key�ļ���
	   Iterator<Integer> iterator = keySet.iterator();
	    Integer integer=hashMap.get(4);
	    while(iterator.hasNext()){
	    	Integer key=iterator.next();//�õ�ÿһ��key
	    	Integer value=hashMap.get(key);//�õ�ÿһ��value
	    	System.out.println(key+" "+value);
	    }
	    
	    //2.ͨ��entry���ϱ���
	    Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
	    Iterator<Entry<Integer, Integer>> iterator2 = entrySet.iterator();
	    while(iterator.hasNext()){
	    	Entry<Integer,Integer> entry= iterator2.next();//ÿһ��key-value
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    //lamdba���ʽ
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
	    //�洢���д�������Ϣ(���д�������Ҫ��Ϣ�д�����ID�����������)�����⣬���㲢��ʾ����ĳ�������ĵ�ǰ���
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
		    	System.out.println("����Ҫ��ѯ�ı��");
		    	 
		    	int no=sc.nextInt();
		    	BankerInfo bankerInfo = hashMap2.get(no);
		    	if(bankerInfo!=null){
		    		System.out.println(bankerInfo.getNo()+" "+bankerInfo.getName()+" "+bankerInfo.getBalance());
		    	}
		    	else{
		    		System.out.println("����");
		    	}
		    }
		    else{
		    	System.out.println("����");
		    }
	   }
	    */
	    
	  
	    Hashtable<Object,Object> hashtable=new Hashtable();//��֤�̰߳�ȫ��ͬ����
	    new ConcurrentHashMap<>();//���÷ֶ��������̰߳�ȫ������֤�̰߳�ȫ��ͬ������1.8��ʼʹ��CAS��
	    
	    
	    

	}

}

//�Զ��巺����
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
class Result<E,T,U> extends Generic{//���ͱ�ʶҲҪ�̳�
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
