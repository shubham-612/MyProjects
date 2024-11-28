package COM.CG.STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("shubham");
		a.add("yasho");
		a.add("soum");
		a.add("kashif");
		a.add("ayush");
		a.add("anurag");
		a.add("aarti");
		a.add("aadhiti");
		
		a.stream()
		 .filter((s)->s.startsWith("a"))
		 .sorted()
		 .map(String::toUpperCase)
		 .forEach(System.out::println);
		
		System.out.println("\n");
		
		a.stream()
		 .sorted()
		 .map(String::toUpperCase)
		 .forEach(System.out::println);	
		
		System.out.println("\n");
		
		boolean result = a.stream()
						  .anyMatch((s)->s.startsWith("b"));
		System.out.println(result);
		
		System.out.println("\n");
		
		List<String> l = a.stream()
		 .sorted()
		 .map(String::toUpperCase)
		 .collect(Collectors.toList());
		System.out.println(l);
		
		System.out.println("\n");
		
		long c = a.stream()
	         	.filter((s)->s.startsWith("a"))
	        	.count();
		System.out.println(c);
		
		System.out.println("\n");
		
		boolean result2 = a.stream()
				  .allMatch((s)->s.startsWith("a"));
		System.out.println(result2);
		
		System.out.println("\n");
		
		boolean result3 = a.stream()
				  .noneMatch((s)->s.startsWith("a"));
		System.out.println(result3);
		
		System.out.println("\n");
		
		List<Integer> d = Arrays.asList(1,1,2,3,3,4,4,5,6,7,7);
		d.stream()
		 .distinct()
		 .forEach(System.out::print);
		
		// PALINDROME CHECK
		Predicate<String> p = str -> {String rev = new StringBuilder(str).reverse().toString();
		return str.equals(rev);
		};
		System.out.println(p.test("YAAY"));
		
	}
}
