package collectiondemos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListdemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare ArrayList
		// ArrayList<String> al= new <String>ArrayList();
		// ArrayList<Integer> al= new <Integer>ArrayList();
		// List al=new ArrayList();
		ArrayList al= new ArrayList();
		
		
		// Add elements in ArrayList
		al.add(10);
		al.add("Welcome");
		al.add(19.7);
		al.add('S');
		al.add(true);
		
		// Display
		System.out.println("The ArrayList contains "+al);
		
		// size()
		System.out.println("The number of elements in ArrayList " +al.size());

		// Remove Elements
		al.remove(1);
		//al.remove("Welcome");  We can remove by providing value also
		System.out.println("The ArrayList contains "+al);

		// insert a new element
		//add(index,object)
		al.add(3,"Python");
		System.out.println("After insertion "+al);
		System.out.println("The number of elements in ArrayList " +al.size());//[10, 19.7, S, Python, true]
		
		// retreive specific element
		System.out.println(al.get(3));
		
		// replace element
		al.set(1,10.8);
		System.out.println("The arrayList contains"+al);
		
		// search - contains() -Return true or false
		System.out.println(al.contains("Python"));
		
		// isEmpty()-- Returns true or false
		System.out.println(al.isEmpty());

		// Reading Elements 
		// 1) for loop 
		/*System.out.println("Reading elements using for loop....");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		*/
		
		
		// 2) foreach loop
		/*System.out.println("Reading elements using foreach loop....");

		for(Object e:al) {
			System.out.println(e);
		}
		*/
		// 3) iterator()
		System.out.println("Reading elements using iterator....");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		
		
	}

}
