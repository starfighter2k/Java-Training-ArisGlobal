
public class Prog7 {
	public static void main(String []args)
	{
		IFace iface = new IFaceAdaptor() {
			public void sayOne()
			{
				System.out.println("Say one");
			}
		};
		iface.sayOne();
	}
}
