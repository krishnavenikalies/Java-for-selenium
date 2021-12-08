package Arrays;

public class Arraytwo {

	public static void main(String[] args) {
		String s[]=new String[4];
		s[0]="hello";
		s[2]="hai";
		s[1]="harithra";
		
		System.out.println(s.length); //returns length of string .o/p is 4
		for(String g:s)
		{
			System.out.println(g); // it reads all elements in array

		}
		
	}

}
