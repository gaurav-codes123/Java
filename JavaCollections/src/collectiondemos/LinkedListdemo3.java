package collectiondemos;
import java.util.*;
public class LinkedListdemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Cat");
		l.add("Cat");
		l.add("Dog");
		l.add("Cow");
		l.add("Rabbit");
		
		System.out.println(l);

		l.addFirst("Tiger");
		l.addLast("Elephant");
		System.out.println(l);
		System.out.println(l.size());// [Tiger, Cat, Cat, Dog, Cow, Rabbit, Elephant]

		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		// removeFirst and removeLast
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);



	}

}
