
public class ThreadExample extends Thread {
	private static int i=0;
	public void run()
	{
		i++;
		for(int j=0;j<5000;j++)
		System.out.println("\t\t\t\t\tThis is thread "+i);
	}
	public static void main(String []args)
	{
		ThreadExample obj = new ThreadExample();
		obj.start();
//		obj.start();
		for(int j=0;j<10000;j++)
			System.out.println("main thread");
	}
}
