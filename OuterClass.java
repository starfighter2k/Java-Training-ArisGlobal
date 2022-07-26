
public class OuterClass {
	private int data=40;
	class Inner
	{
		void sayHi()
		{
			System.out.println("Data= "+data);
		}
	}
	public static void main(String[]args)
	{
		Inner inner = new OuterClass().new Inner();
		inner.sayHi();
	}
}
