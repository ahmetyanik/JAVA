package polimorfizm;

public class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);
		
	}

	/*
	public String konus() {           // Override edilmis konus methodu(orijinal hali)
		return super.konus();
	}   */
	
	public String konus() {           // Override edilmis konus methodu(özellestirilmis hali)
		return this.getIsim()+" miyavliyor...";
	}
	
	

}
