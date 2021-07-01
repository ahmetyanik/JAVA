package day16overloading;

public class Car {

	int price;
	String make;
	String model;
	

public Car() {
	this.price=2000;
	this.make="Honda";
	this.model="Accord";
	
}
	
	public Car(int price, String make, String model) {
		this.price=price;
		this.make= make;
		this.model=model;		
		
	}
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.price);
		System.out.println(car1.model);
		System.out.println(car1.make);
		
		Car car2 = new Car(5000, "Audi", "Q5");
		System.out.println(car2.price);
		System.out.println(car2.model);
		System.out.println(car2.make);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
