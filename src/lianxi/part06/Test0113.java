package lianxi.part06;

public class Test0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������Point������2����Ա����
		//x��y�ֱ��ʾx��y����
		//2�����췽��Point()��Point(int x0,y0)
		//�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ�
		//��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ
		Point p1=new Point(0,0);
		Point p2=new Point(0,0);
		p1.movePoint(1,2);
		p2.movePoint(3,4);
		
		//����һ��������Rectangle
		//��������������getArea()�������getPer()���ܳ���showAll()
		//�ֱ��ڿ���̨���������������ܳ�
		//��2�����ԣ���length����width
		//ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ 
		//����һ��Rectangle���󣬲���������Ϣ
		
		//����һ���ʼǱ���
		//��������ɫ��char����cpu�ͺţ�int����������
		//�޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ��
		//����ʼǱ���Ϣ�ķ��� 
		//Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������
		Rectangle rec=new Rectangle(2,3);
		rec.showAll();
		

	}

}
