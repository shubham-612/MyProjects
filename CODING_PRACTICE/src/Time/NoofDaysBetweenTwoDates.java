package Time;

import java.time.LocalDate;
import java.util.Scanner;

public class NoofDaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 1st past date in YYYY-MM-DD");
		String str1=kb.nextLine();
		System.out.println("Enter 2nd current date in YYYY-MM-DD");
		String str2=kb.nextLine();
		LocalDate prev=LocalDate.parse(str1);
		LocalDate curr=LocalDate.parse(str2);
		System.out.println(curr.getDayOfYear()-prev.getDayOfYear());
		kb.close();
	}

}
