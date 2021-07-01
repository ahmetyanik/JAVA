package polimorfizm2;

public class Köpek extends Hayvan{

	public Köpek(String isim) {
		super(isim);
		
	}

	public String konus() {
		return this.getIsim()+" havliyor...";
		
	}
	
	
}
