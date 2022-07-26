package training;

public class DateContainer {
	private int day;
	private int month;
	private int year;
	private int monthDays[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	public DateContainer()
	{
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private boolean isLeapYear(int yr)
	{
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
					return true;
				return false;
			}
			return true;
		}
		return false;
	}
	private int daysFromStartOfYear()
	{
		if(isLeapYear(this.year))
			this.monthDays[1] = 29;
		int res=0;
		for(int i=0;i<this.month;i++)
		{
			res += this.monthDays[i];
		}
		return res+this.day;
	}
	public int diffDates(DateContainer date)
	{
		int res=0;
		if(this.year < date.year)
		{
			for(int i=this.year;i<date.year;i++)
			{
				res += (isLeapYear(i)?366:365); 
			}
			res = res - this.daysFromStartOfYear() + date.daysFromStartOfYear();
		}
		else if(this.year > date.year)
		{
			for(int i=date.year;i<this.year;i++)
			{
				res += (isLeapYear(i)?366:365); 
			}
			res = res - date.daysFromStartOfYear() + this.daysFromStartOfYear();
		}
		else
		{
			res = (this.daysFromStartOfYear()>=date.daysFromStartOfYear())?(this.daysFromStartOfYear()-date.daysFromStartOfYear()):(date.daysFromStartOfYear()-this.daysFromStartOfYear());
		}
		return res;
	}

}
