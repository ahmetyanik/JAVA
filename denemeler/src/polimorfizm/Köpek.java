package polimorfizm;

public class Köpek extends Hayvan{

	public Köpek(String isim) {
		super(isim);
		
	}

	
	public String konus() {                   //Override edilen konus methodu
		return this.getIsim()+" havliyor";
	}
	
	

}
