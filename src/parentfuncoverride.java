
public class parentfuncoverride extends parentclass {
	String name="selenium";
	
	public parentfuncoverride()
	{
		super();   //This should always be in first line of code 
		System.out.println("parent class constructor");
	}
	public void stringdata()
	{
		System.out.println(name);  //selenium
		System.out.println(super.name); //veni
		
	}
	public void getdata()
	{
		System.out.println("Local class method");
	}
	

	
	public static void main(String[] args) {
			parentfuncoverride cc=new parentfuncoverride();
			cc.getdata();   
			cc.stringdata();
			cc.parentdemo();

		}

	}


