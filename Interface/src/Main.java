
public class Main {

	public static void main(String[] args) {
		
		
		//IMühendis mühendis1 = new Mühendis(); // Hata verir
		
		PcMühendisi mühendis1 = new PcMühendisi(false, false);
		
		mühendis1.askerlikDurumuSorgula();
		mühendis1.adliSicilSorgula();
		System.out.println(mühendis1.mezuniyetOrtalamasi(3.07));
		String[] tecrübe = {"Vestel", "Havelsan", "Türksat"};
		
		mühendis1.isTecrübesi(tecrübe);
		
		
		System.out.println("*******************************");
		
		MakineMühendisi mühendis2 = new MakineMühendisi(true, false);
		
		String tecrübe2 [] = {};
		String referans [] = {"Mustafa Murat Coskun", "Serhat Say"};
		
		mühendis2.adliSicilSorgula();
		mühendis2.askerlikDurumuSorgula();
		System.out.println(mühendis2.mezuniyetOrtalamasi(2.31));
		mühendis2.isTecrübesi(tecrübe2);
		mühendis2.referans(referans);
		mühendis2.calis();    //ICalis interface'inden geldi
		
		
		
		
		
		
		

	}

}
