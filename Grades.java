package training;

public class Grades {
	public char retGrade(int phy,int chem,int math)
	{
		double percent = (phy+chem+math)/3.0;
		if(percent>0 && percent < 50)
			return 'F';
		else if(percent >=50 && percent<60)
			return 'E';
/*
		else if(percent >=60 && percent<70)
			return 'D';
*/

		else if(percent >=65 && percent<70)
			return 'D';
		else if(percent >=70 && percent<80)
			return 'C';

		else if(percent >=80 && percent<90)
			return 'B';

		else if(percent >=90 && percent<=100)
			return 'A';
		else
			return 'X';
	}

}
