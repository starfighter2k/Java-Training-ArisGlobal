
public class Student extends Person{
	private int id;
	public Student()
	{
		super();
	}
	public Student(String name,int studentId)
	{
		super(name);
		this.id = studentId;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void getDetails() {
		System.out.println("Student "+this.getName()+" with id "+this.getId());
		
	}
	
}
