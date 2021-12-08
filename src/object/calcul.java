package object;

public class calcul {
	int a;
	int b;
	//1.method without taking parameter
	/*void sum()
	{
		System.out.println(a+b);
	}*/
	
	//2.method taking parameter 
	
	/*void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/

	//3.method returns value
	/*int sum()
	{
		return(a+b);
	}*/
	//4.method do not return value
	
	void sum()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		/*calcul cal=new calcul();
		cal.sum (244,345);*/
		
		calcul cal=new calcul();
		cal. a=345;
		cal. b=3465;
		cal.sum();
         //3.Returns values
		/*calcul cal=new calcul();
		cal.a=100;
		cal.b=200;
		cal.sum();
		int r=cal.sum();
		System.out.println(r);*/
		
	}

}
