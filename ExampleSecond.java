package JavaIO;
import java.io.*;
public class ExampleSecond {
	public static void main(String []args)
	{
		try {
		FileInputStream fin = new FileInputStream("d:\\output.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		FileInputStream fin2 = new FileInputStream("d:\\output2.txt");
		BufferedInputStream bin2 = new BufferedInputStream(fin2);
		SequenceInputStream inst = new SequenceInputStream(bin,bin2);
		int res = inst.read();
		while(res != -1)
		{
			System.out.print((char)res);
			res = inst.read();
		}
		System.out.println();
		inst.close();
		bin2.close();
		fin2.close();
		bin.close();
		fin.close();}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
