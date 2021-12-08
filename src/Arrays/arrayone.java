package Arrays;

public class arrayone {
public static void main (String args[])
{
	int a[]=new int[5]; //declaration of an array with 5 elements
	a[0]=2;
	a[1]=4;
	a[2]=5;
	a[4]=56;
	a[3]=45;
	
	//System.out.println(a[4]);
	//read elements from an array
	
	/*for(int i=0;i<=4;i++)
	{
		System.out.println(a[i]);
	}*/
	
	//for..each loop
	for(int i :a)
	{
		System.out.println(i);
	}
}
}
