

public class childclass extends parentclass {
	
	String name="udemy practice";
	public childclass()
	{
		super();   //This should always be in first line of code 
		System.out.println("child class constructor");
	}
	public void stringdata()
	{
		System.out.println(name);   //print childclass name
		System.out.println(super.name);  //It prints the name in parent class
		
	}
public void getdata()
{
	super.getdata();
	System.out.println("Iam in child class");
}
	public static void main(String[] args) {
		childclass cc=new childclass();
		cc.getdata();   //child class constructor    it is getdata     Iam in child class
		cc.stringdata();
		cc.parentdemo();

	}

}
