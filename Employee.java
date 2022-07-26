package training;

public class Employee extends Person {
	private int empid;
	private String companyname;
public Employee(int id,String name,String company)
{
	super(name);
	this.empid = id;
	this.companyname = company;
}
@Override
public String toString() {
	return "Name of Employee= "+super.name+", Employee Id= "+this.empid+", Name of company= "+this.companyname;
}

}
