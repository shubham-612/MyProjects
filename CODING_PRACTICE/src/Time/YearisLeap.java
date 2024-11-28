package Time;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class YearisLeap {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 1st date in YYYY-MM-DD");
		String str1=kb.nextLine();
		LocalDate prev=LocalDate.parse(str1);
		int s=prev.getYear();
		if(Year.isLeap(s))
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not a leap year");
		}
		kb.close();

	}

}
