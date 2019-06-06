
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(1002,"Amit");
		s1.disStuInfo();
		s1.fee=3000;
		

	}

}

class Student{
	int rno;
	String name;
	static int fee;
	Student(int r, String n)
	{
		this.rno=r;
		this.name=n;
	}
	void disStuInfo() {
		System.out.println("Rno "+rno+" and name is "+ name );
		
	}
	}
