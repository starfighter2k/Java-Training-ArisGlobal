package training;

public class ManControl {
	public int returnSalary(Man man)
	{
		return man.getSalary();
	}
public static void main(String []args)
{
	ManControl mc=  new ManControl();
	System.out.println(mc.returnSalary(new Engineer()));
}
}
