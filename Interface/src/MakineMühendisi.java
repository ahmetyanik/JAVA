
public class MakineMühendisi implements IMühendis,ICalisma{
	
	private boolean askerlik;
	private boolean adliSicil;
	
	

	public MakineMühendisi(boolean askerlik, boolean adliSicil) {
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
		
		if(arr.length==0) {
			
			System.out.println("Herhangi bir isi tecrübem bulunmamaktadir.");
		}else {
			System.out.println("Makine Mühendisi olarak su sirketlerde calistim...");
			
			for(int i=0; i<arr.length;i++) {
				
				System.out.println(arr[i]);
				
			}
			
			
		}
		
		
	}
	
	public void referans(String arr[]) {
		
		if(arr.length==0) {
			
			System.out.println("Herhangi bir referansim bulunmuyor.");
			
		}else {
			
			System.out.println("Referanslarim...");
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]);
				
			}
		}
		
	}

	@Override
	public void calis() {
		
		System.out.println("Makine Mühendisi calisiyor...");
		
	}
	

}
