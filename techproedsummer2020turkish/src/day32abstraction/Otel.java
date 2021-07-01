package day32abstraction;

public abstract class Otel {
	
	String odaAdi;
	
	Otel(){
		
		
	}
	
	Otel(String odaAdi){
		this.odaAdi=odaAdi;
	}
	
	
	
	public abstract void kahvalti();
	
	public int wifi(int kisiSayisi) {
		
		return kisiSayisi*2;
	}

	public static void main(String[] args) {
		

	}

}
