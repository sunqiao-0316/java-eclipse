package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Test012103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��ϵͳ������˾Ա���ṩһ����ϵͳ��Ա����Ϣ��ID ����
		�ṩ�Ĺ��ܵ㣺
		1-------ǩ�����򿨵�Ա�������ǹ�˾����Ա��
		2-------ǩ�ˣ�ֻ�е���ǩ����Ա���ſ���ǩ��
		3-------��ѯ����Ϣ(��¼��ʱ�䣬���Բ�ѯ������)
		4-------�˳�
		ͬһ�첻���ظ�ǩ��ǩ��
		�򿨼�¼������һ��������
		��֮���˳�����¼����
		*/
		 HashMap<Integer,BankerInfo> hashMap=new HashMap<>();
		 

	}

}
class Worker{
	private int ID;
	private String name;
	//���Ա���򿨼�¼������
	private ArrayList<Check> arrayList=new ArrayList();//��������������ʱ���������һ������
	public Worker(){
		
	}
	public Worker(int ID,String name){
		this.ID=ID;
		this.name=name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class Check{
	private String checkflag;//Ĭ��ǩ��״̬��Ա��ǩ��ʱ���жϵ���״̬Ϊǩ�����ǩ��
	private Date checkintime;
	private Date checkouttime;
	
	public String getCheckflag() {
		return checkflag;
	}
	public void setCheckflag(String checkflag) {
		this.checkflag = checkflag;
	}
	public Date getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(Date checkintime) {
		this.checkintime = checkintime;
	}
	public Date getCheckouttime() {
		return checkouttime;
	}
	public void setCheckouttime(Date checkouttime) {
		this.checkouttime = checkouttime;
	}
	
}
