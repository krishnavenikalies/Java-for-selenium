package ArraList;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList a1=new ArrayList();
		System.out.println("number of elements"+a1.size());  //no of elements in arraylist before adding is 0
		//adding elements in arraylist
		
		a1.add("welcome");
		a1.add(10);
		a1.add(10.234);
		System.out.println("number of elements after adding "+a1.size());  //3 after adding
	//inserting elements into arraylist
		a1.add(2,"banana");  //In 2nd place banana is stored
		a1.add(1,1234);
		
		System.out.println("number of elements after adding "+a1.size()); 
	System.out.println("elements in array list"+a1);
	
	//Removing elements from arraylist
	a1.remove(10.234);//directly specify value
	System.out.println("number of elements after removing"+a1.size());  
	
	a1.remove(2); // after 2nd element ,its removed
	
	System.out.println("elements in array list"+a1);
	
	}

}
