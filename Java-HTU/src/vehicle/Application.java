package vehicle;

public class Application {
	public static void main(String[] args) {
		Vehicle bmw = new Car();
		Truck volvo = new Truck();
		
		System.out.println(bmw.ignitionMethod());
		System.out.println(bmw.maximumSpeed());
		System.out.println("-------");
		System.out.println(volvo.ignitionMethod());
		System.out.println(volvo.maximumSpeed());
	}
	
}
