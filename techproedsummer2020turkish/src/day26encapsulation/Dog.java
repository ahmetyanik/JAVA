package day26encapsulation;

public class Dog extends Mammal{
	
	public boolean sadik = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		System.out.println("Animal Class'dan geldi: "+dog.age);
		System.out.println("Animal Class'dan geldi: "+dog.name); //null
		dog.eat();//cikti: yemek yer  animaldan geldi
		dog.move();// Hareket edebiliyor
		
		System.out.println(dog.dogum); //true  mammal'den geldi
		dog.feed(); //Cocuklarini besler  mammal'den geldi
		
		System.out.println(dog.sadik);// true  dog'dan geldi
		dog.bark(); // Köpek havlar   dog'dan geldi
		
		
	}

	
	public void bark() {
		System.out.println("Köpek havlar");
	}
}
