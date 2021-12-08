package inheritpkg;

class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A

{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
	
}

class C extends B
{
	int p;
	int q;
	public void addition()
	
	{
		System.out.println(p+q);
	}
}

public class Test {

	public static void main(String[] args) {
		
	/*	A obj=new A();
		obj.a=100;
		obj.b=300;
		obj.display();*/
		
		 //with Extends keyword ,class B object can access Class A  ,Methods and variables
		
		/*B obj1=new B();
		obj1.x=56;
		obj1.y=45;
		obj1.show();
		
		obj1.a=200;
		obj1.b=300;
		obj1.display();*/
		// TODO Auto-generated method stub
		
		//Inheritence from class C object,It is multi level inheritence
		C obj2=new C();
		obj2.p=655;
		obj2.q=34;
		obj2.addition();
		obj2.a=200;
		obj2.b=300;
		obj2.display();
		obj2.x=56;
		obj2.y=45;
		obj2.show();
		

	}

}
