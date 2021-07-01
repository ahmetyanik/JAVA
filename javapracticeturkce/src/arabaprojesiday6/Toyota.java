package arabaprojesiday6;

public class Toyota extends Car{

	protected String make = "Toyota";
	protected String model = "Corolla";
	protected int year = 2009;
	

	public Toyota() {
		
	}

	public Toyota(String model, int year) {
		this.model=model;
		this.year=year;
	}
	
	
	public String arabaMarkasi() {
		
		return make;
	}
	
	public String arabaModeli() {
		
		return model;
	}
	
	public int arabaYili() {
		
		return year;
	}
	
	
	


}
