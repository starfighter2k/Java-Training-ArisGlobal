package training;

public class ExpressionController {
public static void main(String []args)
{
	Expression exp = new Expression("{[{}]}");
	if(exp.isValid())
		System.out.println("The expression is valid.");
	else
		System.out.println("The expression is invalid.");
	exp.setExpression("{{]");
	if(exp.isValid())
		System.out.println("The expression is valid.");
	else
		System.out.println("The expression is invalid.");
}
}
