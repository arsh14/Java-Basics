package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mp =new HashMap<>();
		mp.put(101, "java");
		mp.put(102, "python");
		mp.put(110, "android");
		System.out.println(mp.get(101));
		Set<Integer> key = mp.keySet();
		Iterator<Integer> itr =key.iterator();
		while(itr.hasNext()) {
			
			int k = itr.next();
			System.out.println(k+" :: " + mp.get(k));
		}

	}

}
