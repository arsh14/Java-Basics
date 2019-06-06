
class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=5;
			int b=0;
			int ar[]= {5,6,3};
			try{
				System.out.println(ar[9]);
				System.out.println(a/b);
			}
			/*catch(ArithmeticException e) {
				e.printStackTrace();
			}*/
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("hhh");
		

	}

}
