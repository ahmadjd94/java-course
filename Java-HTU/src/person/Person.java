package person; //namespace

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	String job() {
		return "I love eating";
	}

	public String getName() {
		return this.name;
	}	
	public int getAge() {
		return this.age;
	}
}
