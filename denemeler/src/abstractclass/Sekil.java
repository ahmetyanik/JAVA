package abstractclass;

public abstract class Sekil {
	
	private String isim;

	public Sekil(String isim) {
		this.isim = isim;
	}
	
	public void objeIsmi() {
		
		System.out.println("Bu sekil "+isim+" objesidir.");
	}
	
	abstract void alan();

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	

}
