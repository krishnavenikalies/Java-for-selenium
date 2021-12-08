package ArraList;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		//add elements 
		
		list.add("apple");
		list.add("sds");
		list.add("amma");
		System.out.println(list.size());
		for(String s:list) //reading elements from arraylist
		{
			System.out.println(s);
		}

	}

}
