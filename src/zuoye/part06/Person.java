package zuoye.part06;

public class Person {
	String name;
	int height;
	int weight;
	public Person(String name,int height,int weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public void sayHello(){
		System.out.println("hello,my name is "+name);
	}

}
