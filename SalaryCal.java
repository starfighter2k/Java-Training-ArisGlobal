
public class SalaryCal extends Thread{
	private String type;
	private static double salary;
	public double calHRA(double basic)
	{
		System.out.println("HRA Thread");
		return 0.25*basic;
	}
	public double miscA(double basic)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Misc Thread");
		return 0.1*basic;
	}
	public void run()
	{
		if(type == "HRA")
			salary += calHRA(salary);
		else if(type == "Misc")
			salary += miscA(salary);
	}
	public static void main(String []args)
	{
		double basic = 35000;
		salary = basic;
		SalaryCal miscObj = new SalaryCal();
		miscObj.type = "Misc";
		SalaryCal hraObj = new SalaryCal();
		hraObj.type = "HRA";
		miscObj.start();
	
		hraObj.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Salary final = "+salary);
	}
	
}



