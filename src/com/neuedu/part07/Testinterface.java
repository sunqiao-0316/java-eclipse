package com.neuedu.part07;

public interface Testinterface {//����ӿ�
	final int i=1;
	public abstract void testinterface();
	public int name();
	

}

interface TestinterfaceSon1 extends Testinterface{
	public int name1();
}
interface TestinterfaceSon2 extends Testinterface,TestinterfaceSon1{//��̳�
	
}

class TestinterfaceC implements TestinterfaceSon1,Testinterface{//��ʵ��

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