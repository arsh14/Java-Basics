package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(9);
		hs.add(5);
		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}
		

	}

}
