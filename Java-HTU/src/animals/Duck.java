package animals;

public class Duck implements Animal{
	String name; //property
	public String sound() { //method
		return "quack";
	}
	
	public String movement() {
		return "fly";
	}
}
