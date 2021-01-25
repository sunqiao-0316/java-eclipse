package lianxi.part06;

public class Test0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个点类Point，包含2个成员变量
		//x、y分别表示x和y坐标
		//2个构造方法Point()和Point(int x0,y0)
		//以及一个movePoint（int dx,int dy）方法实现点的位置移动
		//创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。
		Point p1=new Point(0,0);
		Point p2=new Point(0,0);
		p1.movePoint(1,2);
		p2.movePoint(3,4);
		
		//定义一个矩形类Rectangle
		//定义三个方法：getArea()求面积、getPer()求周长，showAll()
		//分别在控制台输出长、宽、面积、周长
		//有2个属性：长length、宽width
		//通过构造方法Rectangle(int width, int length)，分别给两个属性赋值 
		//创建一个Rectangle对象，并输出相关信息
		
		//定义一个笔记本类
		//该类有颜色（char）和cpu型号（int）两个属性
		//无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
		//输出笔记本信息的方法 
		//然后编写一个测试类，测试笔记本类的各个方法。
		Rectangle rec=new Rectangle(2,3);
		rec.showAll();
		

	}

}
