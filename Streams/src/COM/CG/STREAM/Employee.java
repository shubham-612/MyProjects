package COM.CG.STREAM;

public class Employee {
	
	 int id;
	 String name; 
	// int age;
	 double salary;  
	String gender;
	 String deptName;	   
	// String city;	   
	 //int yearOfJoining;
	 
	public Employee(int id, String name, double salary, String gender, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", deptName="
				+ deptName + "]";
	}


}
