package collectiondemos;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo2 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add('G');
	al.add('A');
	al.add('U');
	al.add('R');	
	al.add('A');
	al.add('V');
	
	ArrayList arrlist=new ArrayList();
	arrlist.addAll(al);
	System.out.println(arrlist);//[G, A, U, R, A, V]

	arrlist.removeAll(al);
	System.out.println(arrlist);

	// sort -- Collections.sort()
	System.out.println("Elements in array list"+al);
	Collections.sort(al);
	System.out.println("Elements in array list"+al);

	Collections.sort(al,Collections.reverseOrder());
	System.out.println("Elements in array list"+al);

	// Shuffling 
	Collections.shuffle(al);
	System.out.println("Elements in array list"+al);


	}

}
