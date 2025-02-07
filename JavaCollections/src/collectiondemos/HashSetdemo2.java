package collectiondemos;

import java.util.HashSet;

public class HashSetdemo2 {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		hs.add("Gaurav");
		hs.add(19.9);
		hs.add("A");
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		HashSet h=new HashSet();
		h.addAll(hs);
		System.out.println(h);
//		h.removeAll(h);
//		System.out.println(h);
		
		
	}

}
