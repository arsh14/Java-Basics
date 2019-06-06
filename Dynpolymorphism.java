
public class Dynpolymorphism {
	public static void main(String[] args) {
		GradeA a = new GradeA();
		a.hours(3000);
		GradeB b = new GradeB();
		b.hours(3000);
		Employee e;
		e = new GradeA();
		GradeA ga = new GradeA();
		
	}

}
abstract class Employee{
	abstract void bonus(int sal);
} /*E is usedfor upcasting*/
class GradeA extends Employee{
	void hours(int sal) {
		int b =sal*30/100;
		System.out.println("Hours of Grade A "+b);
	}
	void displayInfo() {
		System.out.println("Hii");
	}
	@Override
	void bonus(int sal) {
		System.out.println("5000");
		
	}
}
class GradeB extends GradeA{
	void hours(int sal) {
		int b =sal*20/100;
		System.out.println("Hours of Grade A "+b);
	}
	
}
