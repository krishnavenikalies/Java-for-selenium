package interfaces;

interface A
{
	int a=10;
	void display();
	
}
interface B extends A  //from 1 interface to another interface "extends" is used
{
	int b=24;
	void show();
	
}

public class multipleinher implements B,A  //from interface to class "implements" used

{
	public void display()
	{
		System.out.println(a);
	}
	public void show()
	{
		System.out.println(b);
		
	}

	public static void main(String[] args)
	{
	multipleinher mi=new multipleinher();
	 mi.display();
	 mi.show();

	}

}
