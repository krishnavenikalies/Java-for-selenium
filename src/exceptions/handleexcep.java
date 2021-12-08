package exceptions;

public class handleexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start program");
		int a=20;
		/*try
		{
			System.out.println(a/0);  //Arithmetic Exeception
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("progress");*/
		
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
