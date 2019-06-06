
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itest ob = new Itest();
		ob.hours();
		ob.sal();
	

	}

}
interface I1{
	void hours();
}
interface I2{
	void sal();
}

class Itest implements I1,I2{
	public void hours() {
		System.out.println("5000");
	}
	public void sal() {
		System.out.println("6000000");
	}
}

