package exceptions;

public class exceptionsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		//Thread.sleep(4000);   //Intrepted exception ,exception shown by compiler shown in red line under code
		
		//int i=10;
		//System.out.println(i/0);  //Exception shown in runtime,compiler dont know to show
		
		System.out.println("stop");
		
		String s=null;
		//System.out.println(s.length());//Null pointer exception
		
		/*String st="123455";
		 int i =Integer.parseInt(st);  //integer stored as string can be stored in int
		 System.out.println(i);
		 String st="123455";*/
		/*String st="abcdef";
		int i = Integer.parseInt(st);  //Number format exception,string cannot be stored on string
		
		 System.out.println(i);*/
		 int a[]=new int[5];
		 a[10]=100;   //outofbound exceptions
		
		
		
		

	}

}
