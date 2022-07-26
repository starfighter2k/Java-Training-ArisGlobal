package training;
import java.util.Scanner;
public class HeightAdd {
	public static void main(String []args)
	{
		HeightConvert h1=  new HeightConvert();
		HeightConvert h2 = new HeightConvert();
		h1.setHeight(2, 1);
		h2.setHeight(1, 2);
		double res = h1.add(h2);
		System.out.println("Result height= "+res+"cm");
	}

}
