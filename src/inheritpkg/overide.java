package inheritpkg;

class Bank
{
	int getRateofInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateofInterest()
	{
		return 10;
	}
}
class Axis extends Bank
{
	int getRateofInterest()
	{
		return 15;
	}
}
class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 5;
	}
}

public class overide {

	public static void main(String[] args) {
	
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateofInterest());
		Axis axisobj=new Axis();
		System.out.println(axisobj.getRateofInterest());
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateofInterest());
		

	}

}
