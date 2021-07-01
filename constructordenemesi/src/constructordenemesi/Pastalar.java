package constructordenemesi;

public class Pastalar {
	
	private String pastaAdi;
	private String pastaT�r�;
	private double pastaFiyati;
	private int pastaMiktari;
	private double pastaKazanci;
	private double pastaMaliyeti;
	

	

	public Pastalar(String pastaAdi, String pastaT�r�, double pastaFiyati, int pastaMiktari,double pastaKazanci,double pastaMaliyeti) {
		
		this.pastaAdi= pastaAdi;
		this.pastaT�r� = pastaT�r�;
		this.pastaFiyati= pastaFiyati;
		this.pastaMiktari= pastaMiktari;		
		this.pastaKazanci= pastaKazanci;
		this.pastaMaliyeti= pastaMaliyeti;
	}
	
	public void pastaSat(int adet) {
		
		if (pastaMiktari<adet){
			
			System.out.println(adet+" adet "+pastaAdi+" bulunmamaktadir."+pastaAdi+" miktarimiz "+pastaMiktari+" adettir.");
					
		}
		else {
		
		this.pastaKazanci =(pastaFiyati*adet);
		pastaMiktari -=adet;
		
		System.out.println("Satilan pasta adedi: "+adet);
		System.out.println("Satilan pastadan elde edilen kazanc: "+pastaKazanci);
		System.out.println("Satilan pastadan elde edilen kar: "+ (pastaKazanci-pastaMaliyeti*adet));
		System.out.println("Kalan pasta miktari: "+pastaMiktari);
		
	}}	


	public void pastaEkle(int adet) {
				
		pastaMiktari +=adet;
		pastaMaliyeti = adet*pastaMaliyeti;
		

		System.out.println("Eklenen pasta adedi: "+adet);
		System.out.println("Eklenen pasta icin �denen �cret: "+pastaMaliyeti);
		System.out.println("G�ncel pasta miktari: "+pastaMiktari);
		
		
	}
	
	public double getPastaMaliyeti() {
		System.out.println(pastaAdi+"'nin birim maliyeti "+pastaMaliyeti+" Tl'dir.");
	return pastaMaliyeti;
	}

	public void setPastaMaliyeti(double pastaMaliyeti) {
	this.pastaMaliyeti = pastaMaliyeti;
	}
	public double getPastaKazanci() {
		return pastaKazanci;
	}

	public void setPastaKazanci(double pastaKazanci) {
		this.pastaKazanci = pastaKazanci;
	}
	public String getPastaAdi() {
		return pastaAdi;
	}
	public void setPastaAdi(String pastaAdi) {
		this.pastaAdi = pastaAdi;
	}
	public String getPastaT�r�() {
		System.out.println(pastaAdi+"nin t�r� "+pastaT�r�+"dir.");
		return pastaT�r�;
	}
	public void setPastaT�r�(String pastaT�r�) {
		this.pastaT�r� = pastaT�r�;
	}
	public double getPastaFiyati() {
		return pastaFiyati;
	}
	public void setPastaFiyati(double pastaFiyati) {
		this.pastaFiyati = pastaFiyati;
	}
	public int getPastaMiktari() {
		return pastaMiktari;
	}
	public void setPastaMiktari(int pastaMiktari) {
		this.pastaMiktari = pastaMiktari;
	}
	
	
	
	
	
	
	

}
