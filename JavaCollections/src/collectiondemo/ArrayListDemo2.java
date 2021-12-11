package collectiondemo;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("P");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);  //adds all elements of collection al to al1 ArrayList

	System.out.println(al1);
	
	
	al1.removeAll(al);
	System.out.println("After removing" +al1);
	
	//Sort ....Collections.Sort in util package
	
	System.out.println(al);
	
	Collections.sort(al); //Sort method
	
	System.out.println("After sorting "+al);
	
	
	Collections.sort(al,Collections.reverseOrder());  //sort in reverse order
	
	System.out.println(al);
	
	//Shuffling --Collections.shuffle()
	
	Collections.shuffle(al);
	
	System.out.println("Shuffle the elements" +al);
	
	
	
	
	
	}

}
