package polimorfizm;

public class Hayvan {

	private String isim;
	
	public Hayvan() {
		
		System.out.println("aaa");
	}

	public Hayvan(String isim) {    //Constructor
		this.isim = isim;
	}
	
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String konus() {       //Method
		
		return "Hayvan konusuyor...";
		
	}
	
	public static void konustur(Hayvan hayvan) {  //Method
		
		System.out.println(hayvan.konus());
	}
	
	public static void main(String[]args) {
		
		Hayvan hayvan1 = new Kedi("Tekir");
	
		
		
	
		
		
	}
	
	

}
