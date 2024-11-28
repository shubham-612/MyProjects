package COM.CG.LAMDA;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

public class Person {
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> p = new ArrayList<>();
		Person p1 = new Person("Shubham", 22);
		Person p2 = new Person("Soum", 23);
		
		p.add(p1);
		p.add(p2);
		
		for(Person l:p)
		{
			System.out.println(l);
		}
		
		p.forEach((x)->{System.out.println(x);});
		
//		Collections.sort(p, new Comparator<Person>() {
//			compare(Person p1, Person p2) {
//				p1.name.compareTo(p2.name);
//			}
//		};
	}

}
