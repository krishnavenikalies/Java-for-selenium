package object;

public class myoops {
	
	int empid;
	String empname;
	int emsal;
	//constructor assigning variables
	/*myoops(int id,String name,int salary)
		{
		empid=id;
		empname=name;
		emsal=salary;
	     }*/
	
	//Using method passing values to variable
	void setdata(int id,String name,int salary)
	{
		empid=id;
		empname=name;
		emsal=salary;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(emsal);
		
	}
	
	public static void main (String args[])
	{
		//Asssigning values to variables directly using object -First method
		/*myoops emp=new myoops();
		emp.empid=30;
		emp.empname="harithra";
		emp.emsal=43454545;
		emp.display();
		
		myoops emp1=new myoops();
		emp1.empid=31;
		emp1.empname="Dhar";
		emp1.emsal=43385345;
		emp1.display();*/
		
		//Assigning values to class variables using constructor - 2nd method
		
	/*	myoops emp=new myoops(32,"Kalies",3656546);
		emp.display();*/
		
		//Assigning values to variable using method
		myoops emp=new myoops();
		emp.setdata(36, "Kumaresh",3454546);
		emp.display();
		
	}

}
