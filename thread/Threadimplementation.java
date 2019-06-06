package thread;

public class Threadimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");
		Th t=new Th();
		Thread thread= new Thread(t);
		thread.start();

	}

}
class Th implements Runnable{
	@Override
	public void run() {
		System.out.println("my thread");
	}
}
