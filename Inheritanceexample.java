
public class Inheritanceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob =new A();
		B ob2 =new B();
		System.out.println(ob.x);
		System.out.println(ob2.y);
		System.out.println(ob2.x);

	}

}
class A{
	int x=12;
}
class B extends A{
	int y=9;
}