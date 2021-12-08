package Arrays;

public class Stringmethods {

	public static void main (String[] args) {
		
   String s="Harithra";
   System.out.println(s.length());
   
   //concatenation
   
   String s1 ="Hello";
   String s2 ="world";
   
   //These way we can concat 2 strings
   System.out.println(s1+s2);
   System.out.println(s1.concat(s2));
   System.out.println("Hello"+"world"); 
   System.out.println("Hello".concat("world"));
     
   
		//Equals method always return Boolean values
   
   String s3="WELCOME";
   String s4="welcome";
   System.out.println(s3.equals(s4));//false output since equals chcek for case sensitive
   System.out.println(s3.equalsIgnoreCase(s4));	 //It will ignore case sensitivity
   
   //Contains() also returns Boolean as result
   
   System.out.println( s3.contains("WEL")); //True..It checks case sensitive
   
   System.out.println(s3.contains("xyz")); //false 
   
   
   //substring
   
   String s5="Dharmik";
   System.out.println(s5.substring(3,5));//rm is output ,3 is starting index and 5 is ending index
   System.out.println(s5.substring(2,6));//armi is result 
   
   
   
   //replace method
   
   String s6="Madurai";
   System.out.println(s6.replace('a', 'h'));  //It replace a char in string with h
   System.out.println(s6.replace("rai", "Madhu"));//It replace rai to Madhu
    
   
   
   
   
   
   
	}

}
