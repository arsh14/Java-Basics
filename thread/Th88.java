package thread;

public class Th88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Th2 t =new Th2();
		//t.start();
		Th2 t2 = new Th2();
		Th2 t3 = new Th2();
		Th2 t4 = new Th2();
		
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		t4.start();

	}

}

class Th2 extends Thread{
	public void run(){
	for (int i = 0;i<5;i++) {
	System.out.println("thread by Thread class " + i);
	try {Thread.sleep(1000);
	//to introduce delay
	//time in msec
	}
	catch(InterruptedException e ) {
		e.printStackTrace();
			}
		}
	}
}
