package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapdemo1 {

	public static void main(String[] args) {
		//HashMap m=new HashMap();// capacity is 16,load factor is 0.75
		HashMap <Integer,String> m=new HashMap <Integer,String>();
		m.put(101, "John");
		m.put(102, "Harry");
		m.put(103, "Joe");
		m.put(104, "Steve");
		m.put(105, "Micah");
		m.put(103,"x");// 103 value replaced by x
		m.put(106,"Micah");// Duplicate value allowed

		System.out.println(m);// {101=John, 102=Harry, 103=Joe, 104=Steve, 105=Micah}
		
		System.out.println(m.get(104));// Steve
		//System.out.println(m.remove(103));// x
		System.out.println(m);// {101=John, 102=Harry, 104=Steve, 105=Micah, 106=Micah}

		System.out.println(m.containsKey(103));// false
		System.out.println(m.containsKey(101));// true
		
		System.out.println(m.containsValue("Harry"));// true
		
		System.out.println(m.isEmpty());// false
		// Retreive only keys
		
		System.out.println(m.keySet());// [101, 102, 103, 104, 105, 106]
		
		for(Object e:m.keySet()) {
			System.out.println(e);
		}
		
		// Retreive only values
		System.out.println(m.values());// not set as duplicate allowed in values [John, Harry, x, Steve, Micah, Micah]
		for(Object e:m.values()) {
			System.out.println(e);
		}
		
		
		
		// get all Entry as set
		//System.out.println(m.entrySet());// returns all the entries as set
		
//		for(Object i:m.keySet()) {
//			System.out.println(i+"  "+m.get(i));
//		}
		
		// Entry Methods
		//****************
		
//		for(Map.Entry entry :m.entrySet())
//		{
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//		}
		
		// Iterator
		
		Set<Map.Entry<Integer, String>> s = m.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = s.iterator(); // Using iterator() instead of spliterator()

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next(); // Correct casting
            System.out.println(entry.getKey() + "  " + entry.getValue());
			}

	}

}
