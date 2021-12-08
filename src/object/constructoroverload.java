package object;

public class constructoroverload {
	
	int a=0;  //internal variable
	int b=0;
	double c =0;
	//Default constructor
	constructoroverload()
	{
		a=10;
		b=30;
		c=40;
		
	}
	//Parameterized constructor
	constructoroverload(int x,int y)  //x,y are external variables,when using this keyword int a,int b can be passed here
	{
		a=x; //can also give same variable as,this.a=a;
		b=y;  //this.b=b;
		System.out.println(a + b);
		
	}
	constructoroverload(int x ,int y,double z)
	{
		a=x;
		b=y;
		c=z;
	}
	constructoroverload(int x ,double y,int z)
	{
		a=x;
		b=z;
		c=y;
	}
	
	void display()
	{		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	

	public static void main(String[] args) {
		
		// constructoroverload co=new constructoroverload();
		constructoroverload co=new constructoroverload(23,45);
		//constructoroverload co=new constructoroverload(34,45,34.34);
		//constructoroverload co=new constructoroverload(34,56.5,34);
		co.display();
		

	}

}
