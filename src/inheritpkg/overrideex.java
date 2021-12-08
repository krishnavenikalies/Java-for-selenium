package inheritpkg;
class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
		
	}
}
class Bike
{
	void run()
	{
		System.out.println("Bike is Running");
	}
}




public class overrideex {

	public static void main(String[] args) {
		vehicle voj=new vehicle();
		voj.run();
		Bike boj=new Bike();
		boj.run();
		// TODO Auto-generated method stub

	}

}
