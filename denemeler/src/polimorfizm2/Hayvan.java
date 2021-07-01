package polimorfizm2;

public class Hayvan {
	
	private String isim = "Corc";
	
	public Hayvan() {
		
		
	}
	

	public Hayvan(String isim) {
		this.isim=isim;	
		System.out.println(this.isim);
	}
	
	

	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	public String konus() {           //method
		
		return  this.getIsim()+" konusuyor...";
	}




	public static void main(String[] args) {
		
	Hayvan hayvan1 = new Hayvan("Boncuk");
	Hayvan hayvan2 = new Kedi("Tekir");
	Hayvan hayvan3 = new Köpek("Karabas");
	Hayvan hayvan4 = new At("Nazli");
	
	System.out.println(hayvan3.konus());
		

	}

}
