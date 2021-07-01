package arabaprojesiday6;

public class Honda extends Car{
	
	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	
	public Honda() {
		
	}
	
	public Honda(String model, int year) {
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
