package denemeler;

public class Mammal extends Animal{
	
	public Mammal(int age) {
		super();
		System.out.println("Child Constructor called by this()");
	}

	public Mammal() {
		this(11);
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal(15);

	}

}
