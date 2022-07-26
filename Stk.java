
public class Stk {
	private int size;
	private int[]stk;
	private int top;
	public Stk(int size) throws StkException
	{
		if(size > 10)
			throw new StkException("Too big value for size");
		else if(size<=0)
			throw new StkException("Too small value for size");
		this.size = size;
		this.stk = new int[size];
		this.top=0;
	}
	public void push(int x) throws StkException
	{
		if(top == size-1)
			throw new StkException("Stack Overflow");
		stk[top++] = x;
	}
	public int pop() throws StkException
	{
		if(top == 0)
			throw new StkException("Stack underflow");
		return stk[--top];
	}
	public static void main(String[]args)
	{
		try {
		Stk stackSmall = new Stk(-1);}
		catch(StkException s)
		{
			System.err.println(s);
		}
		try {
			Stk stackBig = new Stk(11);
		}
		catch(StkException s)
		{
			System.err.println(s);
		}
		
	}
}
