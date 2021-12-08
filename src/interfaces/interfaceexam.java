package interfaces;

interface testint
{
	int a=5; //by default variable is static and final
  void display();  //abstract method ,this in default is public access modifier,This method used in immediate class

}


public class interfaceexam implements testint
{ 
	public void display()  //here public used to make as public access modifier to equalize as interface
	{
		System.out.println(a);  //bec in interface abstract method access modifier is always public
	}

	public static void main(String[] args)
	{
		interfaceexam ie=new interfaceexam();
		ie.display();

	}

}
