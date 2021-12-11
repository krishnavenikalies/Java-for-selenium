package collectiondemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListdemo {

	public static void main (String[] args){
	{
		//Declare ArrayList
		//ArrayList al=new ArrayList();  contains Hetrogenous data
		//ArrayList <String> al=new ArrayList <String>(); contains string elements
		//ArrayList<Integer> al=new ArrayList<Integer>(); contains integer elements
		ArrayList al=new ArrayList(); 
		
		//Add new elements in ArrayList,its adds at end of ArrayList
		al.add(100);
		al.add("welcome");
		al.add('A');
		al.add(14.5);
		al.add(true);
		System.out.println(al);
		
		//size()
		System.out.println("Number of elements in ArrayList"+al.size());//5
		
		//remove
		al.remove(1);  //here 1 is the index ,welcome removed
		//al.remove("welcome);  can also give value directly
		System.out.println(al);
		
		//to insert a new element with index
		
		al.add(3,"python");//3rd place ,it is inserted
		System.out.println(al);
		
		//Retrieve a specific element
		System.out.println(al.get(4));
		
		//To Replace element 
		//al.set(2, 45);
		System.out.println("After Replace elements "+al);
		
		//search element
		System.out.println(al.contains("python")); //returns true 
		
		System.out.println(al.contains("c#"));  //returns false 
		
		//is empty or not
		System.out.println(al.isEmpty());  //reurns false since arraylist has values
		
		//Read data with forloop or for each or iterator()
		
		/*for(int i=0;i<al.size();i++)
		 {
			 
			 System.out.println(al.get(i));
		 }*/
		
		//for each loop reading elements
		 /* for(Object e:al)
		  {
			  System.out.println(e);
		  }
		 }*/
		
		//iterator method
		System.out.println("Reading element with iterator method");
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		}
		
		
		
    
	}

}
