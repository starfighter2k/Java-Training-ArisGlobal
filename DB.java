package JavaIO;
import java.io.*;
import java.util.*;
public class DB {
	private String user,password,url;
	private HashMap<String,String> dataMap = new HashMap<String,String>();
	private static boolean created = false;
	private static DB currentDB = null;
	private void setUser(String user) {
		this.user = user;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private void setUrl(String url) {
		this.url = url;
	}
	public void createFile(String user,String url,String password)
	{
		this.setPassword(password);
		this.setUrl(url);
		this.setUser(user);
		try {
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("d:\\config.properties"));
		String s = "db.user= "+this.user+"\ndb.password= "+this.password+"\ndb.url= "+this.url+"\n";
		byte[] bs = s.getBytes();
		bout.write(bs);
		bout.flush();
		bout.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getMessage(String field)
	{
		return dataMap.get(field);
	}
	public void readFile(ArrayList<String>fields)
	{
		int f=0;
		String data="";
		try
		{
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("d:\\config.properties"));
			int res = bin.read();
//			data="";
			while(res != -1)
			{
				data += (char)res;
				res = bin.read();
			}
			bin.close();
			StringTokenizer st = new StringTokenizer(data,"\n");
			if(st.countTokens() != 3)
				throw new InvalidFileException("The file has more lines than what is expected!");
			else
			{
				ArrayList <String> arr = new ArrayList<String>();
//				HashMap<String,String> dataMap = new HashMap<String,String>();
				for(int i=0;i<3;i++)
					arr.add(st.nextToken());
				for(int i=0;i<3;i++)
				{
					StringTokenizer line = new StringTokenizer(arr.get(i));
					if(line.nextToken().equals("db."+fields.get(i)+"="))
					{
						dataMap.put(fields.get(i), line.nextToken());
					}
					else
						throw new InvalidFileException("The file has invalid "+fields.get(i)+" format");
				}
			}
		}
		catch(InvalidFileException e)
		{
			f=1;
			System.err.println("There was an error= "+e);
			
		}
		catch(Exception e)
		{
			f=1;
			e.printStackTrace();
		}
		if(f==0)
			System.out.println(data);
	}
	private DB()
	{
		
	}
	public static DB createDB()
	{
		if(created)
			return currentDB;
		else
		{
			created = true;
			DB db = new DB();
			currentDB = db;
			return db;
		}
	}
	public void destroyDB()
	{
		created = false;
		currentDB = null;
	}
	public static void main(String []args)
	{
		DB db = DB.createDB();
		db.createFile("arisglobal", "localhost", "password");
		ArrayList<String> fields = new ArrayList<String>();
		fields.add("user");
		fields.add("password");
		fields.add("url");
		db.readFile(fields);
	}

}
