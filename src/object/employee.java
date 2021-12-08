package object;

public class employee {
	
	int empid=20;
	String emname="Hari";
	void display()
	{
		System.out.println(empid);
		System.out.println(emname);
	}
	public static void main(String args[])
	{
		employee emp=new employee();
		//emp.empid=23;
		//emp.emname="hari";
		
		emp.display();
	}

}
