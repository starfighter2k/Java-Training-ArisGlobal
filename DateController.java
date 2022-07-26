package training;

public class DateController {
	public static void main(String []args)
	{
		DateContainer date1 = new DateContainer();
		DateContainer date2 = new DateContainer();
		date1.setDay(1);
		date1.setMonth(1);
		date1.setYear(2009);
		date2.setDay(31);
		date2.setMonth(2);
		date2.setYear(2009);
		int res = date1.diffDates(date2);
		System.out.println("Number of days in the middle="+res);
	}

}
