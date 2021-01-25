package zuoye.part06;

public class Computer {
	char color;
	int cpu;
	public Computer(){
		
	}
	public Computer(char color,int cpu){
		this.color=color;
		this.cpu=cpu;
	}
	public void Show(){
		System.out.println(color);
		System.out.println(cpu);
	}

}
