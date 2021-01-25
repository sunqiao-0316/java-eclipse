package com.neuedu.part07;

public interface Testinterface {//定义接口
	final int i=1;
	public abstract void testinterface();
	public int name();
	

}

interface TestinterfaceSon1 extends Testinterface{
	public int name1();
}
interface TestinterfaceSon2 extends Testinterface,TestinterfaceSon1{//多继承
	
}

class TestinterfaceC implements TestinterfaceSon1,Testinterface{//多实现

	@Override
	public void testinterface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int name() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int name1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}