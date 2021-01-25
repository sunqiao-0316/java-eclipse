package zuoye.part06;

public class Student {
	String name;
	int id;
	int score;
	public Student(){
		
	}
	public Student(String name, int id, int score){
		this.name=name;
		this.id=id;
		this.score=score;
	}
	public String name(){
		return name;
	}
	public int id(){
		return id;
	}
	public int score(){
		return score;
	}
	
	public void setScore(Student[] s){
		for(int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j+1].score>s[j].score){
					Student temp;
					temp=s[j+1];
					s[j+1]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].name+" "+s[i].id+" "+s[i].score);
		}
	}

}
