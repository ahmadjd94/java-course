package person; //namespace

public class Application {
	public static void main(String[] args) {
		Person x = new Person("yazan",15);
		x.getName();
		Employee y = new Employee("yazeed", 25, 33);
		
		
		System.out.println(y.getAge());
		System.out.println(y.getName());

		
//		System.out.println(x.job());
		System.out.println(y.job());
	}
}
