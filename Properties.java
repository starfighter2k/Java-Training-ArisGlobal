package JavaIO;
import java.io.*;
import java.util.*;
public class Properties {
	private String data;
	private HashMap<String,String> dataMap = new HashMap<String,String>();
	private static boolean created=false;
	private static Properties currentLink=null;
	private Properties(String path)
	{
		linkPropertiesFile(path);
	}
	public static Properties createLink(String path)
	{
		if(created)
			return currentLink;
		else
		{
			created = true;
			currentLink = new Properties(path);
			return currentLink;
		}
	}
	public void destroyLink()
	{
		created = false;
		currentLink = null;
	}
	private String readFile(String path)
	{
		int i;
		String res = "";
		try {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(path));
		while((i = bin.read()) != -1)
		{
			res += (char)i;
		}
		bin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
	private boolean verifyLine(String line)
	{
		if(!(line.startsWith("db.")))
		{
			return false;
		}
		StringTokenizer st = new StringTokenizer(line,".");
		if(st.countTokens() != 2)
			return false;
		st.nextToken();
		String rest = st.nextToken();
		st = new StringTokenizer(rest,"=");
		if(st.countTokens()!=2)
			return false;
		String key = st.nextToken();
		String value = st.nextToken();
		dataMap.put(key, value);
		return true;
	}
	private void verifyData() throws InvalidFileException
	{
		StringTokenizer lines = new StringTokenizer(data,"\n");
		int numberOfLines = lines.countTokens();
		for(int i=0;i<numberOfLines;i++)
		{
			if(!verifyLine(lines.nextToken()))
			{
				throw new InvalidFileException("The file is invalid");
			}
		}
	}
	public String getMessage(String key)
	{
		if(!dataMap.containsKey(key))
		{
			System.err.println("Invalid key!");
			return null;
		}
		else
			return dataMap.get(key);
	}
	public void linkPropertiesFile(String path)
	{
		System.out.println("File Reading beginning");
		this.data = readFile(path);
		System.out.println("File reading finished");
		System.out.println("File data validation beginning");
		try
		{
			verifyData();
		}
		catch(InvalidFileException e)
		{
		System.err.println(e);}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("File data validation successful.");
		System.out.println("DB populated. Can access values from properties using keys");
	}
	public static void main(String []args)
	{
		String path = "d:\\config.properties";
		Properties obj = Properties.createLink(path);
		System.out.println("Value for date = "+obj.getMessage("date"));
	}
	
}
