/*
Given two dates, find the total number of days between them.
Note: The system follows Gregorian calender from the beginning of time.

 

Example 1:

Input:
d1 = 10, m1 = 2, y1 = 2014
d2 = 10, m2 = 3, y2 = 2015
Output:
393
Explanation:
By counting manually, we find out there
are 393 days between the two dates.
Example 2:

Input:
d1 = 10, m1 = 2, y1 = 2001
d2 = 10, m2 = 2, y2 = 2002
Output:
365
Explanation:
By counting manually, we find out there
are 365 days between the two dates.
*/
class NumberofDaysBetweenTwoDates{
	static int findNumberofDaysBetweenTwoDates(int d1,int m1,int y1,int d2,int m2,int y2){
		return Math.abs(
			find(y1,m1,d1)-find(y2,m2,d2)
		);
	}
	static int find(int year,int month,int day){
		int total=0;
		total+=(year-0)*365;

		for(int i=0;i<year;i+=4){
			if(isLeapYear(i)){
				total++;
			}
		}

		int feb=isLeapYear(year)?29:28;

		switch(month){
			case 12:
				total+=30;
			case 11:
				total+=31;
			case 10:
				total+=30;
			case 9:
				total+=31;
			case 8:
				total+=31;
			case 7:
				total+=30;
			case 6:
				total+=31;
			case 5:
				total+=30;
			case 4:
				total+=31;
			case 3:
				total+=feb;
			case 2:
				total+=31;
			case 1:
				total+=day;
		}

		return total;
	}
	static boolean isLeapYear(int i){
		return (i%4==0) && ((i%400==0 && i%100==0 )||(i%100!=0));
	}
	public static void main(String[] args) {
		int d1 = 10, m1 = 2, y1 = 2014;
		int d2 = 10, m2 = 3, y2 = 2015;
		System.out.println(findNumberofDaysBetweenTwoDates(d1,m1,y1,d2,m2,y2));
	}
}
/*
393
*/