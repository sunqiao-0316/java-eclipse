package zuoye.part06;

import java.util.List;
import java.util.Random;

public class Zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poker[] card=new Poker[52];
		String[] co={"红桃","方块","黑桃","黑花"};
		String[] nu={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i=0;i<co.length;i++){
			for(int j=0;j<nu.length;j++){
				String nums=nu[j];
				int count=0;
				if("A".equals(nums)){//字符串比较
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
		//洗牌，控制洗牌100次,随机取出一张牌和最后一张交换
		Random r=new Random();
		for(int i=0;i<100;i++){
			Poker temp=card[r.nextInt(52)];
			card[r.nextInt(52)]=card[card.length-1];
			card[card.length-1]=temp;
		}
	}

}
