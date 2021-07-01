
public class PcMühendisi implements IMühendis{
	
	private boolean askerlik;
	private boolean adliSicil;
	
	

	public PcMühendisi(boolean askerlik, boolean adliSicil) {
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
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
		
		return "Ortalamam "+ derece;
		
	}

	@Override
	public void adliSicilSorgula() {
		
		if(adliSicil) {
			
			System.out.println("Adli sicil kaydim bulunuyor.");
		}else {
			System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
		}
	
		
	}

	@Override
	public void isTecrübesi(String[] arr) {
		
		System.out.println("Bilgisayar Mühendisi olarak su sirketlerde calistim...");
		
		for(int i=0;i<arr.length;i++ ) {
			
			System.out.println(arr[i]);
		}
	
		
	}

}
