package object;

public class staticexample {
	
	int a;
	static int b;
	
	
	static void m1()
	{
		System.out.println("This is static method");
	}
	
	void m2()
	{
		System.out.println("Thisis not static");
	}

	void m3()
	{
		a=456;  //Non static
		b=4566;  //static
		System.out.println(a);
		System.out.println(b);
		
		m1();   //static
		m2();  //Non static
	}
	public static void main(String[] args) {
		//Calling static methods and variable directly without objects
      /*  b=200;
        System.out.println(b);
        m1();*/
      //  a=100;  This  cannot be done because a and m2 is not static 
      //  m2();
        
       //Calling Non static method with object
		/* staticexample s=new staticexample();
        s.a=23;
        System.out.println(s.a);
        s.m2();*/
		
		//Calling Non static method
		staticexample s=new staticexample();
		s.m3();
		//System.out.println(b);
		//System.out.println(s.a);
		
        
        
	}

}
