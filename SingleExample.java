package training;

public class SingleExample {
	private static boolean created = false;
	private static SingleExample obj=null;
	private SingleExample() {
	}
	public static SingleExample createObject()
	{
		if(created)
			return obj;
		else
		{
			created = true;
			obj = new SingleExample();
			return obj;
		}
	}
	public static void destroyObject()
	{
		created = false;
		obj=null;
	}
}
