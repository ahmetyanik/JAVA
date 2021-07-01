package polimorfizm2;

public class Kedi extends Hayvan{

	public Kedi(String isim) {
		super(isim);
	
	}
	
	public String konus() {
		return this.getIsim()+" miyavliyor...";
	}
	
	

}
