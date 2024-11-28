package Time;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateofYear {
	public static void main(String []args)
	{
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter in yyyy-MM-dd format ");
		String s=kb.nextLine();
		LocalDate birthdate = LocalDate.parse(s);//parse input sttring to birthdate
//		System.out.println(birthdate.getDayOfWeek());
		LocalDate currentdate = LocalDate.now();//parse input sttring to currentdate
        Period age=Period.between(birthdate, currentdate);//getting difference between date
        System.out.println("your age is : "+age.getYears());
        kb.close();
	}

}
