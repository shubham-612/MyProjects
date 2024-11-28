package Time;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormattr {

	public static void main(String[] args) {
		LocalDateTime ld=LocalDateTime.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format=ld.format(d);
		System.out.println(format);

	}

}
