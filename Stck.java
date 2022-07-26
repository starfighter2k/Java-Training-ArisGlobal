package training;

public class Stck {
	private char[] stck;
	private int size;
	private int top;
	public Stck(int size)
	{
		this.size = size;
		this.top = -1;
		this.stck = new char[size];
	}
	public char peek()
	{
		return stck[top];
	}
	public void push(char val)
	{
		if(this.top>=this.size)
		{
			System.out.println("Can't add more values to full stack");
		}
		else
		{
		this.top++;
		this.stck[this.top] = val;
		}
	}
	public char pop()
	{
		if(this.top!=-1)
		{
			char res = this.stck[this.top];
			this.stck[this.top] = ' ';
			this.top--;
			return res;
		}
		else
		{
			System.out.println("Empty stack. Can't remove values");
			return ' ';
		}
	}
	public boolean isEmpty()
	{
		if(this.top==-1)
		{
			return true;
		}
		else
			return false;
	}
}
