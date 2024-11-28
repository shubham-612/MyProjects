package Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Durationbetween {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 1st date in YYYY-MM-DD");
		String str1="2024-01-01T08:00";
		System.out.println("Enter 2nd date in YYYY-MM-DD");
		String str2="2024-01-01T10:45";
		LocalDateTime ld1=LocalDateTime.parse(str1);
		LocalDateTime ld2=LocalDateTime.parse(str2);
		Duration d=Duration.between(ld1, ld2);
		System.out.print(d.toHoursPart()+"hours,");
		System.out.print(d.toMinutesPart()+"minutes,");
		System.out.println(d.toSecondsPart()+"seconds");
		kb.close();
	}

}
