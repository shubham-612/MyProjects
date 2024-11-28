package COM.CG.LAMDA;

import java.util.ArrayList;
import java.util.List;

public class Add{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate ad =  (a,b) ->{return (a+b);};
		System.out.println(ad.add(5,10));
		
		List<String> l1 = new ArrayList<>();
		l1.add("Hello");
		l1.add("Capgeimini");
		
		l1.forEach((x)-> System.out.println(x));
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Hello");
		l2.add("Fresher");
		
		l2.forEach((x)-> System.out.println(x));

		
	}
}
