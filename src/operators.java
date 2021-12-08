
public class operators {

	public static void main(String[] args) {
		int a=40;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a%b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		//Relational operators
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// Logical operators
		
		boolean x =true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		//Assignment operator
		
		int c;
		c = a;
		System.out.println(c);
		c=b;
		
		System.out.println(c);
		
		//increment
		int g=100;
		//g=g+1;  instead of this can give as g++ to increment 1 time
		//g++;
		//g+=5;  it returns as 105 value for g by incrementing 5.Normally g=g+5 can be written 
		//g-=5;   it returns 95 for g by decrement 5 .can also be as g=g-5
		//g--;// It returns 99 as output by decrementing 1
		System.out.println(g);
		
		

	}

}
