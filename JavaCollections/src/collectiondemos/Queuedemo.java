package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuedemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue(); // Heterogenous Data is not allowed
		
		// Adding elements add()  offer()
		q.add("A");
		q.add("B"); 
		q.add("C");
		q.offer("C");
		
		System.out.println(q); // [A, B, C, C] // Insertion order preserved & duplicates allowed

		// get head elements   element() peek()
		//System.out.println(q.element());// A Returns head element , if empty returns NoSuchElementException
		//System.out.println(q.peek());// A Returns head element , if empty returns null

		// Return & remove element from queue remove() poll()
		
//		System.out.println(q.remove());// A
//		System.out.println(q);// [B, C, C]
		
//		System.out.println(q.poll());// A
//		System.out.println(q);// [B, C, C]
		
		// Reading elements from queue using iterator
		
		/*Iterator it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		// Reading elemnts using for..each loop
		for(Object e:q) {
			System.out.println(e);
		}
		
		
		// LinkedList class can also be implemented using Queue interface
		
		
		// LinkedList l=new LinkedList(); // Heterogenous Data is  allowed

		// Methods are same for PriorityQueue and LinkedList
	}

}
