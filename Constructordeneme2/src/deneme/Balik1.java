package deneme;

public class Balik1 extends Hayvan1{
	
	public String ad="Balik adi girilmemis";
	public String tür = "Balik türü girilmemis";
	public int yas ;	
	
	public int getYas() {
		
	if(yas==0) {
		
		System.out.println("Baligin yasi henüz girilmemis.");
	}else if(yas>0) {
		
		this.yas=yas;
	}		
		
		return yas;
	}


	public Balik1(){
		
		System.out.println("Balik Parametresiz constructor");
		
	}
	
	
	public Balik1(String ad) {
		
		this.ad=ad;
		
	}
	
	public Balik1(int yas) {
		
	if(yas==0) {
		
		System.out.println("Baligin yasi henüz girilmemis.");
	}else if(yas>0) {
		
		this.yas=yas;
	}
		
	}
	
	public Balik1(String ad, String tür, int yas) {		
		
		System.out.println("Balik 3 parametreli");
		this.ad=ad;
		this.tür=tür;
		this.yas=yas;
	}
	
	public void bilgiler() {
		
		System.out.println("Baligin Bilgileri: ");
		System.out.println("Ad: "+this.ad);
		System.out.println("Tür: "+this.tür);
		System.out.println("Yas: "+this.yas);
		
	}




}
