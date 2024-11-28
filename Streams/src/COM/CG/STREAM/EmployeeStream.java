package COM.CG.STREAM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		List<Employee> emp = new ArrayList<>();
		Employee e1  =  new Employee(1, "Shubham", 50000,"M", "HR");
		Employee e2  =  new Employee(2, "Soum", 40000,"M" ,"MANAGER");
		Employee e3  =  new Employee(3, "Aarti", 30000, "F", "HR");
		Employee e4  =  new Employee(4, "Yasho", 200000,"M", "PEON");
		Employee e5  =  new Employee(5, "Aditi", 5000, "F", "Sales"); 
		
		// MAXIMUM SALARY
		Employee hremp0 = emp.stream()
							.max((emp1,emp2)->Double.compare(emp1.salary, emp2.salary))
							.orElse(null);
		System.out.println("employee detail whose salary is maximum : " + hremp0);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		// DISPLAY EMPLOYEE DETAILS WHOSE DEPT IS HR
		List<Employee> hremp = emp.stream()
								   .filter(x->"HR".equals(x.deptName))
								   .collect(Collectors.toList());
		hremp.forEach(System.out::println);
		
		// DISPLAY ALL EMPLOYEE NAME 
		List<String> hremp1 = emp.stream()
								.map(x->(x.name))
								.collect(Collectors.toList());
		hremp1.forEach(System.out::println);
		
		//DISPLAY EMPLOYEE DETAILS ACCORDING TO THEIR SALARY IN ASCENDING ORDER
		List<Employee> hremp2 = emp.stream()
									.sorted((emp1,emp2)->Double.compare(emp1.salary, emp2.salary))
									.collect(Collectors.toList());
		hremp2.forEach(System.out::println);

		//DISPLAY EMPLOYEE DETAILS ACCORDING TO THEIR SALARY IN DESCENDING ORDER
		List<Employee> hremp3 = emp.stream()
									.sorted((emp1,emp2)->Double.compare(emp2.salary, emp1.salary))
									.collect(Collectors.toList());
		hremp3.forEach(System.out::println);
		
		// DISPLAY ALL EMPLOYEES
		List<Employee> hremp4 = emp.stream()
				   					.collect(Collectors.toList());
		hremp4.forEach(System.out::println);
		
		// TOTAL SALARY
		// REDUCE OPERATION PERFORM REDUCTION ON ELEMENTS OF STREAM USING ASSOCIATE FUNCTION.
		Double hremp5 = emp.stream()
				   			.map(x->(x.salary))
				   			.reduce(0.0,Double::sum);
		System.out.println("Total Salary is : " + hremp5);
		
		// DISPLAY ALL DEPARTMENTS
		List<String> hremp6 = emp.stream()
								 .map(x->(x.deptName))
								 .distinct()
								 .collect(Collectors.toList());
		hremp6.forEach(System.out::println);
		
		// TOP 3 NAME OF THE EMPLOYEE
		List<Employee> hremp7 = emp.stream()
								.limit(3)
								.collect(Collectors.toList());
		hremp7.forEach(System.out::println);
		
		// TOP 3 SALARY AFTER SORT IN DESCENDING ORDER
		List<Employee> hremp8 = emp.stream()
									.sorted((emp1,emp2)->Double.compare(emp2.salary, emp1.salary))
									.limit(3)
									.collect(Collectors.toList());
		hremp8.forEach(System.out::println);
		
		// ALL EMPLOYEE DETAILS EXCEPT TOP 2
		System.out.println("All employee detail except top 2");
		List<Employee> hremp9 = emp.stream()
									.skip(2)
									.collect(Collectors.toList());
		hremp9.forEach(System.out::println);
		
		// 
		System.out.println("All employee detail whose dept is not sales");
		boolean hremp10 = emp.stream()
							 .noneMatch(x->"sales".equals(x.deptName));
		System.out.println(hremp10);
		
		//
		System.out.println("All employee detail whose dept is in sales");
		boolean hremp11 = emp.stream()
							 .allMatch(x->"sales".equals(x.deptName));
		System.out.println(hremp11);
		
		//
		System.out.println("All employee detail whose dept is peon");
		boolean hremp12 = emp.stream()
							 .anyMatch(x->"PEON".equals(x.deptName));
		System.out.println(hremp12);
		
		// MAXIMUM SALARY
		Optional<Employee> hremp13 = emp.stream()
										.max((emp1,emp2)->Double.compare(emp1.salary, emp2.salary));
		System.out.println("\nemployee detail whose salary is maximum : " + hremp13);
		
		// MINIMUM SALARY
		Optional<Employee> hremp14 = emp.stream()
										.min((emp1,emp2)->Double.compare(emp1.salary, emp2.salary));
		System.out.println("\nemployee detail whose salary is minimum : " + hremp14);
		
		// FIND FIRST EMPLOYEE DETAIL
		Employee hremp15 = emp.stream()
									.findFirst()
									.orElse(null);
		System.out.println("\nFirst employee detail : " + hremp15);
		
		// FIND MAXIMUM SALARY 
		double hremp16 = emp.stream()
				.map(x->(x.salary))
				.distinct()
				.sorted(Comparator.reverseOrder())
				.findFirst()
				.orElse(null);
		System.out.println("\nMaximum salary is : " + hremp16);
		
		// sort according to salary and then to id and display all employee
		List<Employee> hremp17 = emp.stream()
				.sorted(Comparator.comparing(x->(x.salary)))
				.sorted(Comparator.comparing(y->(y.id)))
				.collect(Collectors.toList());
		hremp17.forEach(System.out::println);
		
		//
		Optional<String> o = Optional.empty();
		System.out.println(o.isPresent());
		System.out.println(o.isEmpty());
		//System.out.println(o.get());
		
		System.out.println("Female Employees are");
		List<Employee> hremp18 = emp.stream()
									.filter(x->"F".equals(x.gender))
									.collect(Collectors.toList());
		hremp18.forEach(System.out::println);
		
		System.out.println("Male Employees are");
		List<Employee> hremp19 = emp.stream()
									.filter(x->"M".equals(x.gender))
									.collect(Collectors.toList());
		hremp19.forEach(System.out::println);
		
		
		System.out.println("Male highest Employee salary are");
		List<Employee> hremp20 = emp.stream()
									.filter(x->"M".equals(x.gender))
									.sorted((emp1,emp2)->Double.compare(emp2.salary, emp1.salary))
									.limit(1)
									.collect(Collectors.toList());
		hremp20.forEach(System.out::println);
		
		System.out.println("Female highest Employee salary are");
		List<Employee> hremp21 = emp.stream()
									.filter(x->"F".equals(x.gender))
									.sorted((emp1,emp2)->Double.compare(emp2.salary, emp1.salary))
									.limit(1)
									.collect(Collectors.toList());
		hremp21.forEach(System.out::println);
		
		double ma = emp.stream()
						.filter(x->"M".equals(x.gender))
						.map(x->(x.salary))
						.distinct()
						.sorted(Comparator.reverseOrder())
						.findFirst()
						.orElse(null);
		System.out.println("Maximum male : " + ma);
		
		double fa = emp.stream()
				.filter(x->"F".equals(x.gender))
				.map(x->(x.salary))
				.distinct()
				.sorted(Comparator.reverseOrder())
				.findFirst()
				.orElse(null);
		System.out.println("Maximum female : " + fa);
				
		System.out.println("Average salary is : " + (ma+fa)/2);
		
		
		
		
	}
}