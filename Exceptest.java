
public class Exceptest {
	public static void main(String []args)
	{
		try
		{
			String s="vikas";
			int x = Integer.parseInt(s);
			System.out.println("Number = "+x);
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("Please enter a number");
		}
		System.out.println("Important step");
	}
}
