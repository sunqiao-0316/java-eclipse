package lianxi.part06;

public class Rectangle {
	//����һ��������Rectangle
	//��������������getArea()�������getPer()���ܳ���showAll()
	//�ֱ��ڿ���̨���������������ܳ�
	//��2�����ԣ���length����width
	//ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ 
	//����һ��Rectangle���󣬲���������Ϣ
    int length;
    int width;
    public Rectangle(int width,int length){
    	this.length=length;
    	this.width=width;
    }
    public int gerArea(int area){
    	area=length*width;
    	return area;
    }
    public int getPer(int per){
    	per=(length+width)*2;
    	return per;
    }
    public void showAll(){
    	System.out.println(length*width+" "+(length+width)*2);
    }

}
