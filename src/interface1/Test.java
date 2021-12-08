package interface1;


final class Inter
{
	final int a=20;
	final void m1()
	{
		//a=34;  value cannot be changed bec 'a' is a final variable 
		System.out.println(a);
	}
}
class Inter1 extends Inter  // we cannot inherit Inter class bec it is final
{
	/*void m1()  //not valid bec m1 is final method
	{
		
		System.out.println("m1 overrided");
	}*/
}

public class Test {
	
	

	public static void main(String[] args) {
		/*Inter1 in=new Inter1();
		in.m1();*/
		
		Inter in1=new Inter();
		in1.m1();
		
		
		

	}

}
