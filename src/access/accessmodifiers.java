package access;

class A
{
	/*private int i=10;
	private void m1()
	{
		System.out.println(i);
	}*/
	 int i=10;
	 void m1()
	{
		System.out.println(i);
	}
}

public class accessmodifiers {
	public static void main(String args[])
	{
	 A obj=new A();
	//  obj.i=10; //cannot access private variable
	// obj.m1();  //cannot access private method outside that class
	obj.i=10;
	obj.m1();
	
	}

}
