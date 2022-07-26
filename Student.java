package training;

public class Student extends Person {
	private int rollno;
	private String collegename;
public Student(int roll,String name,String college)
{
	super(name);
	rollno = roll;
	collegename = college;
}
@Override
public String toString() {
	return "Name of Student="+super.name+",Roll Number="+this.rollno+", College name="+this.collegename;
}

}
