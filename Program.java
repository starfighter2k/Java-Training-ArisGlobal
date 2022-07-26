import java.util.ArrayList;
import java.util.Iterator;
public class Program {
	public static void main(String []args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rama");
		list.add("hari");
		list.add("Krishna");
		list.add("Ajay");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
