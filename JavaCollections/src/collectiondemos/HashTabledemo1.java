package collectiondemos;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTabledemo1 {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();// capacity is 11,load factor is 0.75
		// Hashtable ht=new(initial capacity);// create hashtable object with some capacity

		//Hashtable ht=new(initial capacity,fill ratio / load factor);
		
		//Hashtable <Integer,String>ht=new Hashtable <Integer,String>();
		ht.put(101,"Gaurav");
		ht.put(102,"Keshav");
		ht.put(103,"Virat");
		ht.put(104,"Yuvraj");
		//ht.put(null,"Swapnil"); // NullPinterException
		// Null are not allowed either in key and value in Hashtable
		//ht.put(105,null); // NullPinterException
		
		
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		//System.out.println(ht.remove(103));
		System.out.println(ht);
		
		System.out.println(ht.containsKey(104));// ture
		
		System.out.println(ht.containsKey(105));// false
		
		System.out.println(ht.containsValue("Virat"));// true

		System.out.println(ht.isEmpty());// false
		
		System.out.println(ht.keySet());// [104, 103, 102, 101]

		System.out.println(ht.values());// [Yuvraj, Virat, Keshav, Gaurav]

		System.out.println(ht.entrySet());
		
//		for(Object e:ht.keySet()) {
//			System.out.println(e+"  "+ht.get(e));
//		}

		// Emtry Methods
		//****************
//		for(Map.Entry entry :ht.entrySet()) {
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//		}
//		
		// iterator
		Set<Map.Entry<Integer, String>> s = ht.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = s.iterator(); // Using iterator() instead of spliterator()
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next(); // Correct casting
            System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
		
	}

}
