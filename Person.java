package training;

public class Person {
protected String name;
protected Person(String name)
{
	this.name = name;
}
@Override
public String toString() {
	return "Person name = "+this.name;
}

}
