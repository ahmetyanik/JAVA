package arabaprojesiday6;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car() {
		
	}
	
	public Car(String model,int year) {
		this.model=model;
		this.year=year;
	}
	
	public String arabaMarkasi() {
		return make;
	}
	
	public String arabaModeli() {
		return model;
	}
	
	public int arabaYear() {
		return year;
	}
	



}
