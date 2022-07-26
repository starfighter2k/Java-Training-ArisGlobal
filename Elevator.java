package training;
public class Elevator {
	private int dispFloor(int floor,int targetFloor)
	{
		if(floor > targetFloor)
		{
			for(int i=floor-1;i>=targetFloor;i--) {
				for(double j=0;j<Integer.MAX_VALUE;j+=0.95) {
//					System.out.println("Delay!");
				}
				System.out.println("Floor "+i+" reached");
				}
			return targetFloor;
		}
		else if(floor < targetFloor)
		{
			for(int i=floor+1;i<=targetFloor;i++) {
				for(double j=0;j<Integer.MAX_VALUE;j+=0.95);
				System.out.println("Floor "+i+" reached");
				}
			return targetFloor;
		}
		else {
			System.out.println("You are already on your floor");
			return targetFloor;}
	}
	public int rideLift(int floor,int target)
	{
		System.out.println("Currently at "+floor+" floor");
		if(floor > target)
		{
			System.out.println("Going down");
		}
		else if(floor < target)
		{
			System.out.println("Going Up");
		}
		int res = dispFloor(floor,target);
		System.out.println("You have reached your destination");
		return res;
		}
	public static void main(String[]args)
	{
		Elevator ele = new Elevator();
		int res = ele.rideLift(0, 10);
		System.out.println("Ride complete");
	}
}
