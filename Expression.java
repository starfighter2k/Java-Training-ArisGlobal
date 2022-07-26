package training;

public class Expression {
	private String expression;
	private int len;
	private char mirrorBracket(char bracket)
	{
		if(bracket == '[')
			return ']';
		else if(bracket == '(')
			return ')';
		else if(bracket == '{')
			return '}';
		else 
			return ' ';
	}
	public Expression(String exp)
	{
		this.expression = exp;
		this.len = exp.length();
	}
	public Expression()
	{
		this.expression = "";
		this.len = 0;
	}
	public void setExpression(String exp)
	{
		this.expression = exp;
		this.len = exp.length();
	}
	public boolean isValid()
	{
		Stck stack = new Stck(len);
		char ch;
		stack.push(this.expression.charAt(0));
		for(int i=1;i<this.len;i++)
		{
			ch = this.expression.charAt(i);
			if(ch=='{'||ch=='['||ch=='('||ch=='}'||ch==']'||ch==')') {
			if(ch == mirrorBracket(stack.peek()))
				stack.pop();
			else
				stack.push(ch);}
		}
		return stack.isEmpty();
	}
}
