package object;

public class methodoverload {
	
	int a;
	int b;
	
	void sum()
	
	{
		a=30;
		b=46;
		System.out.println(a+b);
	}

	
	void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
		
			}
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] args)
	{
		    methodoverload mo=new methodoverload();
		    mo.sum(); //without parameter
		    mo.sum(50,30);//parameter as 2 int values
		    mo.sum(45,56,23);//parameters as 3 int values
		    mo.sum(45, 34.56);//parameters as diff datatypes

	}

}
