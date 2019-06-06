
import Inheritanceexample.A;
public class Test2 {

	public static void main(String[] args) {
		A ob =new A();
		System.out.println(ob.x);
		Modifier a = new Modifier();
		System.out.println(a.y);
		

	}

}
class Modifier{
	 int  y =10;
}
