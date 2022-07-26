package JavaIO;

public class InvalidFileException extends Exception {
	private String msg;
	public InvalidFileException(String s)
	{
		this.msg = s;
	}
	public String toString()
	{
		return this.msg;
	}
}
