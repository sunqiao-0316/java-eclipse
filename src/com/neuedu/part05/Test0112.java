package com.neuedu.part05;
/**
 * �����Ķ���͵���
 * �����Ƕ���õģ����ж������ܣ����ظ����õģ�Ϊ�˼򻯴�����ڣ�����������������У�����һ��������������Ķ�������Ϊ
 * ��������ɣ�
 * ����ͷ �����塾����Ȩ�޿��Ʒ��������η�������ֵ���� ���������������� ���������������� ������...��{������}
 * 1.����ֵ���ͣ����û�з���ֵдvoid
 * 2.���������ô��ݲ���Ϊ������������ʱ����ֵ��������
 *   ���������ô��ݲ���Ϊ������������ʱ�����ص�ַ�������ù��̣�String���⣬��Ϊ�����ɱ䣩
 * 3.��������
 *   ����ͷ�ж�����������͵Ĳ�������ʽ����
 *   ����ʱʵ�ʴ���ֵ��ʵ�ʲ���
 * 
 * ���������أ���ͬһ�����У�����ͬʱ���ڶ����ͬ����
 * �������ع���1.��������ͬ
 *          2.����������ͬ�������������߲������Ͳ�ͬ��
 *          3.�����ķ���ֵ����ν��������ͬ�����Բ���ͬ��
 *  
 * �ݹ飺һ�������Լ������Լ�
 *
 */

public class Test0112 {

	public static void main(String[] args) {//�ھ�̬�������õķ���Ҳֻ���Ǿ�̬��
		// TODO Auto-generated method stub
		//5��6��
		outPrint(5,6);//5 6ʵ��
		
		//���������������ֵ
		System.out.println(compare(1.0,2));
		
		//������ֵ+2
		int i=2;
		int j=3;
		int add=add(j);
		System.out.println(add);
		System.out.println(j);//ֻ�ܽ�ֵ���ƴ���ȥ��j������ȥ
		System.out.println(add(j));
		System.out.println(add==j);
		
		//����һ�������������鸳ֵ
		int[] arr=new int[5];
		input(arr);
		for(int item:arr){
			System.out.println(item);
		}
		
		String str="aaabbbccc";//��һ�������������������,����Ĳ��ǵ�ַ
		String str2=new String("aaabbbccc");
		
		//����ͼ�����
		System.out.println(getArea(1.0));
		
		//��׳�
		System.out.println(fac(5));
		
		System.out.println(fb(15));

	}
	
	//��ӡһ��row��col�е�*
	//û�з���ֵ��д�� void
	//synchronized�����߳�ͬ�������η���
	public static void outPrint(int row,int col){//�β�
		
				for(int i=1;i<=row;i++){
					for(int j=1;j<=col;j++){
						System.out.print("*");
					}
					System.out.println();
				}
	}
	
	//�������������ֵ
	public static int compare(int num1,int num2){
		return num1>num2?num1:num2;
	}
	//��������:���ݲ�����ͬ����̬ѡ���Ӧ�ķ�����������
	public static double compare(double num1,double num2){
		return num1>num2?num1:num2;
	}
	
	//����һ�η�����������Ӧ��ֵ+2
	public static int add(int j){
		j=j+2;
		return j;
	}
	
	//����һ�������������鸳ֵ
	public static void input(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=count++;
		}
	}
	
	//����ͼ�����
	//Բ�������Σ�������
	public static double getArea(double radius){
		return radius*radius*3.14;
	}
    public static double getArea(int height,int width){
		return height*width;
	}
    public static double getArea(int len){
	    return len*len;
}
    
    //��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5
    public static int fac(int n){
    	int result=1;
    	for(int i=1;i<=n;i++){
    		result*=i;
    	}
    	return result;
    }
    
    //�õݹ鷽����׳�
    public static int facdigui(int n){
    	if(n==2){
    		return 2;
    	}
    	else{
    		return n*=facdigui(n-1);
    	}
    	
    }
    
    //����쳲��������еĵ�16λ��ǰ��������ӵ�����һ������
    //1��1��2��3��5��8��13��21
    public static int fb(int m){//n�ǵڼ�����
    	if(m==1||m==2){
    		return 1;
    	}
    	else{
    		return fb(m-1)+fb(m-2);
    	}
    }


}
