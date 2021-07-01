package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		
		System.out.println(cat.age);
		System.out.println(cat.name);
		cat.eat();
		cat.move();
		
		System.out.println(cat.dogum);
		cat.feed();
		
		System.out.println(cat.clean);
		cat.meow();
		
		

	}

	public void meow() {
		System.out.println("Kediler miyavlar");
	}
	
	
}
