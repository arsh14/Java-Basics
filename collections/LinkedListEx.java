package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListEx {

	public static void main(String[] args) {
		ArrayList<Integer> ls =new ArrayList<>();
		ls.add(12);
		ls.add(5);
		ls.add(61);
		System.out.println(ls.size());
		
		System.out.println("elements of array are "+ ls);
		System.out.println(ls.get(0));
		
		int x =(int)ls.get(0);
		//if in generic value
		//int y=ar.get(0)
		//typecasting as the object is being returned
		
		for (int a : ls) {
			System.out.println(a);
		}
		
		Iterator<Integer> itr = ls.iterator();
		//automatic to first element 
		//returns true is present
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}
	}
}
