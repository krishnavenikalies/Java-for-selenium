package exceptions;

public class Trycatchfinally {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		try
		{
	arr[10]=100;  //ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e)  //in catch exception is different so it is not handled throws exception
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally");//finally always executed
		}
		// TODO Auto-generated method stub

	}

}
