package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Lists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList ar =new ArrayList();
		//generic way
		ArrayList<Integer> ar =new ArrayList();
		ar.add(12);
		ar.add(5);
		ar.add(61);
		System.out.println(ar.size());
		
		System.out.println("elements of array are "+ ar);
		System.out.println(ar.get(0));
		
		int x =(int)ar.get(0);
		//if in generic value
		//int y=ar.get(0)
		//typecasting as the object is being returned
		
		for (int a : ar) {
			System.out.println(a);
		}
		
		Iterator<Integer> itr = ar.iterator();
		//automatic to first element 
		//returns true is present
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
