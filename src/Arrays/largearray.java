package Arrays;


public class largearray {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int a[]= {500,300,400,800, 200};
		int large =a[0];
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			
			if(a[i]>a[0])
			{
				
				large=a[i];
				
				//System.out.println("largest no is"+large);
			
			}
			else
			{
				small=a[i];
				
				
			}						
			
			
		}
		System.out.println("largest no is"+large);
		System.out.println("Smallest no is"+small);
		

	}

}
