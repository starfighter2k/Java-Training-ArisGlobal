package JavaIO;
import java.io.*;
public class ExampleFirst {
	public static void main(String []args)
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("d:\\output.txt");
			String s = "Some string";
			byte[] bs = s.getBytes();
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			bout.write(bs);
			bout.flush();
			bout.close();
			fout.close();
			FileOutputStream fout1 = new FileOutputStream("d:\\example1.txt");
			FileOutputStream fout2 = new FileOutputStream("d:\\example2.txt");
			ByteArrayOutputStream baout = new ByteArrayOutputStream();
			baout.write(65);
			baout.writeTo(fout1);
			baout.writeTo(fout2);
			baout.close();
			fout1.close();
			fout2.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
