package zuoye.part06;

public class Zuoye0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com=new Computer('r',200);
		com.Show();
		
		Person pe=new Person("п║ау",178,60);
		pe.sayHello();
		
		PersonCreate pec=new PersonCreate();
		pec.Person1("п║ау", 1.78, 21);
		pec.sayHello();
		pec.Person2("п║©Ш", 1.83, 22);
		pec.sayHello();
		
		Vehicle ve=new Vehicle("pink",0);
		ve.Car( "red", 100);
		ve.Run();
		Student stu=new Student();
		Student[] s=new Student[3];
		s[0]=new Student("hong",1,90);
		s[1]=new Student("ming",2,80);
		s[2]=new Student("lan",3,88);
		stu.setScore(s);
		

	}

}
