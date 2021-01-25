package com.neuedu.part07;

public class Printer {
	public void doPrint(){
		
	}
	public static void main(String[] args){
		Printer printer=new blackPrinter();
		
	}

}
class blackPrinter extends Printer{

	@Override
	public void doPrint() {
		System.out.println("black printer");
	}

	
	
}
class colorPrinter extends Printer{

	@Override
	public void doPrint() {
		System.out.println("color printer");
	}
	
}