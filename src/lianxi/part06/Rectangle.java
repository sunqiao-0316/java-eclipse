package lianxi.part06;

public class Rectangle {
	//定义一个矩形类Rectangle
	//定义三个方法：getArea()求面积、getPer()求周长，showAll()
	//分别在控制台输出长、宽、面积、周长
	//有2个属性：长length、宽width
	//通过构造方法Rectangle(int width, int length)，分别给两个属性赋值 
	//创建一个Rectangle对象，并输出相关信息
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
