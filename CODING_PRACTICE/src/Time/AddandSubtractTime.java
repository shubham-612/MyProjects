package Time;


import java.time.LocalDateTime;
import java.util.Scanner;

public class AddandSubtractTime {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 1st date in YYYY-MM-DD");
		String str=kb.nextLine();
		LocalDateTime ls=LocalDateTime.parse(str);
		LocalDateTime l=ls.plusDays(5);
		LocalDateTime m=l.minusMonths(1);
		LocalDateTime n=m.plusHours(12);
		System.out.println(n);
}
}
