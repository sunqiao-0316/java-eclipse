package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Test012103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*打卡系统，给公司员工提供一个打卡系统，员工信息：ID 姓名
		提供的功能点：
		1-------签到，打卡的员工必须是公司已有员工
		2-------签退，只有当天签到的员工才可以签退
		3-------查询打卡信息(记录打卡时间，可以查询近七天)
		4-------退出
		同一天不能重复签到签退
		打卡记录存在另一个集合中
		打卡之后退出到登录界面
		*/
		 HashMap<Integer,BankerInfo> hashMap=new HashMap<>();
		 

	}

}
class Worker{
	private int ID;
	private String name;
	//存放员工打卡记录的属性
	private ArrayList<Check> arrayList=new ArrayList();//最多存七条，超过时间则清除第一条数据
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
	private String checkflag;//默认签退状态，员工签到时，判断当天状态为签退则可签到
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
