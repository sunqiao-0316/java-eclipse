package lianxi.part01;

import java.util.Scanner;

public class Zuoye0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ĸ��3Ԫ/ֻ������4Ԫ/ֻ��С��0.5Ԫ/ֻ�������100ԪǮ��100ֻ����ÿһ�ּ�������0ֻ����������Щ���ܣ�
		//����һ��ÿ�ּ�����0~100ֻ�Ŀ��ܣ�������п���ֻ��
		for(int woman=0;woman<=100;woman++){
			for(int man=0;man<=100;man++){
				for(int child=0;child<=100;child++){
					if(3*woman+4*man+0.5*child==100&&woman+man+child==100){
						System.out.println(woman+" "+man+" "+child);
					}
				}
			}
		}
		//��������ĸ����������33ֻ��������������24ֻ��С��=100-����-ĸ��
		for(int woman1=0;woman1<=33;woman1++){
			for(int man1=0;man1<=25;man1++){
				int child1=100-woman1-man1;
				if(3*woman1+4*man1+0.5*child1==100){
					System.out.println(woman1+" "+man1+" "+child1);
				}
			}
		}
		
		//��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
		//�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
		//20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
		//40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
		//60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
		//����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
		//�ڳ������趨һ������Ϊ����������Ӧ���Ž���������
		Scanner scanner=new Scanner(System.in);
		double bonus;//����
		System.out.println("��������");
		int profit=scanner.nextInt();//����
		if(profit<=100000){
			bonus=profit*0.1;
		}
		else if(profit<=200000&&profit>100000){
			bonus=100000*0.1+(profit-100000)*0.075;
		}
		else if(profit<=400000&&profit>200000){
			bonus=100000*0.1+100000*0.075+(profit-200000)*0.05;
		}
		else if(profit<=600000&&profit>400000){
			bonus=100000*0.1+100000*0.075+200000*0.05+(profit-400000)*0.03;
		}
		else if(profit<=1000000&&profit>600000){
			bonus=100000*0.1+100000*0.075+200000*0.05+200000*0.03+(profit-600000)*0.015;
		}
		else {
			bonus=100000*0.1+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(profit-1000000)*0.01;
		}
		System.out.println(bonus);
		
		//������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321
		System.out.println("����4λ����");
		int shu=scanner.nextInt();
		if(shu>=1000){
		int q=shu/1000%10;
		int b=shu/100%10;
		int s=shu/10%10;
		int g=shu%10;
		int x1=q;
		q=g;
		g=x1;
		int x2=b;
		b=s;
		s=x2;
		System.out.println(q+""+b+""+s+""+g);
		}
		else{
			System.out.println("����");
		}

	}

}
