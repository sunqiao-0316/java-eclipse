package com.neuedu.part07;
import com.neuedu.part06.*;//�����
import java.util.Scanner;//������е�scanner��
/**
 * �������ĸ߼����ԣ��̳� ��װ ��̬
 * 1.�̳У��������Ч����ά������������
 * ����(������)�̳и���(����)�����Լ̳и�������ԡ�������һ�����������¹�����չ��һ����ֻ�ܼ̳�һ�����࣬һ����������ж������
 * ������ extends ������{}
 * ����ʵ����ʱ�����ȵ��ø���Ĺ��췽������ʵ�������ٵ��������Լ��Ĺ��췽��
 * super�ؼ��ִ���ǰ����ĸ������
 * super()�����๹�췽������Ҫ�������๹�캯����һ�䣬���ܺ�this()ͬʱ����
 * �����⣺����ʵ����˳���ȹ��츸���������
 * 2.�������������ȫ����:com.neuedu.part07.Test0114/
 * import.����İ���.����
 * java.lang���µ��಻��Ҫ���룬����ֱ��ʹ��
 * ����������ʱ��ֻ�ܵ���public���ε���
 * 3.��װ
 * public ��Χ���
 * protected ���ڵ�ǰ���ͬһ����ʹ�ã��ڲ�ͬ����ʱ�̳������ʹ�ã������������Ժͷ���
 * default Ĭ�ϵ� ֻ���ڵ�ǰ���ͬһ���е������ʹ��
 * private ˽�е� ֻ���ڵ�ǰ��ʹ�ã�ͨ��������������
 * ��ֻ����public����Ĭ��
 * ���пɼ������η��ı�������ĳ�Ա�������Ƿ����ľֲ�����
 * 4.����������
 * �������Ե�˽�л�����Ҫ�ض��ṩ��ȡ�͸�ֵ�ķ�ʽ�������ַ�����Ϊ����������
 * ��ȡgetter��public ����ֵ���� get������(){ return �������� }
 * ��ֵsetter��public void set������(�������Ͳ���ֵ){ ������ = ����ֵ�� }
 * ��Ҫ�Զ�������������ʽ����ָ�����࣬�Ҽ����sourceѡ��generate getterssetters 
 * 5.�����ĸ���
 * ������д����ķ����и���
 * ���ǵĹ�����Ҫ����ͬ�ķ�����
 *         ��Ҫ����ȫһ�µĲ���
 *         ����ֵ������ͬ
 *         ���౻���Ƿ���Ȩ��С�ڵ������෽��
 * �����⣺�������غͷ������ǵ�����
 * ������ͬһ���ˮƽ��ϵ�������Ǹ�����Ĵ�ֱ��ϵ���ٷֱ�������صĹ���͸��ǵĹ���
 * 6.������������ת��
 * ����ת�ͣ�����ת���ɸ��࣬�Զ�ת��
 * ��Ҫ���Ӹ���̳й�ϵ��ת��֮��ᶪʧ������չ�����Ժ���Ϊ
 * ����ת�ͣ�������ʾ��ת�������࣬ǿ��ת��
 * ֻ�о���������ת�ͣ���������ת��
 * instanceOf�ؼ���
 * �ж�����ת�ͺ�Ķ��������ĸ���
 *
 */

public class Test0114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITworker itworker=new ITworker("java",500,"mark","20",10);//����ʵ����������Ȼ���Ե��ø��෽��
		
		itworker.getAll();
		itworker.jiaban();
		Employee e=new Employee();
		com.neuedu.part06.Employee e1=new com.neuedu.part06.Employee();//������6�Ĵ��������
		pro();
	}
	
	protected static void pro(){
		System.out.println("����potected���ε���");
		
		ITworker itworker=new ITworker();
		itworker.getAll();
	}
	
	
	//������������ת��
	//����ת��
	Employee employee=new ITworker();//����ת��Ϊ����
	//����ת��
	ITworker itworker=(ITworker) employee;//����תΪ����

}
class Employee{//������
	String name;
	String birth;
	private String age;
	private double salary;//����˽�л�
	//����������
	public double getSalary1(){//��ȡgetter����
		return this.salary;
	}
	public void setSalary1(double salary){//����setter����
		this.salary=salary;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	public Employee(){
		System.out.println("���Ǹ��๹�췽��");
	}
	public Employee(String name,String birth,double salary){
		this.name=name;
		this.birth=birth;
		this.salary=salary;
	}
	public void getAll(){
		System.out.print("name is "+name+"  birth is "+birth+"  salary is "+salary);
		System.out.println();
	}
	public double getSalary(){
		System.out.println("salary is"+salary);
		return salary;
	}
}




class ITworker extends Employee{//����Ա��,�̳д�����
	String ltype;//��������
	int code;//ÿ��д�Ĵ�����
	public ITworker(String ltype,int code,String name,String birth,double salary){
		super(name,birth,salary);
		this.ltype=ltype;
		this.code=code;
	}
	public ITworker(){
		System.out.println("�������๹�췽��");
	}
	public void jiaban(){
		System.out.println(super.name+"ʹ��"+ltype+" "+code);
	}
	public void nianling(){
		System.out.println(super.getAge());
	}
	
	//��������
	@Override
	public void getAll(){
		System.out.print("name is "+name+"  birth is "+birth+"  salary is "+getSalary()+"������"+ltype);
		System.out.println();
		
	}
}