package loops;

public class continuestmt {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//it will not print 5
			}
		System.out.println(i);//o/p 1 2 3 4 6 7  8 9 10 
		}
	}

}
