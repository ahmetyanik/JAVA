
public class PcMuhendisi implements IMühendis {
	
	private boolean askerlik;
	private boolean adli_sicil;
	
	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		super();
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlikDurumuSorgula() {
		
		
		if(askerlik) {
			
			System.out.println("Askerligimi yaptim.");
		}else {
			
			System.out.println("Askerligimi henüz yapmadim.");
		}
		
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		
		return "Ortalamam: "+ derece;
	}

	@Override
	public void adliSicilSorgula() {
		
	if(adli_sicil) {
		
		System.out.println("Adli Sicil Kaydim Bulunuyor.");
	}else {
		
		System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
		
		
	}
	}

	@Override
	public void isTecrübesi(String[] array) {
	
		
		System.out.println("Bilgisayar mühendisi olarak su sirketlerde calistim...");
		
		for(int i = 0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}




}
