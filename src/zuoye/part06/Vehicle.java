package zuoye.part06;

public class Vehicle {
	String brand="c";
	String color;
	double speed;
	public Vehicle(String color,double speed){
		
		this.color=color;
		this.speed=speed;
	}
	public void Car(String color,double speed){
		this.speed=speed;
		System.out.println(brand+" "+color+" "+speed);
	}
	public void Run(){
		System.out.println("Æû³µ±¼ÅÜ"+speed);
	}

}
