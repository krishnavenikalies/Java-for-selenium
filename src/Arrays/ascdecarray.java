package Arrays;

public class ascdecarray {

	public static void main(String[] args) {
		int a[]= {300,100,500,400,800,50};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			/*To sort desc order
			      if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//System.out.println(a[i]);
				}*/
				//To sort ascend order
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
									
		}
			System.out.println(a[i]);
			

				
				
				
	}

}
}
