package person;

public class Employee extends Person {
	int yearOfExperience;
	
	public Employee(String name, int age, int yoe) {
		 super(name, age);
		 this.yearOfExperience = yoe;
	}
	
	@Override
	String job() {
		System.out.println(super.job());
		return "i am an employee at a company";
	}

}
