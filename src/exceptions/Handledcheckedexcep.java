package exceptions;

public class Handledcheckedexcep {

	public static void main(String[] args) throws InterruptedException   //throws in method ,not as stmts like try and catch
	{
		System.out.println("started");
		System.out.println("progress");
		
		/*try
		{
			Thread.sleep(4000);
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		
		Thread.sleep(4000);
		
		System.out.println("executed");
	}

}
