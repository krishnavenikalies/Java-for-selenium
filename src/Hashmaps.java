import java.util.HashMap;
import java.util.Map;
public class Hashmaps {

	public static void main(String[] args) {
		
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		
		hm.put(200, "Raj");
		hm.put(100, "rahul");
		hm.put(300, "add");
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
			
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
         hm.remove(300);
         System.out.println(hm);
	}

}
