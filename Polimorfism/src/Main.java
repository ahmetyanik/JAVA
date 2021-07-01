class Hayvan {
	
	private String isim;

	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	
	public String konus() {
		
		return "Hayvan konusuyor...";		
		
	}
	
	public String ömür() {
		
		return "Hayvanlarin farkli ömür s�releri vardir."; 
	}
	
	
}
	class Kedi extends Hayvan {
		

	public Kedi(String isim) {
		super(isim);

	}


	public String konus() {
		return this.getIsim()+" miyavliyor...";
	}


	public String ömür() {
		return this.getIsim()+" 20 yil yasiyor." ;
	}
	
	
	
	
	
	}
	class Köpek extends Hayvan{

		public Köpek(String isim) {
			super(isim);
					
		
	}

		@Override
		public String konus() {	
			return this.getIsim()+" havliyor...";
		}
	}
	class At extends Hayvan{

		public At(String isim) {
			super(isim);
	
		}

		@Override
		public String konus() {
			return this.getIsim()+" kisniyor...";
		}	
	}	

public class Main{
	
	public static void konustur(Hayvan hayvan) {
		System.out.println(hayvan.konus());
	}
	
	public static void main(String[]args) {
		
		Hayvan hayvan1 = new Köpek("Karabas");
		Hayvan hayvan2 = new Kedi("Tekir");
		Hayvan hayvan3 = new At("Sahbatur");
		Hayvan hayvan4 = new Hayvan("Ari");
		Hayvan hayvan5= new Kedi("Pamuk");
		Hayvan hayvan6= new At("Yarmag�l");
		
		
		
		System.out.println(hayvan1.konus());
		System.out.println(hayvan2.konus());
		System.out.println(hayvan3.konus());
		System.out.println(hayvan4.ömür());
		System.out.println(hayvan5.ömür());  // kediye ömür süresi atadigimiz icin Hayvan s�per classindaki ömür süresini es gecti ve kedi classindaki ömür� uyguladi.
		System.out.println(hayvan6.ömür()); //ata ömür süresi uygulamadigimiz icin hayvan s�per classindaki ömür süresini uyguladi
		
		System.out.println("************************");
		
		konustur(new Kedi("Mavis"));
		konustur(new Köpek("Akbas"));
		konustur(new At("Esengül"));
		konustur(new Köpek("Saribas"));
		
		

		
		
		
	}	
	
}
