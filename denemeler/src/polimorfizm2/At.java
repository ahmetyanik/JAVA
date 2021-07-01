package polimorfizm2;

public class At extends Hayvan{

	
	public At() {
		
		
	}
	
	public At(String isim) {
		super(isim);
		
	}
	
	public String konus() {
		
		return this.getIsim() + " kisniyor...";
	
		
	} 
	
	public static void main(String[] args) {
		
		At at1 = new At("Can");
		At at2 = new At("Canan");
		At at3 = new At();
		
		Hayvan hayvan1 = new Hayvan();
	
		System.out.println(at3.getIsim());
		
		
	}

}
