package lianxi.part06;

public class Point {
	//����һ������Point������2����Ա����
	//x��y�ֱ��ʾx��y����
	//2�����췽��Point()��Point(int x0,y0)
	//�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ�
	//��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ
	int x;
	int y;
	public Point(){
		
	}
	public Point(int x0,int y0){
		x=x0;
		y=y0;
	}
	public void movePoint(int dx,int dy){
		x=x+dx;
		y=y+dy;
		System.out.println(x+","+y);
		
	}
	


}
