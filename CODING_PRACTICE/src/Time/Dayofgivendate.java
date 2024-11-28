package Time;

import java.time.LocalDate;
import java.util.Scanner;

public class Dayofgivendate {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter in yyyy-MM-dd format ");
		String s=kb.nextLine();
		LocalDate birthdate = LocalDate.parse(s);//parse input sttring to birthdate
		System.out.println(birthdate.getDayOfWeek());
		kb.close();
	}

}
