package zuoye.part06;

import java.util.List;
import java.util.Random;

public class Zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poker[] card=new Poker[52];
		String[] co={"����","����","����","�ڻ�"};
		String[] nu={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i=0;i<co.length;i++){
			for(int j=0;j<nu.length;j++){
				String nums=nu[j];
				int count=0;
				if("A".equals(nums)){//�ַ����Ƚ�
					count=1;
				}
				else if("J".equals(nums)){
					
				}
				card[i*13+j]=new Poker(co[i],nu[j]);
			}
		}
		for(Poker item:card){
			System.out.print(item.color+" "+item.num);
		}
		//ϴ�ƣ�����ϴ��100��,���ȡ��һ���ƺ����һ�Ž���
		Random r=new Random();
		for(int i=0;i<100;i++){
			Poker temp=card[r.nextInt(52)];
			card[r.nextInt(52)]=card[card.length-1];
			card[card.length-1]=temp;
		}
	}

}
