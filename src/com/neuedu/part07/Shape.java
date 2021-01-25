package com.neuedu.part07;

public class Shape {
	//���Shape��ʾͼ���࣬���������area���ܳ�����per����ɫ����color��
	//���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ�������3�����󷽷���
	//�ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ������һ������ɫ�ķ���getColor��
	//��� 2�����ࣺ
	//Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ�
	//��дgetPer��getArea��showAll��������������������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ�
	//Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶��
	//��дgetPer��getArea��showAll���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
	//��main�����У���������ÿ������Ķ��󣬲�����2�������showAll����
	
	private int area;
	private int per;
	private String color;
	public Shape(){
		
	}
	public Shape(String color){
		this.color=color;
	}
	public int getArea() {
		return area;
	}
	public int getPer() {
		return per;
	}
	public String getColor() {
		return color;
	}
	public void showAll(){
		System.out.println("area is"+area+"per is"+per+"color is"+color);
	}
	
	public static void main(String[] args){
		Rectangle rectangle=new Rectangle(10,10,"red");
		Circle circle=new Circle(10,"blue");
		rectangle.showAll();
		circle.showAll();
		
	}

}
class Rectangle extends Shape{
	private int weight;
	private int height;
	public Rectangle(){
		
	}
	public Rectangle(int weight,int height,String color){
		super(color);
		this.weight=weight;
		this.height=height;
		
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return weight*height;
	}
	@Override
	public int getPer() {
		// TODO Auto-generated method stub
		return (weight+height)*2;
	}
	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println("weight is"+weight);
		System.out.println("height is"+height);
		System.out.println("area is"+getArea());
		System.out.println("per is"+getPer());
		System.out.println("color is"+getColor());
	}
	
}

class Circle extends Shape{
	private int radius;
	public Circle(){
		
	}
	public Circle(int radius,String color){
		super(color);
		this.radius=radius;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return radius*radius*3;
	}
	@Override
	public int getPer() {
		// TODO Auto-generated method stub
		return 2*3*radius;
	}
	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		System.out.println("radius is"+radius);
		System.out.println("area is"+getArea());
		System.out.println("per is"+getPer());
		System.out.println("color is"+getColor());
	}
	
}



