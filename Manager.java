package training;

public class Manager extends Employee {
	private int numSub;
	public Manager(String name,String company,int subs,int id)
	{
		super(id,name,company);
		this.numSub = subs;
	}
	@Override
	public String toString() {
		return "Manager has name="+super.name+"manager has "+this.numSub+"working under him";
	}
	

}
