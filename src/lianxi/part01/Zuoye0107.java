package lianxi.part01;

import java.util.Scanner;

public class Zuoye0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("����a,b");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println("a="+a+" "+"b="+b);
		*/
		//����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ���
		/*
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		int s;
		if(i>0&&i<1000){
			s=i/100%10+i/10%10+i%10;
			System.out.println(s);
		}
		else{
			return;
		}
		*/
		//�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32����
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("ѡ���¶ȣ�1Ϊ���뻪�϶ȣ�0Ϊ�������϶�");
		int j=scanner.nextInt();
		switch(j){
		case 1:
		int huashi=scanner.nextInt();
		int sheshi=(huashi-32)*5/9;
		System.out.println(sheshi);
		break;
		case 0:
		sheshi=scanner.nextInt();
	    huashi=sheshi*5/9+32;
		System.out.println(huashi);
		break;
		}
		*/
		//����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ
		/*
		Scanner scanner=new Scanner(System.in);
		char daxie=scanner.next().charAt(0);
		char xiaoxie=(char) (daxie+32);
		System.out.println(xiaoxie);
		*/
		/*
		int s=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				s+=i;
			}
		}
		System.out.println(s);
*/
		/*for(int i=1;i<=9;i++){
			System.out.println(i);
			for(int j=1;j<=i;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}*/
		
	}

}
