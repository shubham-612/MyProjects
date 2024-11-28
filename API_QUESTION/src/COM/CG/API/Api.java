package COM.CG.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Api {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date currentdate = new Date();
		System.out.println(currentdate);
		
		String date = "2024-10-10";
		SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd");
		Date doj = day.parse(date);
		System.out.println(doj);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a");
	    String formattedDate = sdf2.format(currentdate);
	    System.out.println("Formatted Date: " + formattedDate);
	    
	    Calendar c = Calendar.getInstance();
	    
	    //c.set(2024, Calendar.JANUARY, 30);
	    
	    SimpleDateFormat day1 = new SimpleDateFormat("yyyy-MM-dd");
	    
	    System.out.println(day1.format(c.getTime()));

	    System.out.println(day1.format(c.getTimeInMillis()));
	    
	    c.add(c.DAY_OF_MONTH, 30);
	    c.add(c.DAY_OF_MONTH, -10);
	    
	    System.out.println(day1.format(c.getTime()));
	    System.out.println(c.get(c.YEAR));
	    System.out.println(c.get(c.MONTH));
	    System.out.println(c.get(c.DAY_OF_WEEK));
	}

}
