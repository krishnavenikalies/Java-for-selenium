

package Arrays;

public class twodimenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][2];
		//storing elements in to array
		a[0][0]=20;
		a[0][1]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[2][0]=30;
		a[2][1]=45;
		//classic for loop
		/*for(int i=0;i<=2;i++) //for increment rows
		{
			for(int j=0;j<=1;j++)   //execute all condn in j loop for columns completely
				
			{
				System.out.print(a[i][j]+"  ");  //after completing 0th row of all column it will go to next row
			}
			System.out.println(); //To display values like matrix   
		}*/
		
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+ " ");
				
			}
			System.out.println();
			
		}

	}

}
