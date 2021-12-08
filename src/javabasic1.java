
public class javabasic1 {

	public static void main(String[] args) {
		
		String str="ABCD";
		String rev="";
		//To reverse the string
		
		/*int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);  //DCBA
		}
		
		System.out.println("Reverse string"+rev);*/
		
		//using character array
		
		/*char a[]=str.toCharArray();
		
		int len=a.length; //4
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];  //DCBA
		}
		
		System.out.println("Reverse string"+rev);*/
		
		//Using StringBuffer class
		
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
